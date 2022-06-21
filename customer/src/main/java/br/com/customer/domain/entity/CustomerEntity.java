package br.com.customer.domain.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_customer")
public class CustomerEntity {

    @Id
    @SequenceGenerator(name = "tb_customer_id_seq", sequenceName = "tb_customer_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_customer_id_seq")
    private Long id;

    private String name;
    private String email;
}
