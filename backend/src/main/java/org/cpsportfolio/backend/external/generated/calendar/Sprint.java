package org.cpsportfolio.backend.external.generated;

import lombok.Data;

@Data
public class Sprint {

    private String date;
    private String time;

    @Override
    public String toString() {
        return "Sprint Race";
    }
}