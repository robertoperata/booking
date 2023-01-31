package net.perata.booking.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.perata.booking.domain.Resource;
import net.perata.booking.repository.CrudRepository;
import net.perata.booking.repository.ResourceRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ResourceService extends AbstractCrudService<Resource, Long> {

    private final ResourceRepository repository;

    @Override
    protected CrudRepository<Resource, Long> repository() {
        return repository;
    }
}
