/**
 * ArmaAmpliacio
 */
public class ArmaAmpliacio extends ArmaAccessoris {
  public ArmaAmpliacio(Arma a) {
    super(a);
    _descripcio = " + carregador ampliat";
  }

  @Override
  public int dany() {
    return _armaBasica.dany();
  }

  @Override
  public int retroces() {
    return _armaBasica.retroces();
  }

  @Override
  public int cadencia() {
    return _armaBasica.cadencia();
  }

  @Override
  public int recarrega() {
    return _armaBasica.recarrega() + 50;
  }

  @Override
  public int nombreBales() {
    return _armaBasica.nombreBales() * 2;
  }

  @Override
  public boolean silencios() {
    return _armaBasica.silencios();
  }
}
