package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Paul Baur on 4/21/2021
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
