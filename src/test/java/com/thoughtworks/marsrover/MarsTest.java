package com.thoughtworks.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsTest {

  @Test
  public void should_return_the_direction_and_location() {
    Mars mars = new Mars(new Location(10, 10), Direction.NORTH);

    assertEquals(Direction.NORTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_N_location_x_10_y_11_when_move_given_direction_N_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), Direction.NORTH);

    mars.move();

    assertEquals(Direction.NORTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(11, mars.getLocation().getY().intValue());
  }
}
