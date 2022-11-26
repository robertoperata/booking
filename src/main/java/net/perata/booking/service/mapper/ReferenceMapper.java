package net.perata.booking.service.mapper;

import net.perata.booking.domain.Reference;
import net.perata.booking.service.dto.ReferenceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ReferenceMapper extends EntityMapper<ReferenceDto, Reference> {

    @Override
    @Mapping(target = "bookings", ignore = true)
    ReferenceDto toDto(Reference entity);
}
