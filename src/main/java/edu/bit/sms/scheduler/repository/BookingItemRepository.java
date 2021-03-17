package edu.bit.sms.scheduler.repository;


import edu.bit.sms.scheduler.model.BookingItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface BookingItemRepository extends JpaRepository<BookingItemEntity,Long> {


    List<BookingItemEntity> getAllByEmployeeIdAndStatus(Long id, String status);

    List<BookingItemEntity> getAllByStatusIsNotLike(String status);


    List<BookingItemEntity> getAllByDateIsLike(String date);

    List<BookingItemEntity> getAllByServicesId(Long serviceId);

    List<BookingItemEntity> getAllByCustomerIdAndStatusIsNotLike(Long empId,String status);

    List<BookingItemEntity> getAllByEmployeeIdAndStatusIsIn(Long empId,List<String> statuses);

    int countAllByStatusIsLikeAndDateIsLike(String status, String Date);


}
