package net.perata.booking.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.perata.booking.domain.Booking;
import net.perata.booking.service.BookingService;
import net.perata.booking.service.dto.BookingDto;
import net.perata.booking.service.mapper.BookingMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;

import static java.lang.String.format;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/booking")
public class BookingController {

    private final BookingService bookingService;
    private final BookingMapper bookingMapper;

    @PostMapping
    public ResponseEntity<BookingDto> save(@Valid @RequestBody BookingDto dto, HttpServletRequest httpServletRequest) {

        Booking booking = bookingMapper.toEntity(dto);
        Booking save = bookingService.save(booking);
        String path = format("%s/%d", httpServletRequest.getRequestURI(), save.getId());
        return ResponseEntity.created(URI.create(path)).body(bookingMapper.toDto(save));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingDto> getById(@PathVariable Long id) {

        Booking booking = bookingService.findById(id);
        return ResponseEntity.ok(bookingMapper.toDto(booking));
    }

}
