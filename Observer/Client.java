/**
 * Client
 */
public class Client implements Observador {
  int id;

  public Client(int id) {
    this.id = id;
  }

  @Override
  public void actualitza(String prod, boolean disp) {
    System.out.println("Notificacio client " + id);
    System.out.println(prod + ": " + (disp ? "Disponible" : "Indisponible"));
    System.out.println();
  };
}
