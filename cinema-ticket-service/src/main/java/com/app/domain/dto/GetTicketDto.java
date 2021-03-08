package com.app.domain.dto;

import com.app.domain.types.DiscountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetTicketDto {
    private Long id;
    private Long seanceId;
    private Long seatId;
    private Long userId;
    private BigDecimal price;
    private DiscountType discountType;
}
