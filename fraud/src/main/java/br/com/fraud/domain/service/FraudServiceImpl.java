package br.com.fraud.domain.service;

import br.com.fraud.controller.DTO.FraudDTO;
import br.com.fraud.domain.entity.FraudEntity;
import br.com.fraud.domain.repository.FraudRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class FraudServiceImpl implements FraudService{

    private final ModelMapper modelMapper;
    private final FraudRepository repository;

    public FraudServiceImpl(ModelMapper modelMapper, FraudRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    public FraudDTO createFraud(FraudDTO fraudDTO) {
        FraudEntity fraud = modelMapper.map(fraudDTO, FraudEntity.class);
        return modelMapper.map(repository.save(fraud), FraudDTO.class);
    }

    public Boolean isFraud(Long customerId) {
//        FraudEntity fraud = repository.findById(customerId).orElseThrow(
//                () -> new Excepction("Não existe nenhuma fraud com o código informado"));
//        FraudDTO fraudDTO = modelMapper.map()
        return false;
    }
}
