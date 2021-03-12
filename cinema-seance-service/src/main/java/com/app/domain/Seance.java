package com.app.domain;

import com.app.domain.dto.GetSeanceDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "seances")
public class Seance {
    @Id
    @GeneratedValue
     Long id;
     Long movieId;
     Long cinemaRoomId;
     LocalDateTime dateTime;

     public GetSeanceDto getSeanceDto(){
         return GetSeanceDto.builder()
                 .id(id)
                 .movieId(id)
                 .cinemaRoomId(cinemaRoomId)
                 .build();
     }
}
