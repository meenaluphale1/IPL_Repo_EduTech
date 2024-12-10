package com.wecp.progressive.repository;

import com.wecp.progressive.entity.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketerRepository extends JpaRepository<Cricketer, Integer> {
}
