package io.github.juliojgd.mapstruct.builder;

import java.util.HashMap;
import java.util.Map;


public enum FirstEnum {
  UNKNOWN(-1, "unknown"), APP(1, "app"), TYPE_5(2, ""), TYPE_6(3, ""), TYPE_7(4, ""), TYPE_8(5, ""),
  TYPE_9(6, ""), TYPE_10(7, "");

  private static Map<Integer, FirstEnum> mapByCode = new HashMap<>();

  private static Map<String, FirstEnum> mapByName = new HashMap<>();

  static {
    for (FirstEnum firstEnum : FirstEnum.values()) {
      mapByCode.put(firstEnum.code, firstEnum);
    }
    for (FirstEnum firstEnum : FirstEnum.values()) {
      mapByName.put(firstEnum.description, firstEnum);
    }
  }

  private final Integer code;

  private final String description;


  FirstEnum(Integer code, String description) {
    this.code = code;
    this.description = description;
  }


  public static FirstEnum getChannelById(Integer id) {
    return mapByCode.get(id);
  }

  public static FirstEnum getChannelByName(String description) {
    return mapByName.get(description);
  }

  public Integer getCode() {
    return this.code;
  }

  public String getDescription() {
    return this.description;
  }
}
