package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.dao.MethodResult;
import edu.bit.sms.scheduler.model.BookingItemEntity;
import edu.bit.sms.scheduler.model.EmployeeEntity;
import edu.bit.sms.scheduler.model.ServiceEmployeeMapEntity;
import edu.bit.sms.scheduler.model.ServicesEntity;
import edu.bit.sms.scheduler.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/scheduler/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/find-all-employee")
    public List<EmployeeEntity> getAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @PostMapping(path = "/save-employee")
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.saveEmployee(employeeEntity);
    }

    @GetMapping(path = "/find-employeebyid/{employeeId}")
    public EmployeeEntity findEmployeeById(@PathVariable("employeeId") Long employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

    @PostMapping(path = "/update-employee")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.updateEmployee(employeeEntity);
    }

    @GetMapping(path = "/find-all-services")
    public List<ServicesEntity> findAllServices(){
        return employeeService.findAllServices();
    }

    @PostMapping(path = "/save-employeeservice")
    public ServiceEmployeeMapEntity saveServiceEmployeeMapEntity(@RequestBody ServiceEmployeeMapEntity serviceEmployeeMapEntity){
        return employeeService.saveEmployeeServices(serviceEmployeeMapEntity);
    }

//    @GetMapping(path = "/find-all-booking-item")
//    public List<BookingItemEntity> findAllBookingItems(Long id){
//        return employeeService.findAllPendingBookingItemsForEmplyee(id, "PENDING");
//    }
//
//    @GetMapping(path = "/find-allemployeebyservice/{serviceId}")
//    public List<EmployeeEntity> getAllEmployeebyService(@PathVariable("serviceId") Long serviceid) {
//
//        return employeeService.findAllEmployeeForservice(serviceid);
//    }
}
