/**
 * ArmaEmpunyadura
 */
public class ArmaEmpunyadura extends ArmaAccessoris {
  public ArmaEmpunyadura(Arma a) {
    super(a);
    _descripcio = " + empunyadura";
  }

  @Override
  public int dany() {
    return _armaBasica.dany();
  }

  @Override
  public int retroces() {
    return _armaBasica.retroces() - 2;
  }

  @Override
  public int cadencia() {
    return _armaBasica.cadencia();
  }

  @Override
  public int recarrega() {
    return _armaBasica.recarrega() - 30;
  }

  @Override
  public int nombreBales() {
    return _armaBasica.nombreBales();
  }

  @Override
  public boolean silencios() {
    return _armaBasica.silencios();
  }
}
