import java.lang.Thread;

/**
 * Observer
 */
public class Observer {

  public static void main(String[] args) {
    try {
      Producte p1 = new Producte("Producte 1");
      Client c1 = new Client(1);
      p1.subscriu(c1);
      p1.disponible();
      Producte p2 = new Producte("Producte 2");
      Thread.sleep(1000);
      p2.disponible();
      p2.subscriu(c1);
      p1.indisponible();
      Thread.sleep(1000);
      p2.indisponible();
      p1.disponible();
      Thread.sleep(1000);
      Client c2 = new Client(2);
      p1.desubscriu(c1);
      p1.subscriu(c2);
      p2.subscriu(c2);
      p1.indisponible();
      p2.disponible();
      Thread.sleep(1000);
      p2.indisponible();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
