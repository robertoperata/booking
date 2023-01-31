package net.perata.booking.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.perata.booking.domain.Resource;
import net.perata.booking.service.ResourceService;
import net.perata.booking.service.dto.ResourceDto;
import net.perata.booking.service.mapper.ResourceMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/resource")
public class ResourceController {

    private final ResourceService resourceService;

    private final ResourceMapper resourceMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResourceDto> save(@RequestBody ResourceDto dto, HttpServletRequest req) {
        Resource resource = resourceService.save(resourceMapper.toEntity(dto));
        ResourceDto resourceDto = resourceMapper.toDto(resource);
        String uri = String.format("%s/%s", req.getRequestURI(), resourceDto.getId());
        return ResponseEntity.created(URI.create(uri)).body(resourceDto);

    }
}
