package com.thoughtworks.marsrover;

public class TurnRightCommand implements Command {

  @Override
  public Location execute(Location location) {
    location.setDirection(TURN.RIGHT.turn(location.getDirection()));
    return location;
  }
}
