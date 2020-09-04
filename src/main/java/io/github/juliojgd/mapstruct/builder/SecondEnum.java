package io.github.juliojgd.mapstruct.builder;

import java.util.HashMap;
import java.util.Map;

public enum SecondEnum {

  EXCLUDE("", ""),
  INCLUDE("", "");

  private static Map<String, SecondEnum> map = new HashMap<>();

  private final String description;

  private final String secondName;

  SecondEnum(String description, String secondName) {
    this.description = description;
    this.secondName = secondName;
  }

  static {
    for (SecondEnum element : SecondEnum.values()) {
      map.put(element.secondName, element);
    }
  }

  public static SecondEnum getBySorlField(String field) {
    return map.containsKey(field) ? map.get(field) : null;
  }

  public String getDescription() {
    return this.description;
  }

  public String getSecondName() {
    return this.secondName;
  }
}
