package br.com.delivery.delivery.mapper;

import br.com.delivery.delivery.dtos.OrderRequestDTO;
import br.com.delivery.delivery.dtos.OrderResponseDTO;
import br.com.delivery.delivery.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
/*
 - O mapper struct basicamente ele faz a conversao de uma classe para outra com base na entidade.
 - ex: requestDto para entidade , ele na sua implementacao ele pega e cria uma classe onde ele vai e
 faz a conversao usando os set e gets.
 - precisa utilizar lombok-mapstruct-binding no pom.
 */

//Criar sua implementacao sendo um bean spring.Gera uma classe de implementacao com esses metodos.Em tempo de compilacao.
//@Mapper define um contrato de mapeamento.
@Mapper(componentModel = "spring")
public interface OrderMapper {

   @Mapping(target = "id", ignore = true)
   @Mapping(target = "date", expression = "java(java.time.LocalDateTime.now())")
   Order toEntity(OrderRequestDTO dto);

   OrderResponseDTO toDto(Order order);

}
