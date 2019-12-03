package re.aventu.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import re.aventu.microservice.model.User;
import re.aventu.microservice.service.UserService;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = EmpRestURIConstants.GET_USERS, method = RequestMethod.GET)
    public @ResponseBody Iterable<User> getUsers() {
        logger.info("Start getUsers");
        return userService.getUsers();
    }

    @RequestMapping(value = EmpRestURIConstants.GET_USER, method = RequestMethod.GET)
    public @ResponseBody Optional<User> getUser(@PathVariable("id") int userId) {
        logger.info("Start getUser. ID="+userId);
        return userService.getUser(userId);
    }
     
    // @RequestMapping(value = EmpRestURIConstants.PATCH_USER, method = RequestMethod.GET)
    // public @ResponseBody User patchUser(@Valid @RequestBody User user) {
    //     logger.info("Start patchUser. ID="+user.getId());
    //     return userRepository.save(user);
    // }
     
    @RequestMapping(value = EmpRestURIConstants.PUT_USER, method = RequestMethod.PUT)
    public @ResponseBody User putUser(@Valid @RequestBody User user) {
        logger.info("Start putUser. ID="+user.getId());
        return userService.putUser(user);
    }

    @RequestMapping(value = EmpRestURIConstants.CREATE_USER, method = RequestMethod.POST)
    public @ResponseBody User createUser(@Valid @RequestBody User user) {
        logger.info("Start createUser.");
        return userService.createUser(user);
    }
     
    @RequestMapping(value = EmpRestURIConstants.DELETE_USER, method = RequestMethod.DELETE)
    public @ResponseBody Boolean deleteUser(@PathVariable("id") int userId) {
        logger.info("Start deleteUser.");
        return userService.deleteUser(userId);
    }
}  