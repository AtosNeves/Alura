class Cliente {
  constructor(nome, email, cpf, saldo) {
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.saldo = saldo;
  }

  depositar(valor) {
    this.saldo = saldo + valor;
  }
  exibirSaldo() {
    console.log(this.saldo);
  }
}

const andre = new Cliente("André", "andre@email.com", "12233665544", 100);
console.log(andre);
