package com.example.flowerstore;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flowerstore.flowers.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}
