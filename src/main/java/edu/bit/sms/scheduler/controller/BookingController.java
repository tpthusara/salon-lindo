package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.dao.BookingItemdao;
import edu.bit.sms.scheduler.dao.MethodResult;
import edu.bit.sms.scheduler.model.BookingEntity;
import edu.bit.sms.scheduler.model.BookingItemEntity;
import edu.bit.sms.scheduler.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/scheduler/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    /**
     * saveBooking
     *
     * @param bookingEntity
     * @return
     */
    @PostMapping(path = "/save-booking")
    public BookingEntity saveBooking(@RequestBody BookingEntity bookingEntity) {
        return bookingService.saveBooking(bookingEntity);
    }

    /**
     * updateBooking
     *
     * @param bookingEntity
     * @return
     */
    @PostMapping(path = "update-booking")
    public BookingEntity updateBooking(@RequestBody BookingEntity bookingEntity) {
        return bookingService.updateBooking(bookingEntity);
    }

    /**
     * findBookingDetails
     *
     * @param bookingId
     * @return
     */
    @GetMapping(path = "/find-booking-details/{bookingId}")
    public BookingEntity findBookingDetails(@PathVariable("bookingId") Long bookingId) {
        return bookingService.findBookingDetails(bookingId);
    }

    /**
     * findAllBookings
     *
     * @return
     */
    @GetMapping(path = "/find-all-bookings")
    public List<BookingEntity> findAllBookings() {
        return bookingService.findAllBookings();
    }

//    @GetMapping(path = "/find-all-booking-items")
//    public List<BookingItemdao> findAllBookingItems() {
//        return bookingService.findAllActiveBookingItems();
//    }
//
//    @PostMapping(path = "/save-booking-items")
//    public BookingItemEntity saveBookingItems(@RequestBody BookingItemEntity bookingItemEntity) {
//        return bookingService.saveBookingItem(bookingItemEntity);
//    }

    @GetMapping(path = "/check-employee-bookings/{date}/{time}")
    public Boolean findAllBookings(@PathVariable("date") String date, @PathVariable("time") String time) {
        return bookingService.isEmployeHasABooking(date,time);
    }

//    @GetMapping(path = "/update-bookingitemstatus/{id}/{status}")
//    public BookingItemEntity findAllBookings(@PathVariable("id") Long id, @PathVariable("status") String status) {
//        return bookingService.updateStatus(id,status);
//    }

//    @GetMapping(path = "/find-all-booking-itemsbycustomer/{id}")
//    public List<BookingItemdao> findAllBookingItemsByCustomer(@PathVariable("id") Long id) {
//        return bookingService.findAllActiveBookingItemsForCustomer(id);
//    }
//
//    @GetMapping(path = "/find-all-booking-itemsbyemployee/{id}")
//    public List<BookingItemdao> findAllBookingItemsByEmployee(@PathVariable("id") Long id) {
//        return bookingService.findAllActiveBookingItemsForEmployee(id);
//    }

    @GetMapping(path = "/count-confirmed-bookings")
    public int countconfirmedBookings( ) {
        return bookingService.countConfirmedBookings();
    }

}
