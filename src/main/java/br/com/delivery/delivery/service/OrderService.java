package br.com.delivery.delivery.service;

import br.com.delivery.delivery.dtos.OrderRequestDTO;
import br.com.delivery.delivery.dtos.OrderResponseDTO;
import br.com.delivery.delivery.entities.Order;
import br.com.delivery.delivery.mapper.OrderMapper;
import br.com.delivery.delivery.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final  OrderRepository repository;
    private final  OrderMapper mapper;

    public OrderResponseDTO createOrder(OrderRequestDTO dto) {
        Order order =mapper.toEntity(dto);
        Order response = repository.save(order);
        return mapper.toDto(response);
    }
}
