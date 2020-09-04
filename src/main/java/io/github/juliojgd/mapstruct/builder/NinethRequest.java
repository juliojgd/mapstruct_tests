package io.github.juliojgd.mapstruct.builder;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class NinethRequest {
    private final String thing17;
    private final String thing18;
    private final List<Object> types;
    private final String thing19;
    private final int type;
    private final String city;
    private final String thing20;
    private final String thing21;
    private final String zipCode;
    private final String thing22;
    private final String thing23;
    private Integer thing24;

    public Integer getLimitedCoordinates() {
        return type;

    }


}
