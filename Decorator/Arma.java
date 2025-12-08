/**
 * Arma
 */
public abstract class Arma {
  protected String _descripcio;

  public String descripcio() {
    return _descripcio;
  };

  public abstract int dany();

  public abstract int retroces();

  public abstract int cadencia();

  public abstract int recarrega();

  public abstract int nombreBales();

  public abstract boolean silencios();

  @Override
  public String toString() {
    String sortida = descripcio() + "\n"
        + "Dany: " + dany()
        + "Retroces: " + retroces()
        + "Cadencia: " + cadencia()
        + "Recarrega: " + recarrega()
        + "Bales: " + nombreBales()
        + "Silencios?: " + (silencios() ? "Si" : "No");
    return sortida;
  };

}
