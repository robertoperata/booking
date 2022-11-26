package net.perata.booking.service.mapper;

import net.perata.booking.domain.Reference;
import net.perata.booking.service.dto.ReferenceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReferenceMapper extends EntityMapper<ReferenceDto, Reference> {

    @Override
    @Mapping(target = "bookings", ignore = true)
    Reference toEntity(ReferenceDto dto);
}
