package net.perata.booking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Getter
@Setter
public class BookingUnit {

    @Enumerated(EnumType.STRING)
    private MeasureType measure;
    private Integer value;
}
