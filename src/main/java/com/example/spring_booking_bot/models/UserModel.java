package com.example.spring_booking_bot.models;

import com.example.spring_booking_bot.helpers.DoctorEnum;
import lombok.Data;

import javax.persistence.*;
import javax.print.Doc;

@Table(name = "telegram_user")
@Entity
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "username")
    String username;

    @Column(name = "telegram_id")
    String tgId;

    @Column(name = "name")
    String name;

    @Column(name = "wanted_doc")
    @Enumerated
    DoctorEnum doctorEnum;
}
