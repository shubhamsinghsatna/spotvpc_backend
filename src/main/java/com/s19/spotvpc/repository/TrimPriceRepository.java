package com.s19.spotvpc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.s19.spotvpc.model.TrimPrice;

@Repository
public interface TrimPriceRepository extends JpaRepository<TrimPrice, Integer> {

}
