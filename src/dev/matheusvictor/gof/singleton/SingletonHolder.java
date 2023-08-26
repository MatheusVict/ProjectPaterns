package dev.matheusvictor.gof.singleton;


/*
 *
 * SingletonHolder
 * @author MatheusVict
 * */
public class SingletonHolder {

  private static class InstanceHolder {
    public static SingletonHolder INSTANCE = new SingletonHolder();
  }
  private SingletonHolder() {
    super();
  }

  public static SingletonHolder getInstance() {
    return InstanceHolder.INSTANCE;
  }
}
