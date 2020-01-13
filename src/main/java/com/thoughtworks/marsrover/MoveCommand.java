package com.thoughtworks.marsrover;

public class MoveCommand implements Command {

  @Override
  public Mars execute(Mars mars) {
    if (mars.getDirection().equals(Direction.NORTH)) {
      mars.getLocation().setY(mars.getLocation().getY() + 1);
    }
    if (mars.getDirection().equals(Direction.SOUTH)) {
      mars.getLocation().setY(mars.getLocation().getY() - 1);
    }
    if (mars.getDirection().equals(Direction.WEST)) {
      mars.getLocation().setX(mars.getLocation().getX() + 1);
    }
    if (mars.getDirection().equals(Direction.EAST)) {
      mars.getLocation().setX(mars.getLocation().getX() - 1);
    }
    return mars;
  }
}
