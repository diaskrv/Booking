package com.example.booking.domain;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "cabinets")
public class Cabinet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;
    private int peopleplaces;
    private int quadrature;
}
