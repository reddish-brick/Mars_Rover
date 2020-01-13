package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.DIRECTION.EAST;
import static com.thoughtworks.marsrover.DIRECTION.NORTH;
import static com.thoughtworks.marsrover.DIRECTION.SOUTH;
import static com.thoughtworks.marsrover.DIRECTION.WEST;

public enum TURN implements TurnOperation {
  LEFT {
    @Override
    public DIRECTION operation(DIRECTION direction) {
      return getDirection(direction, WEST, EAST, NORTH, SOUTH);
    }
  },
  RIGHT {
    @Override
    public DIRECTION operation(DIRECTION direction) {
      return getDirection(direction, EAST, WEST, SOUTH, NORTH);
    }
  };

  private static DIRECTION getDirection(DIRECTION direction, DIRECTION west, DIRECTION east,
      DIRECTION north, DIRECTION south) {
    if (direction.equals(NORTH)) {
      return west;
    }
    if (direction.equals(SOUTH)) {
      return east;
    }
    if (direction.equals(EAST)) {
      return north;
    }
    if (direction.equals(WEST)) {
      return south;
    }
    return direction;
  }

}
