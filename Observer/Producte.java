import java.util.ArrayList;
import java.util.List;

public class Producte implements Subject {
  String nom;
  boolean disponible;
  List<Observador> observadors;

  public Producte(String nom) {
    this.nom = nom;
    disponible = false;
    observadors = new ArrayList<Observador>();
  }

  public void disponible() {
    disponible = true;
    notifica();
  }

  public void indisponible() {
    disponible = false;
    notifica();
  }

  @Override
  public void subscriu(Observador obs) {
    observadors.add(obs);
  }

  @Override
  public void desubscriu(Observador obs) {
    observadors.remove(obs);
  }

  @Override
  public void notifica() {
    for (Observador observer : observadors) {
      observer.actualitza(nom, disponible);
    }
  }
}
