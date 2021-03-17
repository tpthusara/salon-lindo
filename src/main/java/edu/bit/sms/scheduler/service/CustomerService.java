package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.model.CustomerEntity;
import edu.bit.sms.scheduler.model.UserEntity;
import edu.bit.sms.scheduler.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerEntity> findAllCustomer() {
        return customerRepository.findAll();
    }

    public CustomerEntity saveCustomer(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    public CustomerEntity findCustomerById(Long id){
        return customerRepository.findCustomerEntityByIdIs(id);
    }
}
