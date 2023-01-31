package net.perata.booking.service.mapper;

import net.perata.booking.domain.Booking;
import net.perata.booking.service.dto.BookingDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ResourceMapper.class})
public interface BookingMapper extends EntityMapper<BookingDto, Booking> {

}
