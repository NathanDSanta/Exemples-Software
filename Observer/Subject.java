public interface Subject {
  public void subscriu(Observador obs);

  public void desubscriu(Observador obs);

  public void notifica();
}
