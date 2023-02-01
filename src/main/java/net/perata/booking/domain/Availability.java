package net.perata.booking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "date_range")
public class Availability {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "date_range_seq_gen")
    @SequenceGenerator(name = "date_range_seq_gen", sequenceName = "date_range_seq")
    private Long id;
    private LocalDateTime from;
    private LocalDateTime to;

    @Column(name = "is_hourly")
    private boolean isHourly;

    @Column(name = "from_hour")
    private LocalTime fromHour;

    @Column(name = "to_hour")
    private LocalTime toHour;

    @Column(name = "week_days")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WeekDays> weekDays;
}
