package net.perata.booking.service;

import net.perata.booking.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public abstract class AbstractCrudService<T, ID_> {

    protected abstract CrudRepository<T, ID_> repository();

    public T save(T t) {
        return repository().save(t);
    }
}
