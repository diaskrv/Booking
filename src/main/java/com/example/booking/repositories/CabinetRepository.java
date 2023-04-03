package com.example.booking.repositories;

import com.example.booking.domain.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CabinetRepository extends JpaRepository<Cabinet, Integer> {

    List<Cabinet> findAll();
    Optional<Cabinet> findByNumber(Integer number);

    Optional<Cabinet> findByQuadrature(Integer quadrature);
}
