package com.example.jumagulovrolan.scientist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScientistRepository extends JpaRepository<Scientist, Long> {
}
