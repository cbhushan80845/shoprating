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

import com.example.demo.model.Rating;
import com.example.demo.service.RatingService;

@RestController
	@RequestMapping("/api/ratings")
	public class RatingController {
	    @Autowired
	    private RatingService ratingService;

	    @GetMapping
	    public List<Rating> getAllRatings() {
	        return ratingService.getAllRatings();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Rating> getRatingById(@PathVariable Long id) {
	        Optional<Rating> rating = ratingService.getRatingById(id);
	        return rating.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	    @GetMapping("/user/{userId}")
	    public ResponseEntity<Rating> getRatingByUserId(@PathVariable Long userId){
	    	Optional<Rating> userid=ratingService.getRatingByUserId(userId);
	    	return userid.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
	    }

	    @PostMapping
	    public Rating createRating(@RequestBody Rating rating) {
	        return ratingService.saveRating(rating);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Rating> updateRating(@PathVariable Long id, @RequestBody Rating ratingDetails) {
	        Optional<Rating> ratingOptional = ratingService.getRatingById(id);
	        if (!ratingOptional.isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        Rating rating = ratingOptional.get();
	        rating.setUserId(ratingDetails.getUserId());
	        rating.setHotelId(ratingDetails.getHotelId());
	        rating.setRating(ratingDetails.getRating());
	        rating.setRemarks(ratingDetails.getRemarks());
	        Rating updatedRating = ratingService.saveRating(rating);
	        return ResponseEntity.ok(updatedRating);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteRating(@PathVariable Long id) {
	        if (!ratingService.getRatingById(id).isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        ratingService.deleteRating(id);
	        return ResponseEntity.noContent().build();
	    }
	}



