package dev.matheusvictor.gof.strategy;

public class Test {

  public static void main(String[] args) {
    Robot robot = new Robot();

    robot.setStrategy(new BehaviorNormal());


    robot.move();

    System.out.println("Changing strategy...");

    robot.setStrategy(new BehaviorDefensive());

    robot.move();

    System.out.println("Changing strategy...");

    robot.setStrategy(new BehaviorAggressive());

    robot.move();
  }
}
