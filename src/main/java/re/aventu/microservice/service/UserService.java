package re.aventu.microservice.service;

import re.aventu.microservice.model.User;
import re.aventu.microservice.repository.UserRepository;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
        @Autowired
        private UserRepository userRepository;
        private static final Logger logger = LoggerFactory.getLogger(UserService.class);

        public Iterable<User> getUsers() {
                return userRepository.findAll();
        }

        public Optional<User> getUser(int userId) {
                return userRepository.findById(userId);
        }

        public User putUser(User user) {
                return userRepository.save(user);
        }

        public User createUser(User user) {
                return userRepository.save(user);
        }

        public Boolean deleteUser(int userId) {
                userRepository.deleteById(userId);
                return true;
        }

}