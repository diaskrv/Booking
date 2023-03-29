//package com.example.booking.controllers;
//
//import com.example.booking.dto.CabinetDTO;
//import com.example.booking.dto.CabinetResponse;
//import com.example.booking.services.CabinetService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/")
//public class CabinetController {
//
//    private CabinetService cabinetService;
//
//    @Autowired
//    public CabinetController(CabinetService cabinetService) {
//        this.cabinetService = cabinetService;
//    }
//
//    @GetMapping("cabinet")
//    public ResponseEntity<CabinetResponse> getCabinets(
//            @RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
//            @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize
//    ) {
//        return new ResponseEntity<>(cabinetService.getAllCabinets(pageNo, pageSize), HttpStatus.OK);
//    }
//
//    @GetMapping("cabinet/{id}")
//    public ResponseEntity<CabinetDTO> cabinetDetail(@PathVariable int id) {
//        return ResponseEntity.ok(cabinetService.getCabinetById(id));
//    }
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
//}
