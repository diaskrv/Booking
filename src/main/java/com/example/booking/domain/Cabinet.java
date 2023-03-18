package com.example.booking.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "cabinets")
public class Cabinet {
    private static final String SEQ_NAME = "cabinet_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;
    private Integer number_of_cab;
    private Integer places_number;
    private Integer quadrature;
    private String photo;
    @Enumerated(EnumType.STRING)
    private CabinetStatus cabinet_status;
}
