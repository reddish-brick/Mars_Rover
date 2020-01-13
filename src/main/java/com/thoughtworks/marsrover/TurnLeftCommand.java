package com.thoughtworks.marsrover;

public class TurnLeftCommand implements Command {

  @Override
  public Location execute(Location location) {
    location.setDirection(TURN.LEFT.operation(location.getDirection()));
    return location;
  }
}
