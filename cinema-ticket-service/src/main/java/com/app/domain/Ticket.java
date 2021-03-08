package com.app.domain;

import com.app.domain.dto.GetTicketDto;
import com.app.domain.types.DiscountType;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue
    Long id;
    Long seanceId;
    Long seatId;
    Long userId;

    BigDecimal price;

    DiscountType discountType;

    public GetTicketDto toGetTicketDto() {
        return GetTicketDto.builder()
                .id(id)
                .discountType(discountType)
                .userId(userId)
                .price(price)
                .seanceId(seanceId)
                .seatId(seatId)
                .build();
    }
}
