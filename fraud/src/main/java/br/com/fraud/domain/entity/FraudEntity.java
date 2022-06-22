package br.com.fraud.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_fraud")
public class FraudEntity {

    @Id
    @SequenceGenerator(name = "tb_fraud_id_seq", sequenceName = "tb_fraud_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_fraud_id_seq")
    private Long id;

    private String description;

    private Long customerId;

    private boolean isFraud;

    private LocalDateTime createAt;
}
