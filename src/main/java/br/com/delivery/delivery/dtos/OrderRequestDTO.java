package br.com.delivery.delivery.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderRequestDTO {
    private String customerName;
    private BigDecimal totalAmount;
}
