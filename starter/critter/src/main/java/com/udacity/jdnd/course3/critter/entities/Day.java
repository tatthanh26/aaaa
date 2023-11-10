package com.udacity.jdnd.course3.critter.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.DayOfWeek;

@Entity
@Data
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    public Day(DayOfWeek day) {
        this.dayOfWeek = day;
    }
}
