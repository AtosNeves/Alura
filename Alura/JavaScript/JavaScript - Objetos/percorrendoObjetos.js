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
  saldo: 100,
  depositar: function (valor) {
    this.saldo += valor;
  },
};

let relatorio = "";
for (let key in cliente) {
  if (typeof cliente[key] === "object" || typeof cliente[key] === "function") {
    continue;
  } else {
    relatorio += (`${key} = ${cliente[key]}\n`);
  }
}
console.log(relatorio);
