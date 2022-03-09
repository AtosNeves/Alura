class Main {

  public static void main(String[] args) {
    Funcionario f = new Funcionario();
    Funcionario g = new Gerente();
    Funcionario c = new Contador();
    f.funcao();

  }

}

class Funcionario {

  public void funcao() {

    System.out.println("Funcionário comum");

  }

}

class Gerente extends Funcionario {

  public void funcao() {

    System.out.println("Gerente");

  }

}

class Contador extends Funcionario {

  public void funcao() {

    System.out.println("Contador");
  }

}
