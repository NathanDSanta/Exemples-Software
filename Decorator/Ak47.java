/**
 * Ak47
 */
public class Ak47 extends Arma {

  public Ak47() {
    _descripcio = "AK-47";
  }

  @Override
  public int dany() {
    return 36;
  }

  @Override
  public int retroces() {
    return 7;
  }

  @Override
  public int cadencia() {
    return 600;
  }

  @Override
  public int recarrega() {
    return 243;
  }

  @Override
  public int nombreBales() {
    return 30;
  }

  @Override
  public boolean silencios() {
    return false;
  }
}
