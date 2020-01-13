package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.Direction.EAST;
import static com.thoughtworks.marsrover.Direction.NORTH;
import static com.thoughtworks.marsrover.Direction.SOUTH;
import static com.thoughtworks.marsrover.Direction.WEST;

public enum TURN implements TurnOperation {
  LEFT {
    @Override
    public Direction operation(Direction direction) {
      if (direction.equals(Direction.NORTH)) {
        return WEST;
      }
      if (direction.equals(Direction.SOUTH)) {
        return EAST;
      }
      if (direction.equals(Direction.EAST)) {
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
      if (direction.equals(Direction.NORTH)) {
        return EAST;
      }
      if (direction.equals(Direction.SOUTH)) {
        return WEST;
      }
      if (direction.equals(Direction.EAST)) {
        return SOUTH;
      }
      if (direction.equals(Direction.WEST)) {
        return NORTH;
      }
      return direction;
    }
  }

}
