package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.model.CustomerEntity;
import edu.bit.sms.scheduler.model.UserEntity;
import edu.bit.sms.scheduler.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/scheduler/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/find-all-customers")
    public List<CustomerEntity> findAllCustomer() {
        return customerService.findAllCustomer();
    }

    @PostMapping(path = "/save-customer")
    public CustomerEntity saveCustomer(@RequestBody CustomerEntity customerEntity) {
        return customerService.saveCustomer  (customerEntity);
    }

    @GetMapping(path = "/find-customersbyid/{id}")
    public CustomerEntity findAllCustomerById(@PathVariable("id") Long id) {
        return customerService.findCustomerById(id);
    }

}
