package com.thoughtworks.marsrover;

public class TurnLeftCommand implements Command {

  @Override
  public Mars execute(Mars mars) {
    mars.setDirection(TURN.LEFT.operation(mars.getDirection()));
    return mars;
  }
}
