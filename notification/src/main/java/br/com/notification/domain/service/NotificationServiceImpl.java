package br.com.notification.domain.service;

import br.com.notification.controller.DTO.NotificationDTO;
import br.com.notification.domain.entity.NotificationEntity;
import br.com.notification.domain.repository.NotificationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificationServiceImpl implements NotificationService{

    private final ModelMapper modelMapper;
    private final NotificationRepository repository;

    public NotificationServiceImpl(ModelMapper modelMapper, NotificationRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }


    public void createNotification(NotificationDTO notificationDTO) {
        NotificationEntity notification = modelMapper.map(notificationDTO, NotificationEntity.class);
        repository.save(notification);
    }

    public List<NotificationDTO> findAllNotification() {
        return repository.findAll().stream().map(
                notification -> modelMapper.map(notification, NotificationDTO.class)
        ).collect(Collectors.toList());
    }

}
