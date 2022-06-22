package br.com.notification.controller;

import br.com.notification.controller.DTO.NotificationDTO;
import br.com.notification.domain.service.NotificationService;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNotification(@RequestBody NotificationDTO notificationDTO){
        this.notificationService.createNotification(notificationDTO);
    }

    @GetMapping
    public ResponseEntity<?> findALlNotification() {
        return ResponseEntity.ok(notificationService.findAllNotification());
    }
}
