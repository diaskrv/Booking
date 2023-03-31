package com.example.booking.domain;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
    @CreationTimestamp
    private LocalDateTime createdtime;
    private Timestamp timing;
    @UpdateTimestamp
    private LocalDateTime updatedtime;
    @ManyToOne
    @JoinColumn(name="bookingstatus")
    BookingStatuses bookingStatuses;
}

