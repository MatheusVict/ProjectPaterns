package dev.matheusvictor.gof;

public class Test {
  public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstance();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstance();
    System.out.println(eager);

    SingletonHolder holder = SingletonHolder.getInstance();
    System.out.println(holder);
  }
}
