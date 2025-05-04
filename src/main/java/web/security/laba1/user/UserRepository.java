package web.security.laba1.user;

/*
    @author boguc
    @project laba1
    @class UserRepository
    @version 1.0.0
    @since 04.05.2025 - 19.09
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
