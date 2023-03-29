package com.example.booking.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


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
    private int people_number;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    @OneToOne
    @JoinColumn(name = "cabinet_id")
    private Cabinet cabinet;
    @CreationTimestamp
    private LocalDateTime created_time;
    private Timestamp timing;
    @UpdateTimestamp
    private LocalDateTime updated_time;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "booking_statuses_relationship", joinColumns = @JoinColumn(name = "booking_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "status_id", referencedColumnName = "id"))
    private List<BookingStatuses> roles = new ArrayList<>();
}

