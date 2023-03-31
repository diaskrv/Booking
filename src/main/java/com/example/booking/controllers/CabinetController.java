package com.example.booking.controllers;

import com.example.booking.domain.Cabinet;
import com.example.booking.services.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CabinetController {

    private CabinetService cabinetService;

    @Autowired
    public CabinetController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }


    @GetMapping("/cabinet")
    public List<Cabinet> getCabinetsInfo(){
        return cabinetService.getAllCabinets();
    }

    @GetMapping("cabinet/quadrature/{quadrature}")
    public ResponseEntity<Cabinet> cabinetDetail(@PathVariable int quadrature) {
        return ResponseEntity.ok(cabinetService.getCabinetByQuadrature(quadrature));
    }
    @GetMapping("cabinet/{number}")
    public ResponseEntity<Cabinet> cabinetByNumber(@PathVariable int number) {
        return ResponseEntity.ok(cabinetService.getCabinetByNumber(number));
    }
//
//    @PostMapping("cabinet/create")
//    @ResponseStatus(HttpStatus.CREATED)
//    public ResponseEntity<CabinetDTO> createPokemon(@RequestBody CabinetDTO cabinetDto) {
//        return new ResponseEntity<>(cabinetService.createCabinet(cabinetDto), HttpStatus.CREATED);
//    }
//
//    @PutMapping("cabinet/{id}/update")
//    public ResponseEntity<CabinetDTO> updatePokemon(@RequestBody CabinetDTO cabinetDto, @PathVariable("id") int cabinetId) {
//        CabinetDTO response = cabinetService.updateCabinet(cabinetDto, cabinetId);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//
//    @DeleteMapping("cabinet/{id}/delete")
//    public ResponseEntity<String> deleteCabinet(@PathVariable("id") int cabinetId) {
//        cabinetService.deleteCabinetId(cabinetId);
//        return new ResponseEntity<>("Cabinet delete", HttpStatus.OK);
//    }
}
