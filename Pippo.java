class Pippo {

  static void dummy(Object pippo) {

      if (pippo instanceof final String msg) {

          System.out.println(msg);
        System.out.println(msg+msg);
      }

    
  }

  Boolean isSameNumberValue(AtomicLong a, AtomicLong b) {
  return a.equals(b); // Noncompliant, this is true only if a == b
}

  public void methodA() {
    System.out.println("Errore di connessione");
}
public void methodB() {
    System.out.println("Errore di connessione");
}
}
