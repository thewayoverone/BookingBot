package com.example.spring_booking_bot.repos;

import com.example.spring_booking_bot.models.UserModel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
    UserModel findUserModelByTgId(String id);
}
