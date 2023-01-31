package net.perata.booking.service.mapper;

import net.perata.booking.domain.Resource;
import net.perata.booking.service.dto.ResourceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ResourceMapper extends EntityMapper<ResourceDto, Resource> {

    @Override
    ResourceDto toDto(Resource entity);

    @Mapping(source = "value", target = "unit.value")
    @Mapping(source = "measure", target = "unit.measure")
    Resource toEntity(ResourceDto dto);
}
