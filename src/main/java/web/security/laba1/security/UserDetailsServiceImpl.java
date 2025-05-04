package web.security.laba1.security;

/*
    @author boguc
    @project laba1
    @class UserDetailsServiceImpl
    @version 1.0.0
    @since 04.05.2025 - 19.01
*/

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import web.security.laba1.user.Role;
import web.security.laba1.user.User;
import web.security.laba1.user.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository repository;
//    private final PasswordEncoder passwordEncoder;
//
//    @PostConstruct
//    void init() {
//        User user = User.builder()
//              .firstName("Ivan")
//              .lastName("Ivanenko")
//              .email("ivan@mail.com")
//              .password(passwordEncoder.encode("ivanpassword"))
//              .enabled(true)
//              .accountLocked(false)
//              .roles(List.of(Role.USER))
//              .build();
//        repository.save(user);
//    }

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        return repository.findByEmail(userEmail)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }
}
