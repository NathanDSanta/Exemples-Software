/**
 * ArmaAccessoris
 */
public abstract class ArmaAccessoris extends Arma {
  protected Arma _armaBasica;

  public ArmaAccessoris(Arma a) {
    _armaBasica = a;
    _descripcio = "";
  }

  @Override
  public String descripcio() {
    return _armaBasica.descripcio() + _descripcio;
  };
}
