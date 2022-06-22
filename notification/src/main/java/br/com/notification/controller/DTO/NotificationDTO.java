package br.com.notification.controller.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotificationDTO {
    private Long id;
    private LocalDateTime sendAt;
    private String sender;
    private String customerMail;
    private String message;
    private Long customerId;
}
