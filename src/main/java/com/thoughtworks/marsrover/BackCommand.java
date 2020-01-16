package com.thoughtworks.marsrover;

public class BackCommand implements Command {

  @Override
  public Location execute(Location location) {
    return location.back();
  }
}
