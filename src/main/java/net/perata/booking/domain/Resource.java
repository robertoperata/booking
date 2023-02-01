package net.perata.booking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "res_seq_gen")
    @SequenceGenerator(name = "res_seq_gen", sequenceName = "res_seq")
    private Long id;
    private String name;
    @Embedded
    private BookingUnit unit;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Availability> avabilities;
    @ManyToMany(mappedBy = "resources")
    private Set<Booking> bookings = new HashSet<>();
}
