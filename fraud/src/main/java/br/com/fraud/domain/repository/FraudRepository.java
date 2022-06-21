package br.com.fraud.domain.repository;

import br.com.fraud.domain.entity.FraudEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudRepository extends JpaRepository<FraudEntity, Long> {
}
