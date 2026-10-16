
package Home_services.controller;

import Home_services.entity.Service;
import Home_services.repository.ServiceRepository;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController
{

    private final ServiceRepository serviceRepository;

    public ServiceController(ServiceRepository serviceRepository)
    {
        this.serviceRepository = serviceRepository;
    }

    @GetMapping
    public List<Service> getServices(
            @RequestParam(required = false) String search) {

        if (search != null && !search.isBlank()) {
            return serviceRepository
                    .findByNameContainingIgnoreCase(search);
        }

        return serviceRepository.findAll();
    }

    @GetMapping("/{id}")
    public org.springframework.http.ResponseEntity<Service> getServiceById(
            @PathVariable Long id) {

        return serviceRepository.findById(id)
                .map(org.springframework.http.ResponseEntity::ok)
                .orElseGet(() ->
                    org.springframework.http.ResponseEntity.notFound().build());
    }
}
