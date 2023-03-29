package com.example.booking.services;

import com.example.booking.dto.CabinetDTO;
import com.example.booking.dto.CabinetResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CabinetService {
    CabinetDTO createCabinet(CabinetDTO cabinetDto);
    CabinetResponse getAllCabinets(int pageNo, int pageSize);
    CabinetDTO getCabinetById(int id);
    CabinetDTO updateCabinet(CabinetDTO cabinetDto, int id);
    void deleteCabinetId(int id);
}