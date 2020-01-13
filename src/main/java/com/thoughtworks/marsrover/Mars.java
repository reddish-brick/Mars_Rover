package com.thoughtworks.marsrover;


public class Mars {

  private Location location;
  private Direction direction;

  public Mars(Location location, Direction direction) {
    this.location = location;
    this.direction = direction;
  }

  public Location getLocation() {
    return location;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public Mars move() {
    if (this.getDirection().equals(Direction.NORTH)) {
      this.getLocation().setY(this.getLocation().getY() + 1);
    }
    if (this.getDirection().equals(Direction.SOUTH)) {
      this.getLocation().setY(this.getLocation().getY() - 1);
    }
    if (this.getDirection().equals(Direction.WEST)) {
      this.getLocation().setX(this.getLocation().getX() + 1);
    }
    if (this.getDirection().equals(Direction.EAST)) {
      this.getLocation().setX(this.getLocation().getX() - 1);
    }
    return this;
  }

  public Mars turn(TURN turn) {
    if (turn.equals(TURN.LEFT)) {
      this.setDirection(Direction.WEST);
    }
    return this;
  }
}
