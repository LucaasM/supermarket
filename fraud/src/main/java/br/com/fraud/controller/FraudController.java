package br.com.fraud.controller;

import br.com.fraud.controller.DTO.FraudDTO;
import br.com.fraud.domain.service.FraudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/frauds")
public class FraudController {


    private final FraudService fraudService;

    public FraudController(FraudService fraudService) {
        this.fraudService = fraudService;
    }

    @PostMapping
    public ResponseEntity<FraudDTO> createFraud(@RequestBody FraudDTO fraudDTO) {
        return new  ResponseEntity<>(fraudService.createFraud(fraudDTO), HttpStatus.CREATED);
    }


}
