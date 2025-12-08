/**
 * Decorator
 */
public class Decorator {

  public static void main(String[] args) {
    Arma fusil = new Ak47();
    Arma franctirador = new AWP();
    System.out.println(fusil);
    System.out.println(franctirador);
    Arma fusilMillorat = new ArmaSilenciador(fusil);
    Arma franctiradorMillorat = new ArmaAmpliacio(franctirador);
    System.out.println(fusilMillorat);
    System.out.println(franctiradorMillorat);
    fusilMillorat = new ArmaEmpunyadura(fusilMillorat);
    System.out.println(fusilMillorat);
    franctiradorMillorat = new ArmaSilenciador(franctiradorMillorat);
    System.out.println(franctiradorMillorat);
  }
}
