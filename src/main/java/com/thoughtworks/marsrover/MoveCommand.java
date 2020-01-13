package com.thoughtworks.marsrover;

public class MoveCommand implements Command {

  @Override
  public Mars execute(Mars mars) {
    mars.getLocation().move();
    return mars;
  }
}
