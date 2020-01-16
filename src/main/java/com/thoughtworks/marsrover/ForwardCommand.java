package com.thoughtworks.marsrover;

public class ForwardCommand implements Command {

  @Override
  public Location execute(Location location) {
   return location.forward();
  }
}
