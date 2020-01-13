package com.thoughtworks.marsrover;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsTest {

  @Test
  public void should_return_the_direction_and_location() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.NORTH);

    assertEquals(DIRECTION.NORTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_N_location_x_10_y_11_when_move_given_direction_N_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.NORTH);

    mars.executeCommand(asList(new MoveCommand()));

    assertEquals(DIRECTION.NORTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(11, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_9_when_move_given_direction_S_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.SOUTH);

    mars.executeCommand(asList(new MoveCommand()));

    assertEquals(DIRECTION.SOUTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(9, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_E_location_x_11_y_10_when_move_given_direction_E_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.WEST);

    mars.executeCommand(asList(new MoveCommand()));

    assertEquals(DIRECTION.WEST, mars.getDirection());
    assertEquals(9, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_9_y_10_when_move_given_direction_W_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.EAST);

    mars.executeCommand(asList(new MoveCommand()));

    assertEquals(DIRECTION.EAST, mars.getDirection());
    assertEquals(11, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_10_y_10_when_turn_left_given_direction_N_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.NORTH);

    mars.executeCommand(asList(new TurnLeftCommand()));

    assertEquals(DIRECTION.WEST, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_E_location_x_10_y_10_when_turn_left_given_direction_S_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.SOUTH);

    mars.executeCommand(asList(new TurnLeftCommand()));

    assertEquals(DIRECTION.EAST, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_N_location_x_10_y_10_when_turn_left_given_direction_E_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.EAST);

    mars.executeCommand(asList(new TurnLeftCommand()));

    assertEquals(DIRECTION.NORTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_10_when_turn_left_given_direction_W_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.WEST);

    mars.executeCommand(asList(new TurnLeftCommand()));

    assertEquals(DIRECTION.SOUTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_E_location_x_10_y_10_when_turn_right_given_direction_N_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.NORTH);

    mars.executeCommand(asList(new TurnRightCommand()));

    assertEquals(DIRECTION.EAST, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_10_y_10_when_turn_right_given_direction_S_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.SOUTH);

    mars.executeCommand(asList(new TurnRightCommand()));

    assertEquals(DIRECTION.WEST, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_10_when_turn_right_given_direction_E_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.EAST);

    mars.executeCommand(asList(new TurnRightCommand()));

    assertEquals(DIRECTION.SOUTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_N_location_x_10_y_10_when_turn_right_given_direction_W_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.WEST);

    mars.executeCommand(asList(new TurnRightCommand()));

    assertEquals(DIRECTION.NORTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_9_y_10_when_turn_left_and_move_given_direction_N_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.NORTH);

    mars.executeCommand(asList(new TurnLeftCommand(), new MoveCommand()));

    assertEquals(DIRECTION.WEST, mars.getDirection());
    assertEquals(9, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_9_y_10_when_turn_right_and_move_given_direction_S_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.SOUTH);

    mars.executeCommand(asList(new TurnRightCommand(), new MoveCommand()));

    assertEquals(DIRECTION.WEST, mars.getDirection());
    assertEquals(9, mars.getLocation().getX().intValue());
    assertEquals(10, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_9_when_turn_right_and_move_given_direction_E_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.EAST);

    mars.executeCommand(asList(new TurnRightCommand(), new MoveCommand()));

    assertEquals(DIRECTION.SOUTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(9, mars.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_9_when_turn_left_and_move_given_direction_W_location_x_10_y_10() {
    Mars mars = new Mars(new Location(10, 10), DIRECTION.WEST);

    mars.executeCommand(asList(new TurnLeftCommand(), new MoveCommand()));

    assertEquals(DIRECTION.SOUTH, mars.getDirection());
    assertEquals(10, mars.getLocation().getX().intValue());
    assertEquals(9, mars.getLocation().getY().intValue());
  }
}
