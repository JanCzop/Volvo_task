package com.example.volvotask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Country_repository extends JpaRepository<Country_DTO, String> {
}
