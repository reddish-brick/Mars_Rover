package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.Direction.EAST;
import static com.thoughtworks.marsrover.Direction.NORTH;
import static com.thoughtworks.marsrover.Direction.SOUTH;
import static com.thoughtworks.marsrover.Direction.WEST;

public enum TURN implements TurnOperation {
  LEFT {
    @Override
    public Direction operation(Direction direction) {
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
    public Direction operation(Direction direction) {
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
