package br.com.delivery.delivery.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class OrderResponseDTO {
    private UUID id;

}
