//package com.example.booking.repositories;
//
//import com.example.booking.domain.Cabinet;
//import com.example.booking.domain.Roles;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface CabinetRepository extends JpaRepository<Roles, Integer> {
//    Optional<Cabinet> findByCabinetNumber(Integer number_of_cab);
//
//    Optional<Cabinet> findByQuadrature(Integer quadrature);
//
//    Optional<Cabinet> findByPlacesNumber(Integer places_number);
//}
