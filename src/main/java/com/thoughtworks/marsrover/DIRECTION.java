package com.thoughtworks.marsrover;

import java.util.Arrays;

public enum DIRECTION {
  NORTH(0),
  EAST(1),
  SOUTH(2),
  WEST(3);

  private Integer code;

  DIRECTION(Integer code) {
    this.code = code;
  }

  public Integer getCode() {
    return code;
  }

  public static DIRECTION getDirection(int code) {
    return Arrays.stream(DIRECTION.values())
        .filter(direction -> direction.getCode() == code)
        .findFirst()
        .orElse(null);
  }
}
