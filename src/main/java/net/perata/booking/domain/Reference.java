package net.perata.booking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import java.util.List;

@Entity
@Setter
@Getter
public class Reference {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refe_seq_gen")
    @SequenceGenerator(name = "refe_seq_gen", sequenceName = "refe_seq")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "references")
    private List<Booking> bookings;
}
