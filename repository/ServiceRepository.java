
package Home_services.repository;

import Home_services.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ServiceRepository
        extends JpaRepository<Service, Long> 
{

    List<Service> findByNameContainingIgnoreCase(String name);
}
