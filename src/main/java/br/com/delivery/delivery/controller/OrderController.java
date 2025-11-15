package br.com.delivery.delivery.controller;

import br.com.delivery.delivery.dtos.OrderRequestDTO;
import br.com.delivery.delivery.dtos.OrderResponseDTO;
import br.com.delivery.delivery.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService service;

    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@RequestBody OrderRequestDTO dto){
         OrderResponseDTO response = service.createOrder(dto);
        return ResponseEntity.ok(response);

    }
}
