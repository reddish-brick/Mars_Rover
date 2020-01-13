package com.thoughtworks.marsrover;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Mars {

  private Location location;

  public Mars executeCommand(List<Command> commands) {
    commands.stream()
        .forEach(command -> command.execute(this.getLocation()));
    return this;
  }
}
