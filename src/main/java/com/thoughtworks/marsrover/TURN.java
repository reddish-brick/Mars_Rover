package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.DIRECTION.EAST;
import static com.thoughtworks.marsrover.DIRECTION.NORTH;
import static com.thoughtworks.marsrover.DIRECTION.SOUTH;
import static com.thoughtworks.marsrover.DIRECTION.WEST;

public enum TURN implements TurnOperation {
  LEFT {
    @Override
    public DIRECTION operation(DIRECTION direction) {
      if (direction.equals(NORTH)) {
        return WEST;
      }
      if (direction.equals(SOUTH)) {
        return EAST;
      }
      if (direction.equals(EAST)) {
        return NORTH;
      }
      if (direction.equals(WEST)) {
        return SOUTH;
      }
      return direction;
    }
  },
  RIGHT {
    @Override
    public DIRECTION operation(DIRECTION direction) {
      if (direction.equals(NORTH)) {
        return EAST;
      }
      if (direction.equals(SOUTH)) {
        return WEST;
      }
      if (direction.equals(EAST)) {
        return SOUTH;
      }
      if (direction.equals(WEST)) {
        return NORTH;
      }
      return direction;
    }
  }

}
