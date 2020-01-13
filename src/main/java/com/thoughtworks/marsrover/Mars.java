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
}
