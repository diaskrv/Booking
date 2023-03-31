package com.example.booking.services;

import com.example.booking.domain.Cabinet;
import com.example.booking.domain.UserEntity;
import com.example.booking.repositories.CabinetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CabinetService {

    @Autowired
    private CabinetRepository cabRepository;

    public List<Cabinet> getAllCabinets(){
        List<Cabinet> cabinetList = new ArrayList<>();
        cabRepository.findAll().forEach(cabinet -> cabinetList.add(cabinet));
        return cabinetList;
    }
    public Cabinet getCabinetByNumber(Integer number){
        return cabRepository.findByNumber(number).orElse(null);
    }
    public Cabinet getCabinetByQuadrature(Integer quadrature){
        return cabRepository.findByQuadrature(quadrature).orElse(null);
    }
}
