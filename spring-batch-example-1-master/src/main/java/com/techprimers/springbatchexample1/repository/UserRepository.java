package com.techprimers.springbatchexample1.repository;

import com.techprimers.springbatchexample1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
