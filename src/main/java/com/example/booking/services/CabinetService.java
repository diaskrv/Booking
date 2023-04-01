package com.example.booking.services;

import com.example.booking.domain.Cabinet;
import com.example.booking.dto.CabinetDTO;
import com.example.booking.repositories.CabinetRepository;
import javassist.NotFoundException;
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
    public CabinetDTO createCabinet(CabinetDTO cabinetDto) {
        Cabinet cabinet = new Cabinet();
        cabinet.setNumber(cabinetDto.getNumber());
        cabinet.setPeopleplaces(cabinetDto.getPeopleplaces());
        cabinet.setQuadrature(cabinetDto.getQuadrature());
        Cabinet newCabinet = cabRepository.save(cabinet);

        CabinetDTO cabinetResponse = new CabinetDTO();
        cabinetResponse.setId(newCabinet.getId());
        cabinetResponse.setNumber(newCabinet.getNumber());
        cabinetResponse.setPeopleplaces(newCabinet.getPeopleplaces());
        cabinetResponse.setQuadrature(newCabinet.getQuadrature());
        return cabinetResponse;
    }
    public Cabinet updateCabinet(Cabinet cabinet){
        return cabRepository.save(cabinet);
    }
    public void deleteCabinetId(int id) throws NotFoundException {
        Cabinet cabinet = cabRepository.findById(id).orElseThrow(() -> new NotFoundException("Cabinet could not be delete"));
        cabRepository.delete(cabinet);
    }
}
