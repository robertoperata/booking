package net.perata.booking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class PriceConf {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "price_conf_seq_gen")
    @SequenceGenerator(name = "price_conf_seq_gen", sequenceName = "price_conf_seq")
    private Long id;

    private BigDecimal price;

    private String description;

    private LocalDateTime validFrom;

    private LocalDateTime validTo;

    private LocalTime fromTime;

    private LocalTime toTime;

    private LocalDate fromDate;

    private LocalDate toDate;

}
