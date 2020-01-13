package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.Direction.EAST;
import static com.thoughtworks.marsrover.Direction.NORTH;
import static com.thoughtworks.marsrover.Direction.SOUTH;
import static com.thoughtworks.marsrover.Direction.WEST;

public class MoveCommand implements Command {

  @Override
  public Mars execute(Mars mars) {
    if (mars.getDirection().equals(NORTH)) {
      mars.getLocation().setY(mars.getLocation().getY() + 1);
    }
    if (mars.getDirection().equals(SOUTH)) {
      mars.getLocation().setY(mars.getLocation().getY() - 1);
    }
    if (mars.getDirection().equals(WEST)) {
      mars.getLocation().setX(mars.getLocation().getX() - 1);
    }
    if (mars.getDirection().equals(EAST)) {
      mars.getLocation().setX(mars.getLocation().getX() + 1);
    }
    return mars;
  }
}
