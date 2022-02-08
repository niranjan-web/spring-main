package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.PlacementEntity;

public interface PlacementRepository extends JpaRepository<PlacementEntity, Integer>
{

}
