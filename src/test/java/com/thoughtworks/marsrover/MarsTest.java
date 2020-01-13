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
}
