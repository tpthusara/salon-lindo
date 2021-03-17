package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.model.UserCustomerEntity;
import edu.bit.sms.scheduler.model.UserEntity;
import edu.bit.sms.scheduler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sathya Molagoda
 * @since 2018-11-13
 */
@RestController
@CrossOrigin
@RequestMapping(path = "/api/scheduler/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save-user")
    public UserEntity saveUser(@RequestBody UserEntity userEntity) {
        return userService.saveUser(userEntity);
    }

    @GetMapping(path = "/un-deleted-users/{status}")
    public List<UserEntity> getUnDeletedUsers(@PathVariable("status") int status) {
        return userService.getUnDeletedUsers(status);
    }

    @GetMapping(path = "/user-by-id/{userId}")
    public UserEntity getUserByUserId(@PathVariable("userId") Long userId) {
        return userService.getUserByUserId(userId);
    }

    @GetMapping(path = "/find-all-users")
    public List<UserEntity> findAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping(path = "/save-customeruser")
    public UserCustomerEntity saveUser(@RequestBody UserCustomerEntity userCustomerEntity) {
        return userService.saveUserCustomer(userCustomerEntity);
    }


    @GetMapping(path = "/find-all-users-active")
    public List<UserCustomerEntity> findAllUsersActive() {
        return userService.findAllCustomerUsers();
    }
}
