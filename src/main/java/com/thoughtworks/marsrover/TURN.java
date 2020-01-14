package com.thoughtworks.marsrover;

public enum TURN implements TurnOperation {
  LEFT {
    @Override
    public DIRECTION turn(DIRECTION direction) {
      return DIRECTION.getDirection((direction.getCode() + 3) % 4);
    }
  },
  RIGHT {
    @Override
    public DIRECTION turn(DIRECTION direction) {
      return DIRECTION.getDirection((direction.getCode() + 1) % 4);
    }
  }
}
