package edu.bit.sms.scheduler.service;


import edu.bit.sms.scheduler.model.UserCustomerEntity;
import edu.bit.sms.scheduler.model.UserEntity;
import edu.bit.sms.scheduler.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sathya Molagoda
 * @since 2018-11-13
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GuestUserRepository guestUserRepository;

    @Autowired
    private UserCustomerRepository userCustomerRepository;


    /**
     * save new users and update existing users
     *
     * @param user
     */
    public UserEntity saveUser(UserEntity user) {
        userRepository.save(user);
        return user;
    }

    /**
     * get all un-deleted users
     *
     * @param status
     * @return
     */
    public List<UserEntity> getUnDeletedUsers(int status) {
        return userRepository.getUserEntitiesByDeleteStatusIsNot(status);
    }

    /**
     * retrieve the user by unique identification number
     *
     * @param id
     * @return
     */
    public UserEntity getUserByUserId(Long id) {
        return userRepository.getUserEntityByIdEquals(id);
    }

    /**
     * findAllUsers
     *
     * @return
     */
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    public List<UserCustomerEntity> findAllCustomerUsers() {
        return userCustomerRepository.findAll();
    }

    public UserCustomerEntity saveUserCustomer(UserCustomerEntity userCustomerEntity) {
        return userCustomerRepository.save(userCustomerEntity);
    }
}
