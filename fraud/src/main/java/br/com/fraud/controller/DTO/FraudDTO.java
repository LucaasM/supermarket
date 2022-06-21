package br.com.fraud.controller.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FraudDTO {
    private Long id;
    private String description;
    private Long customerId;
    private boolean isfraud;
    private LocalDateTime createAt;
}
