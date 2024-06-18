package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Shop;
import com.example.demo.service.ShopServices;

@RestController
	@RequestMapping("/api/shops")
	public class ShopController {
	    @Autowired
	    private ShopServices shopService;

	    @GetMapping
	    public List<Shop> getAllShops() {
	        return shopService.getAllShops();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Shop> getShopById(@PathVariable Long id) {
	        Optional<Shop> shop = shopService.getShopById(id);
	        return shop.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    @PostMapping
	    public Shop createShop(@RequestBody Shop shop) {
	        return shopService.saveShop(shop);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Shop> updateShop(@PathVariable Long id, @RequestBody Shop shopDetails) {
	        Optional<Shop> shopOptional = shopService.getShopById(id);
	        if (!shopOptional.isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        Shop shop = shopOptional.get();
	        shop.setName(shopDetails.getName());
	        shop.setLocation(shopDetails.getLocation());
	        shop.setAbout(shopDetails.getAbout());
	        Shop updatedShop = shopService.saveShop(shop);
	        return ResponseEntity.ok(updatedShop);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteShop(@PathVariable Long id) {
	        if (!shopService.getShopById(id).isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        shopService.deleteShop(id);
	        return ResponseEntity.noContent().build();
	    }
	}


