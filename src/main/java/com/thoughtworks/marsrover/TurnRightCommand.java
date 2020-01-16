package com.thoughtworks.marsrover;

public class TurnRightCommand implements Command {

  @Override
  public Location execute(Location location) {
    return location.turnRight();
  }
}
