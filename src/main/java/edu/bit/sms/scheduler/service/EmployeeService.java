package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.dao.MethodResult;
import edu.bit.sms.scheduler.model.BookingItemEntity;
import edu.bit.sms.scheduler.model.EmployeeEntity;
import edu.bit.sms.scheduler.model.ServiceEmployeeMapEntity;
import edu.bit.sms.scheduler.model.ServicesEntity;
import edu.bit.sms.scheduler.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class EmployeeService {

    Logger log = Logger.getLogger(EmployeeService.class.getName());

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeLeavesRepository employeeLeavesRepository;

    @Autowired
    private EmployeeLeavesMapRepository employeeLeavesMapRepository;

    @Autowired
    private ServiceEmployeeMapRepository serviceEmployeeMapRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private BookingItemRepository bookingItemRepository;

    /**
     * saveEmployee
     * @param employeeEntity
     * @return
     */
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity){
        EmployeeEntity entity = employeeRepository.save(employeeEntity);
        return entity;
    }

    /**
     * findEmployeeById
     * @param employeeId
     * @return
     */
    public EmployeeEntity findEmployeeById(Long employeeId){
        return employeeRepository.findEmployeeById(employeeId);
    }

    /**
     * findAllEmployee
     * @return
     */
    public List<EmployeeEntity> findAllEmployee(){
        return employeeRepository.findAll();
    }

    /**
     * updateEmployee
     * @param employeeEntity
     * @return
     */
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity){
        EmployeeEntity entity = employeeRepository.save(employeeEntity);
        return entity;
    }

    /**
     * findEmployeesByStatus
     * @return
     */
//    public List<EmployeeEntity> findEmployeesByStatus(String status){
//        return employeeRepository.findEmployeesByEmployeeStatus(status);
//    }

    public List<ServicesEntity> findAllServices(){
        return serviceRepository.findAll();
    }


    public ServiceEmployeeMapEntity saveEmployeeServices(ServiceEmployeeMapEntity serviceEmployeeMapEntity){
        ServiceEmployeeMapEntity entity = serviceEmployeeMapRepository.save(serviceEmployeeMapEntity);

        return entity;
    }


    public List<BookingItemEntity> findAllPendingBookingItemsForEmplyee(Long id, String status){
        return bookingItemRepository.getAllByEmployeeIdAndStatus(id,status);
    }


    public List<EmployeeEntity> findAllEmployeeForservice(Long id){
        List<EmployeeEntity> list = null;
        List<BookingItemEntity> items = bookingItemRepository.getAllByServicesId(id);
        if (items != null){
            list = new ArrayList<>();
            for (BookingItemEntity item : items){
                EmployeeEntity em = employeeRepository.findEmployeeById(item.getEmployeeId());
                list.add(em);
            }
        }
        return list;
    }



}
