package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.dao.BookingItemdao;
import edu.bit.sms.scheduler.dao.MethodResult;
import edu.bit.sms.scheduler.model.*;
import edu.bit.sms.scheduler.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BookingService {


    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private BookingItemRepository bookingItemRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private CustomerRepository customerRepository;

    /**
     * findBookingDetails
     *
     * @param bookingId
     * @return
     */
    public BookingEntity findBookingDetails(Long bookingId) {
        return bookingRepository.findBookingById(bookingId);
    }

    /**
     * saveBooking
     *
     * @param bookingEntity
     * @return
     */
    public BookingEntity saveBooking(BookingEntity bookingEntity) {
        MethodResult methodResult = new MethodResult();
        BookingEntity bookingEn = bookingRepository.save(bookingEntity);
        return bookingEn;
    }

    /**
     * updateBooking
     *
     * @param bookingEntity
     * @return
     */
    public BookingEntity updateBooking(BookingEntity bookingEntity) {
        MethodResult methodResult = new MethodResult();
        BookingEntity bookingEn = bookingRepository.save(bookingEntity);

        return bookingEn;
    }

    /**
     * findAllBookings
     *
     * @return
     */
    public List<BookingEntity> findAllBookings() {
        return bookingRepository.findAll();
    }


    public BookingItemEntity saveBookingItem(BookingItemEntity bookingItemEntity) {
        BookingItemEntity be = bookingItemRepository.save(bookingItemEntity);

        return bookingItemEntity;
    }

    public List<BookingItemdao> findAllActiveBookingItems() {
        List<BookingItemdao> daolist = new ArrayList<>();
        List<BookingItemEntity> list = bookingItemRepository.getAllByStatusIsNotLike("CANCEL");

        for (BookingItemEntity item : list){
            BookingItemdao dao = new BookingItemdao();
            dao.setId(item.getId());
            dao.setDate(item.getDate());
            dao.setTime(item.getTime());
            dao.setBookingId(item.getBookingId());
            dao.setCreateDate(item.getCreateDate());
            dao.setStatus(item.getStatus());

            EmployeeEntity ep = employeeRepository.findEmployeeById(item.getEmployeeId());
            ServicesEntity sv  = serviceRepository.getServicesEntityById(item.getServicesId());
            CustomerEntity cus = customerRepository.findCustomerEntityByIdIs(item.getCustomerId());

            dao.setService(sv.getService());
            dao.setCustomer(cus.getFirstName()+" "+cus.getLastName());
            dao.setEmployee(ep.getFirstName() + " " + ep.getLastName());

            daolist.add(dao);
        }
        return daolist;
    }

    public Boolean isEmployeHasABooking(String date, String time) {
        String[] arr = time.split(":");
        time = arr[0];

        List<BookingItemEntity> list = bookingItemRepository.getAllByDateIsLike(date);

        if (list != null && !list.isEmpty()) {
            for (BookingItemEntity item : list){
                String itemTime = item.getTime();
                String [] timearr = itemTime.split(":");
                if (time.equalsIgnoreCase(timearr[0])){
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public BookingItemEntity updateStatus(Long id, String status){
        BookingItemEntity bt = bookingItemRepository.getOne(id);
        bt.setStatus(status);
        return bookingItemRepository.save(bt);
    }

//    public List<BookingItemdao> findAllActiveBookingItemsForCustomer(Long empId) {
//        List<BookingItemdao> daolist = new ArrayList<>();
//        List<BookingItemEntity> list = bookingItemRepository.getAllByCustomerIdAndStatusIsNotLike(empId,"CANCEL");
//
//        for (BookingItemEntity item : list){
//            BookingItemdao dao = new BookingItemdao();
//            dao.setId(item.getId());
//            dao.setDate(item.getDate());
//            dao.setTime(item.getTime());
//            dao.setBookingId(item.getBookingId());
//            dao.setCreateDate(item.getCreateDate());
//            dao.setStatus(item.getStatus());
//
//            EmployeeEntity ep = employeeRepository.findEmployeeById(item.getEmployeeId());
//            ServicesEntity sv  = serviceRepository.getServicesEntityById(item.getServicesId());
//            CustomerEntity cus = customerRepository.findCustomerEntityByIdIs(item.getCustomerId());
//
//            dao.setService(sv.getService());
//            dao.setCustomer(cus.getFirstName()+" "+cus.getLastName());
//            dao.setEmployee(ep.getFirstName() + " " + ep.getLastName());
//
//            daolist.add(dao);
//        }
//        return daolist;
//    }

//    public List<BookingItemdao> findAllActiveBookingItemsForEmployee(Long empId) {
//        List<BookingItemdao> daolist = new ArrayList<>();
//        List<String> statuses = new ArrayList<>();
//        statuses.add("CONFIRMED");
//        statuses.add("PENDING");
//        statuses.add("STARTED");
//        List<BookingItemEntity> list = bookingItemRepository.getAllByEmployeeIdAndStatusIsIn(empId,statuses);
//
//        for (BookingItemEntity item : list){
//            BookingItemdao dao = new BookingItemdao();
//            dao.setId(item.getId());
//            dao.setDate(item.getDate());
//            dao.setTime(item.getTime());
//            dao.setBookingId(item.getBookingId());
//            dao.setCreateDate(item.getCreateDate());
//            dao.setStatus(item.getStatus());
//
//            EmployeeEntity ep = employeeRepository.findEmployeeById(item.getEmployeeId());
//            ServicesEntity sv  = serviceRepository.getServicesEntityById(item.getServicesId());
//            CustomerEntity cus = customerRepository.findCustomerEntityByIdIs(item.getCustomerId());
//
//            dao.setService(sv.getService());
//            dao.setCustomer(cus.getFirstName()+" "+cus.getLastName());
//            dao.setEmployee(ep.getFirstName() + " " + ep.getLastName());
//
//            daolist.add(dao);
//        }
//        return daolist;
//    }

    public int countConfirmedBookings(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String date = sdf.format(d);
        return bookingItemRepository.countAllByStatusIsLikeAndDateIsLike("CONFIRMED",date);
    }
}
