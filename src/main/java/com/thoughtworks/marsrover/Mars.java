package com.thoughtworks.marsrover;


import java.util.List;

public class Mars {

  private Location location;
  private DIRECTION direction;

  public Mars(Location location, DIRECTION direction) {
    this.location = location;
    this.direction = direction;
  }

  public Location getLocation() {
    return location;
  }

  public DIRECTION getDirection() {
    return direction;
  }

  public void setDirection(DIRECTION direction) {
    this.direction = direction;
  }

  public Mars executeCommand(List<Command> commands) {
    commands.stream()
        .forEach(command -> command.execute(this));
    return this;
  }
}
