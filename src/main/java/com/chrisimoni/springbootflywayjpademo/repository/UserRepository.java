package com.chrisimoni.springbootflywayjpademo.repository;

import com.chrisimoni.springbootflywayjpademo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
