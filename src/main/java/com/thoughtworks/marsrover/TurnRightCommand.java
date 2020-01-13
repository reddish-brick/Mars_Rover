package com.thoughtworks.marsrover;

public class TurnRightCommand implements Command {

  @Override
  public Location execute(Location location) {
    location.setDirection(TURN.RIGHT.operation(location.getDirection()));
    return location;
  }
}
