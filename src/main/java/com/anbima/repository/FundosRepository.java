package com.anbima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anbima.model.Fundo;


@Repository
public interface FundosRepository extends JpaRepository<Fundo, String> {

}
