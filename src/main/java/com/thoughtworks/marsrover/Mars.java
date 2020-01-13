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

  public Mars executeCommand(Command command) {
    return command.execute(this);
  }

  public Mars turn(TURN turn) {
    if (turn.equals(TURN.LEFT)) {
      this.setDirection(TURN.LEFT.operation(this.direction));
    }
    if (turn.equals(TURN.RIGHT)) {
      this.setDirection(TURN.RIGHT.operation(this.direction));
    }
    return this;
  }
}
