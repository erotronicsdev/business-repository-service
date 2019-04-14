package net.erotronics.business.persistence;

import net.erotronics.business.domain.Business;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends CrudRepository<Business, Object> {
}
