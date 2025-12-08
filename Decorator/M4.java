/**
 * M4
 */
public class M4 extends Arma {
  public M4() {
    _descripcio = "M4";
  }

  @Override
  public int dany() {
    return 33;
  }

  @Override
  public int retroces() {
    return 5;
  }

  @Override
  public int cadencia() {
    return 666;
  }

  @Override
  public int recarrega() {
    return 307;
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
