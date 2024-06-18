package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Shop;

public interface ShopRepo extends JpaRepository<Shop, Long> {

}
