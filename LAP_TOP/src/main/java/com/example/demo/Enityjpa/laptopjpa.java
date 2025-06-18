package com.example.demo.Enityjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Enity.PersonEnity;

public interface laptopjpa extends JpaRepository<PersonEnity,  Integer> {

}
