package com.thoughtworks.marsrover;

import static com.thoughtworks.marsrover.DIRECTION.EAST;
import static com.thoughtworks.marsrover.DIRECTION.NORTH;
import static com.thoughtworks.marsrover.DIRECTION.SOUTH;
import static com.thoughtworks.marsrover.DIRECTION.WEST;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Builder
public class Location {

  private Integer x;
  private Integer y;
  private DIRECTION direction;

  final Function<Location, Location> plusY = location -> Location.builder()
      .x(location.getX())
      .y(location.getY() + 1).direction(location.getDirection()).build();
  final Function<Location, Location> minusY = location -> Location.builder()
      .x(location.getX())
      .y(location.getY() - 1).direction(location.getDirection()).build();
  final Function<Location, Location> minusX = location -> Location.builder()
      .x(location.getX() - 1)
      .y(location.getY()).direction(location.getDirection()).build();
  final Function<Location, Location> plusX = location -> Location.builder()
      .x(location.getX() + 1)
      .y(location.getY()).direction(location.getDirection()).build();

  public Location forward() {
    Map<DIRECTION, Function<Location, Location>> map = new HashMap<>();
    map.put(NORTH, plusY);
    map.put(SOUTH, minusY);
    map.put(WEST, minusX);
    map.put(EAST, plusX);
    return map.get(this.getDirection()).apply(this);
  }
}
