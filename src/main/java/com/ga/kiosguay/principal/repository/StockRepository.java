package com.ga.kiosguay.principal.repository;

import com.ga.kiosguay.principal.data.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {

}
