package com.example.demo.service;

import com.example.demo.entity.ContactMessage;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ContactService {

    @Autowired // يربط الـ Repository تلقائياً
    private ContactRepository contactRepository;

    public ContactMessage saveMessage(ContactMessage message) {
        // تقدري تزيدي هنا أي منطق (مثلاً إرسال إيميل بعد الحفظ)
        return contactRepository.save(message);
    }

    public List<ContactMessage> getAllMessages() {
        return contactRepository.findAll();
    }
}