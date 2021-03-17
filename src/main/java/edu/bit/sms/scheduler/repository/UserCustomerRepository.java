package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.UserCustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCustomerRepository extends JpaRepository<UserCustomerEntity,Long> {

}

