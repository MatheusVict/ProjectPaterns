package dev.matheusvictor.gof.singleton;


/*
 *
 * SingletonEager
 * @author MatheusVict
 * */
public class SingletonEager {

  private static SingletonEager instance = new SingletonEager();

  private SingletonEager() {
    super();
  }

  public static SingletonEager getInstance() {
    return instance;
  }
}
