package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.DIRECTION.EAST;
import static com.thoughtworks.marsrover.DIRECTION.NORTH;
import static com.thoughtworks.marsrover.DIRECTION.SOUTH;
import static com.thoughtworks.marsrover.DIRECTION.WEST;

public class MoveCommand implements Command {

  @Override
  public Mars execute(Mars mars) {
    final Location location = mars.getLocation();
    if (mars.getDirection().equals(NORTH)) {
      location.setY(location.getY() + 1);
    }
    if (mars.getDirection().equals(SOUTH)) {
      location.setY(location.getY() - 1);
    }
    if (mars.getDirection().equals(WEST)) {
      location.setX(location.getX() - 1);
    }
    if (mars.getDirection().equals(EAST)) {
      location.setX(location.getX() + 1);
    }
    return mars;
  }
}
