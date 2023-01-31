package net.perata.booking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Currency;

@Entity
@Getter
@Setter
public class PriceList {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "price_seq_gen")
    @SequenceGenerator(name = "price_seq_gen", sequenceName = "price_seq")
    private Long id;

    private Currency currency;

    private String name;

    private LocalDateTime validFrom;

    private LocalDateTime validTo;

    private BigDecimal amount;

    private LocalTime timeFrom;

    private LocalTime timeTo;

    private LocalDate dateFrom;

    private LocalDate dateTo;

    @Embedded
    private BookingUnit bookingUnit;

    @ManyToOne
    private Resource references;
}
