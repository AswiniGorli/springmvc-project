package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.springmvc;
@Repository
public interface springmvcrepository extends JpaRepository<springmvc,Long>{

}
