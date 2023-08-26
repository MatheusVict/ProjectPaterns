package dev.matheusvictor.gof.strategy;

public class BehaviorAggressive implements Behavior{
  @Override
  public void move() {
    System.out.println("I'm moving aggressively!");
  }
}
