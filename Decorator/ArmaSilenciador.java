/**
 * ArmaSilenciador
 */
public class ArmaSilenciador extends ArmaAccessoris {

  public ArmaSilenciador(Arma a) {
    super(a);
    _descripcio = " + silenciador";
  }

  @Override
  public int dany() {
    return _armaBasica.dany() - 10;
  }

  @Override
  public int retroces() {
    return _armaBasica.retroces();
  }

  @Override
  public int cadencia() {
    return _armaBasica.cadencia() - 20;
  }

  @Override
  public int recarrega() {
    return _armaBasica.recarrega();
  }

  @Override
  public int nombreBales() {
    return _armaBasica.nombreBales();
  }

  @Override
  public boolean silencios() {
    return true;
  }
}
