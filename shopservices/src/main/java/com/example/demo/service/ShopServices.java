package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Shop;
import com.example.demo.repo.ShopRepo;

	
	@Service
	public class ShopServices {
	    @Autowired
	    private ShopRepo shopRepository;

	    public List<Shop> getAllShops() {
	        return shopRepository.findAll();
	    }

	    public Optional<Shop> getShopById(Long id) {
	        return shopRepository.findById(id);
	    }

	    public Shop saveShop(Shop shop) {
	        return shopRepository.save(shop);
	    }

	    public void deleteShop(Long id) {
	        shopRepository.deleteById(id);
	    }
	}


