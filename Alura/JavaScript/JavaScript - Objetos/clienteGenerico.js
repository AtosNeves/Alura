function Cliente(nome, cpf, email, saldo) {
  this.nome = nome;
  this.cpf = cpf;
  this.email = email;
  this.saldo = saldo;
  this.saldo = saldo;

  this.depositar = function (valor) {
    this.saldo = saldo + valor;
  };
}

const andre = new Cliente("Andre", "123456789", "andre@gmail.com", 100);
console.log(andre);
