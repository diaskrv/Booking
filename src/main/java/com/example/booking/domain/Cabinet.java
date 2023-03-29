package com.example.booking.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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
    private int number_of_cab;
    private int places_number;
    private int quadrature;
    private String photo;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "cabinet_statuses_relationship", joinColumns = @JoinColumn(name = "cabinet_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "status_id", referencedColumnName = "id"))
    private List<CabinetStatuses> roles = new ArrayList<>();
}
