package com.example.demo.controller;

import com.example.demo.entity.ContactMessage;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "https://ayaweb.vercel.app")
@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/send") // الرابط النهائي: http://localhost:8080/api/contact
    public ResponseEntity<?> createContact(@RequestBody ContactMessage message) {
        ContactMessage savedMsg = contactService.saveMessage(message);
        return ResponseEntity.ok(Map.of(
                "message", "تم استقبال رسالتك بنجاح!",
                "id", savedMsg.getId()
        ));
    }

    // في ملف ContactController.java
    @GetMapping("/all")
    public List<ContactMessage> getAllMessages() {
        return contactService.getAllMessages();
    }
}