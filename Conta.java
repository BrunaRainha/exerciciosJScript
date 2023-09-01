package br.estacio.modelo;

public class Conta{
  //modificador de acesso (altera a visibilidade dos membros de uma classe)
  //(+)public --> qualquer classe pode acessar
  //(-)private --> apenas a propria classe pode acessar
  //(#)protected --> apenas as classes filhas e do mesmo pacote podem acessar
  //default --> apenas as classes do mesmo pacote podem acessar
  
  //propriedades
  public int numero;
  public String titular;
  public double saldo;

  //comportamentos (função) (membro)
  //podem ter ou nao retorno
  //podem ter ou nao parametro
  
  public void imprimeSaldo(){
    System.out.println("Saldo: R$" + saldo);
  }

  public boolean sacar(double valor){
    if(valor <= saldo && valor > 0){
      saldo = saldo - valor;
      System.out.println("Saque efetuado");
      return true;
    }else{
      System.out.println("Saque invalido");
      return false;
    }
  }

  public boolean depositar(double valor){
    if(valor > 0){
      saldo = saldo + valor;
      System.out.println("Deposito efetuado");
      return true;
    }else{
      System.out.println("Deposito invalido");
      return false;
    }
  }
}
