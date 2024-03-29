package org.cpsportfolio.backend.service.dto.racecalendar;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RaceCalendarDto {

    String name;
    String circuit;
    String date;
    String alpha2CountryCode;
    double lat;
    double lon;
    List<Session> sessions;
}
