package net.perata.booking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class BookingUnit {

    private String measure;
    private int value;
}
