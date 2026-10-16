
package Home_services;

import Home_services.entity.Service;
import Home_services.repository.ServiceRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ServiceRepository serviceRepository;

    public DataLoader(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public void run(String... args) {

        if (serviceRepository.count() == 0) {
            serviceRepository.save(new Service(
                "Home Cleaning", "Complete home cleaning service", 999, 4.5));

            serviceRepository.save(new Service(
                "Plumbing", "Tap repair and pipe fitting", 299, 4.3));

            serviceRepository.save(new Service(
                "Electrician", "Electrical repair and installation", 399, 4.4));

            serviceRepository.save(new Service(
                "AC Repair", "Air conditioner service and repair", 499, 4.2));

            serviceRepository.save(new Service(
                "Painting", "Home wall painting service", 1999, 4.6));

            serviceRepository.save(new Service(
                "Carpentry", "Furniture repair and installation", 349, 4.1));

            serviceRepository.save(new Service(
                "Pest Control", "Pest control for home", 799, 4.3));

            serviceRepository.save(new Service(
                "Appliance Repair", "Repair for home appliances", 499, 4.0));

            System.out.println("8 home services inserted successfully!");
        }
    }
}
