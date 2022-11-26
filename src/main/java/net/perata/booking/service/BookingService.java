package net.perata.booking.service;

import lombok.AllArgsConstructor;
import net.perata.booking.domain.Booking;
import net.perata.booking.repository.BookingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
@Transactional
public class BookingService {

    private final BookingRepository repository;

    @Transactional(readOnly = true)
    public Booking findById(Long id) {

        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Booking save(Booking booking) {

        return repository.save(booking);
    }
}
