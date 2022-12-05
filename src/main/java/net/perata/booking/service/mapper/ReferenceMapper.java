package net.perata.booking.service.mapper;

import net.perata.booking.domain.Reference;
import net.perata.booking.service.dto.ReferenceDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReferenceMapper extends EntityMapper<ReferenceDto, Reference> {

    @Override
    ReferenceDto toDto(Reference entity);
}
