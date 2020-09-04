package io.github.juliojgd.mapstruct.builder;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Builder(builderClassName = "Builder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TenthRequest {

    private Boolean acceptAThing;

    private String thing1;

    private String thing2;

    private Integer thing3;

    private FifthEnum fifthEnum;

    private Integer thing4;

    private FourthType fourthType;

    private ThirdDataContainer thirdDataContainer;

    private Integer thing7;

    private String thing8;

    private String thing9;

    private List<SecondCResult> filters;


    private String thing10;

    private Map<String, String> extraParams;

    public int getUpperLimit(int defaultUpperLimit) {
        return Objects.nonNull(this.thing4) && this.thing4 > 0 ? this.thing4 : defaultUpperLimit;
    }

}
