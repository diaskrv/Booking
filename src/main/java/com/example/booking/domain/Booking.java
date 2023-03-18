package com.example.booking.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "bookings")
public class Booking {
    private static final String SEQ_NAME = "booking_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;
    private Integer people_number;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "cabinet_id")
    private Cabinet cabinet;
    @CreationTimestamp
    private LocalDateTime created_time;
    private Timestamp timing;
    @UpdateTimestamp
    private LocalDateTime updated_time;
    @Enumerated(EnumType.STRING)
    private BookingStatus booking_status;
}

