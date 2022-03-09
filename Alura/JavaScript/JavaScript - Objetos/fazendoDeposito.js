const cliente = {
  nome: "Atos",
  idade: 26,
  cpf: "123456789",
  email: "atos@email.com",
  dependentes: [
    {
      nome: "sara",
      parentesco: "filha",
      dataNasc: "20/03/2011",
    },
  ],
  saldo:100,
  depositar:function(valor){
      this.saldo+=valor;
  }
};
console.log(cliente.saldo);
cliente.depositar(30);
console.log(cliente.saldo);