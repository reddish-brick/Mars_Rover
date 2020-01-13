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

  @Test
  public void should_return_direction_S_location_x_10_y_9_when_move_given_direction_S_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), Direction.SOUTH);

    mars.move();

    assertEquals(Direction.SOUTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(9, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_E_location_x_11_y_10_when_move_given_direction_E_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), Direction.WEST);

    mars.move();

    assertEquals(Direction.WEST, mars.getDirection());
    assertEquals(11, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_9_y_10_when_move_given_direction_W_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), Direction.EAST);

    mars.move();

    assertEquals(Direction.EAST, mars.getDirection());
    assertEquals(9, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_10_y_10_when_turn_left_given_direction_N_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), Direction.NORTH);

    mars.turn(TURN.LEFT);

    assertEquals(Direction.WEST, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }
}
