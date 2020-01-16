package com.thoughtworks.marsrover;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MarsRover {

  private Location location;

  public MarsRover executeCommand(List<Command> commands) {
    commands.stream()
        .forEach(command -> this.setLocation(command.execute(this.getLocation())));
    return this;
  }
}
