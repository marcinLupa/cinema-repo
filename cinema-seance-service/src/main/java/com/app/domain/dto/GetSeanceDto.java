package com.app.domain.dto;

import com.app.domain.Seance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetSeanceDto {
    private Long id;
    private Long cinemaRoomId;
    private Long movieId;
    private LocalDateTime startDatetime;

    public Seance seance(){
        return Seance.builder()
                .id(id)
                .movieId(id)
                .cinemaRoomId(cinemaRoomId)
                .build();
    }
}
