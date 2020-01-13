package com.thoughtworks.marsrover;

public class TurnRightCommand implements Command {

  @Override
  public Mars execute(Mars mars) {
    mars.setDirection(TURN.RIGHT.operation(mars.getDirection()));
    return mars;
  }
}
