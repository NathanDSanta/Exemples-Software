/**
 * Revolver
 */
public class Revolver extends Arma {

  public Revolver() {
    _descripcio = "Revolver";
  }

  @Override
  public int dany() {
    return 86;
  }

  @Override
  public int retroces() {
    return 8;
  }

  @Override
  public int cadencia() {
    return 85;
  }

  @Override
  public int recarrega() {
    return 230;
  }

  @Override
  public int nombreBales() {
    return 8;
  }

  @Override
  public boolean silencios() {
    return false;
  }
}
