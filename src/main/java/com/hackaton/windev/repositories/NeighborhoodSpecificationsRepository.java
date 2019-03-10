package com.hackaton.windev.repositories;

import com.hackaton.windev.entities.NeighborhoodsSpecifications;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodSpecificationsRepository extends CrudRepository<NeighborhoodsSpecifications, Long> {
}
