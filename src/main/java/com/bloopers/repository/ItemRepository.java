package com.bloopers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloopers.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
