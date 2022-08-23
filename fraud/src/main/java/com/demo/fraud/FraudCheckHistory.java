package com.demo.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(
            name = "test" ,
            sequenceName = "test"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "test"
    )
    private Integer id;
    private Integer customerId;
    private boolean isFraudster;
    private LocalDateTime createdAt;
}
