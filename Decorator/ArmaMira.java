/**
 * ArmaMira
 */
public class ArmaMira extends ArmaAccessoris {

  public ArmaMira(Arma a) {
    super(a);
    _descripcio = " + mira";
  }

  @Override
  public int dany() {
    return _armaBasica.dany();
  }

  @Override
  public int retroces() {
    return _armaBasica.retroces() - 20;
  }

  @Override
  public int cadencia() {
    return _armaBasica.cadencia();
  }

  @Override
  public int recarrega() {
    return _armaBasica.recarrega() + 20;
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
