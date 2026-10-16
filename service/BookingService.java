
package Home_services.service;

import Home_services.dto.BookingRequest;
import Home_services.entity.Booking;
import Home_services.repository.BookingRepository;
import Home_services.repository.ServiceRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final ServiceRepository serviceRepository;

    public BookingService(BookingRepository bookingRepository,
                          ServiceRepository serviceRepository) {
        this.bookingRepository = bookingRepository;
        this.serviceRepository = serviceRepository;
    }

    @Transactional
    public Booking createBooking(BookingRequest request) {

        boolean serviceExists =
                serviceRepository.existsById(request.getServiceId());

        if (!serviceExists) {
            throw new IllegalArgumentException(
                    "Service not found with ID: " + request.getServiceId());
        }

        Booking booking = new Booking(
                request.getServiceId(),
                request.getCustomerName(),
                request.getPhone(),
                request.getAddress(),
                request.getBookingDate(),
                request.getTimeSlot()
        );

        return bookingRepository.save(booking);
    }

    public java.util.List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}

