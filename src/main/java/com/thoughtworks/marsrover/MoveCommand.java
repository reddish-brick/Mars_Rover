package com.thoughtworks.marsrover;

public class MoveCommand implements Command {

  @Override
  public Location execute(Location location) {
    location.move();
    return location;
  }
}
