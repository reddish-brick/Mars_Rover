package com.thoughtworks.marsrover;

public class TurnLeftCommand implements Command {

  @Override
  public Location execute(Location location) {
    return location.turnLeft();
  }
}
