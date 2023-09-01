import br.estacio.modelo.Conta;

class Main {
  public static void main(String[] args) {
    //instanciação
    Conta c1 = new Conta();
    Conta c2 = new Conta();
    Conta c3 = new Conta();
    Conta c4 = c1;

    //DOT NOTATION
    c1.numero = 1000;
    c1.titular = "Hwang Hyunjin";
    c1.saldo = 5000;

    c2.numero = 1001;
    c2.titular = "Lee Yongbok";
    c2.saldo = 15000;

    c3.numero = 1001;
    c3.titular = "Lee Yongbok";
    c3.saldo = 15000;

    System.out.println("Numero[c1]: " + c1.numero);
    System.out.println("Titular[c1]: " + c1.titular);
    System.out.println("Saldo[c1]: " + c1.saldo);

    System.out.println("Numero[c2]: " + c2.numero);
    System.out.println("Titular[c2]: " + c2.titular);
    System.out.println("Saldo[c2]: " + c2.saldo);

    System.out.println("Numero[c3]: " + c3.numero);
    System.out.println("Titular[c3]: " + c3.titular);
    System.out.println("Saldo[c3]: " + c3.saldo);

    System.out.println(c2 == c3);
    System.out.println(c2);
    System.out.println(c3);

    System.out.println(c1 == c4);
    System.out.println(c1);
    System.out.println(c4);

    c4.titular = "Hyunlix";
    System.out.println("Titular[c1]: " + c1.titular);
    System.out.println("Titular[c4]: " + c4.titular);
    
//deposito na conta c1
   c1.imprimeSaldo();

  c1.sacar(1000);

  c1.imprimeSaldo();

  c1.depositar(500);

  c1.imprimeSaldo();

  System.out.println(c1.sacar(20000));

  c1.imprimeSaldo();
  }
}
