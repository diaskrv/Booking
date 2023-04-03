package com.example.booking.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int peoplenumber;
    @OneToOne
    @JoinColumn(name = "userid")
    private UserEntity user;
    @OneToOne
    @JoinColumn(name = "cabinetid")
    private Cabinet cabinet;
//    @ManyToOne
//    @JoinColumn(name="bookingstatus")
//    BookingStatuses bookingStatuses;
}

