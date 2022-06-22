package br.com.notification.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_notification")
public class NotificationEntity {

    @Id
    @SequenceGenerator(name = "tb_notification_id_seq", sequenceName = "tb_notification_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_notification_id_seq")
    private Long id;

    private LocalDateTime sendAt;

    private String sender;

    @Column(name = "customer_mail")
    private String customerMail;

    private String message;

    @Column(name = "customer_id")
    private Long customerId;


}
