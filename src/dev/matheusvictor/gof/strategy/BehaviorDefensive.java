package dev.matheusvictor.gof.strategy;

public class BehaviorDefensive implements Behavior{
  @Override
  public void move() {
    System.out.println("I'm moving defensively!");
  }
}
