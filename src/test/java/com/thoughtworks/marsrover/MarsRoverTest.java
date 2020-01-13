package com.thoughtworks.marsrover;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsRoverTest {

  @Test
  public void should_return_the_direction_and_location() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.NORTH));

    assertEquals(DIRECTION.NORTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_N_location_x_10_y_11_when_move_given_direction_N_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.NORTH));

    marsRover.executeCommand(asList(new MoveCommand()));

    assertEquals(DIRECTION.NORTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(11, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_9_when_move_given_direction_S_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.SOUTH));

    marsRover.executeCommand(asList(new MoveCommand()));

    assertEquals(DIRECTION.SOUTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(9, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_E_location_x_11_y_10_when_move_given_direction_E_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.WEST));

    marsRover.executeCommand(asList(new MoveCommand()));

    assertEquals(DIRECTION.WEST, marsRover.getLocation().getDirection());
    assertEquals(9, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_9_y_10_when_move_given_direction_W_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.EAST));

    marsRover.executeCommand(asList(new MoveCommand()));

    assertEquals(DIRECTION.EAST, marsRover.getLocation().getDirection());
    assertEquals(11, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_10_y_10_when_turn_left_given_direction_N_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.NORTH));

    marsRover.executeCommand(asList(new TurnLeftCommand()));

    assertEquals(DIRECTION.WEST, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_E_location_x_10_y_10_when_turn_left_given_direction_S_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.SOUTH));

    marsRover.executeCommand(asList(new TurnLeftCommand()));

    assertEquals(DIRECTION.EAST, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_N_location_x_10_y_10_when_turn_left_given_direction_E_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.EAST));

    marsRover.executeCommand(asList(new TurnLeftCommand()));

    assertEquals(DIRECTION.NORTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_10_when_turn_left_given_direction_W_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.WEST));

    marsRover.executeCommand(asList(new TurnLeftCommand()));

    assertEquals(DIRECTION.SOUTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_E_location_x_10_y_10_when_turn_right_given_direction_N_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.NORTH));

    marsRover.executeCommand(asList(new TurnRightCommand()));

    assertEquals(DIRECTION.EAST, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_10_y_10_when_turn_right_given_direction_S_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.SOUTH));

    marsRover.executeCommand(asList(new TurnRightCommand()));

    assertEquals(DIRECTION.WEST, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_10_when_turn_right_given_direction_E_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.EAST));

    marsRover.executeCommand(asList(new TurnRightCommand()));

    assertEquals(DIRECTION.SOUTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_N_location_x_10_y_10_when_turn_right_given_direction_W_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.WEST));

    marsRover.executeCommand(asList(new TurnRightCommand()));

    assertEquals(DIRECTION.NORTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_9_y_10_when_turn_left_and_move_given_direction_N_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.NORTH));

    marsRover.executeCommand(asList(new TurnLeftCommand(), new MoveCommand()));

    assertEquals(DIRECTION.WEST, marsRover.getLocation().getDirection());
    assertEquals(9, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_W_location_x_9_y_10_when_turn_right_and_move_given_direction_S_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.SOUTH));

    marsRover.executeCommand(asList(new TurnRightCommand(), new MoveCommand()));

    assertEquals(DIRECTION.WEST, marsRover.getLocation().getDirection());
    assertEquals(9, marsRover.getLocation().getX().intValue());
    assertEquals(10, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_9_when_turn_right_and_move_given_direction_E_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.EAST));

    marsRover.executeCommand(asList(new TurnRightCommand(), new MoveCommand()));

    assertEquals(DIRECTION.SOUTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(9, marsRover.getLocation().getY().intValue());
  }

  @Test
  public void should_return_direction_S_location_x_10_y_9_when_turn_left_and_move_given_direction_W_location_x_10_y_10() {
    MarsRover marsRover = new MarsRover(new Location(10, 10, DIRECTION.WEST));

    marsRover.executeCommand(asList(new TurnLeftCommand(), new MoveCommand()));

    assertEquals(DIRECTION.SOUTH, marsRover.getLocation().getDirection());
    assertEquals(10, marsRover.getLocation().getX().intValue());
    assertEquals(9, marsRover.getLocation().getY().intValue());
  }
}
