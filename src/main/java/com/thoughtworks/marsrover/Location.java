package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.DIRECTION.EAST;
import static com.thoughtworks.marsrover.DIRECTION.NORTH;
import static com.thoughtworks.marsrover.DIRECTION.SOUTH;
import static com.thoughtworks.marsrover.DIRECTION.WEST;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Location {

  private Integer x;
  private Integer y;
  private DIRECTION direction;

  public void move() {
    if (direction.equals(NORTH)) {
      y++;
    }
    if (direction.equals(SOUTH)) {
      y--;
    }
    if (direction.equals(WEST)) {
      x--;
    }
    if (direction.equals(EAST)) {
      x++;
    }
  }
}
