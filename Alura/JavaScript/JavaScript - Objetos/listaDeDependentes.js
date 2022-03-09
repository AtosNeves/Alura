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
};
cliente.dependentes.push({
  nome: "Samia Maria",
  parentesco: "filha",
  dataNasc: "04/01/2014",
});
//console.log(cliente);

const filhaMaisNova = cliente.dependentes.filter(
  (dependente) => dependente.dataNasc === "04/01/2014"
);
console.log(filhaMaisNova[0].nome);