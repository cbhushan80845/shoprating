package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Rating;
import com.example.demo.repo.RatingRepo;

@Service
	public class RatingService {
	    @Autowired
	    private RatingRepo ratingRepository;

	    public List<Rating> getAllRatings() {
	        return ratingRepository.findAll();
	    }

	    public Optional<Rating> getRatingById(Long id) {
	        return ratingRepository.findById(id);
	    }

	    public Rating saveRating(Rating rating) {
	        return ratingRepository.save(rating);
	    }

	    public void deleteRating(Long id) {
	        ratingRepository.deleteById(id);
	    }

		public Optional<Rating> getRatingByUserId(Long userId) {
			return ratingRepository.findById(userId);
			
		}
	}

