package com.thoughtworks.marsrover;

public class TurnRightCommand implements Command {

  @Override
  public Mars execute(Mars mars) {
    mars.getLocation().setDirection(TURN.RIGHT.operation(mars.getLocation().getDirection()));
    return mars;
  }
}
