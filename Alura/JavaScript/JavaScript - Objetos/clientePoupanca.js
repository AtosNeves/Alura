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

function ClientePoupanca(nome, cpf, email, saldo, saldoPoup) {
  Cliente.call(this, nome, cpf, email, saldo);
  this.saldoPoup = saldoPoup;
}

const Ju = new ClientePoupanca("Ju", "1234564899", "ju@email.com", 100, 200);
console.log(Ju);

ClientePoupanca.prototype.depositarPoup = function (valor) {
  this.saldoPoup = this.saldoPoup + valor;
};

Ju.depositarPoup(100);
console.log(Ju);
