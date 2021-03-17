package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {


    CustomerEntity findCustomerEntityByIdIs(Long id);
}
