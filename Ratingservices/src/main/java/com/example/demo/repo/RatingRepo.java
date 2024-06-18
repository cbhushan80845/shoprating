package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Rating;

public interface RatingRepo extends JpaRepository<Rating, Long> {

}
