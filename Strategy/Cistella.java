public class Cistella {
  FormaPagament metodePagament;

  public Cistella() {
    metodePagament = new PagarTarjeta();
  }

  public void canviaFormaPagament(FormaPagament f) {
    metodePagament = f;
  }

  public void realitzarCompra() {
    metodePagament.pagar();
  }
}
