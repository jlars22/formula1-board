package org.cpsportfolio.backend.external.generated.calendar;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Circuit {

    private String circuitId;
    private String url;
    private String circuitName;

    @JsonProperty("Location")
    private Location location;
}
