package com.thoughtworks.marsrover;

public class TurnLeftCommand implements Command {

  @Override
  public Mars execute(Mars mars) {
    mars.getLocation().setDirection(TURN.LEFT.operation(mars.getLocation().getDirection()));
    return mars;
  }
}
