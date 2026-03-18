package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity // تخبر Spring بلي هادي طاولة في Database
@Table(name = "contact_messages") // اسم الجدول في MySQL
@Data   // هادي من Lombok: تدير Getters و Setters وحدها
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id يزيد وحده (1, 2, 3...)
    private Long id;

    private String name;
    private String email;
    private String phone;
    @Column(columnDefinition = "TEXT") // باش الميساج يكون طويل بزاف
    private String message;


}