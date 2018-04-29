package io.kidbank.user.services;

import io.kidbank.user.repositories.UserRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
class DefaultUserService implements UserService {
    private UserRepository userRepository;

    @Inject
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getAllUsersUppercase() {
        var users = userRepository.getAllUsers();
        return users.parallelStream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }
}
