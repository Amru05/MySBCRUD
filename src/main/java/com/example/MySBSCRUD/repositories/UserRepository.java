package com.example.MySBSCRUD.repositories;

import com.example.MySBSCRUD.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// интерфейс в котором автореализованы спрингбутом круды. В ручную расписывать не надо!!
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail (String email);
}
