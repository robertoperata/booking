package net.perata.booking.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.DayOfWeek;

@Entity
public class WeekDays {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "week_seq_gen")
    @SequenceGenerator(name = "week_seq_gen", sequenceName = "week_seq")
    private Long id;

    private boolean enabled;

    @Column(name = "day_of_week")
    private DayOfWeek dayOfWeek;
}
