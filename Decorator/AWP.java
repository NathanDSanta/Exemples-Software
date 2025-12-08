/**
 * AWP
 */
public class AWP extends Arma {

  public AWP() {
    _descripcio = "AWP";
  }

  @Override
  public int dany() {
    return 115;
  }

  @Override
  public int retroces() {
    return 2;
  }

  @Override
  public int cadencia() {
    return 41;
  }

  @Override
  public int recarrega() {
    return 370;
  }

  @Override
  public int nombreBales() {
    return 5;
  }

  @Override
  public boolean silencios() {
    return false;
  }
}
