package com.example.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CabinetDTO {
    private int id;
    private int number_of_cab;
    private int places_number;
    private int quadrature;
    private String photo;
}
