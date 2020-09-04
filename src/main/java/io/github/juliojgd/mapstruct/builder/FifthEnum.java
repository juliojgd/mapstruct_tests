package io.github.juliojgd.mapstruct.builder;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;


public enum FifthEnum {

    UNKNOWN(0, ""),

    TYPE_1(1, ""),

    TYPE_2(2, ""),

    TYPE_3(3, ""),

    TYPE_4(4, "");

    private static Map<Integer, FifthEnum> map = new HashMap<>();

    static {
        for (final FifthEnum fifthEnum : FifthEnum.values()) {
            map.put(fifthEnum.code, fifthEnum);
        }
    }

    @Getter
    private final Integer code;

    @Getter
    private final String description;


    FifthEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }


    public static FifthEnum getFifthEnum(Integer code) {
        return map.get(code);
    }
}