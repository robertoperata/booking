package net.perata.booking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refe_seq_gen")
    @SequenceGenerator(name = "refe_seq_gen", sequenceName = "refe_seq")
    private Long id;

    private String name;

    @Embedded
    private BookingUnit unit;

    @OneToMany
    private List<PriceList> priceList = new ArrayList<>();

    @ManyToMany(mappedBy = "resources")
    private Set<Booking> bookings = new HashSet<>();

    @ManyToMany
    private Set<PriceConf> priceConfigs = new HashSet<>();
}
