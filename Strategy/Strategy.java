/**
 * Main
 */
public class Strategy {

  public static void main(String[] args) {
    Cistella cis = new Cistella();
    cis.realitzarCompra();
    cis.canviaFormaPagament(new PagarBizum());
    cis.realitzarCompra();
    cis.canviaFormaPagament(new PagarPaypal());
    cis.realitzarCompra();
    cis.canviaFormaPagament(new PagarApplePay());
    cis.realitzarCompra();
    cis.canviaFormaPagament(new PagarGooglePay());
    cis.realitzarCompra();
  }
}
