package br.com.notification.domain.service;

import br.com.notification.controller.DTO.NotificationDTO;

import java.util.List;

public interface NotificationService {

    void createNotification(NotificationDTO notificationDTO);
    List<NotificationDTO> findAllNotification();
}
