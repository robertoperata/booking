package net.perata.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean //exclude Spring to create a real repository
public interface CrudRepository<T, ID_> extends JpaRepository<T, ID_>, JpaSpecificationExecutor<T> {


}
