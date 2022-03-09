const cliente = {
  nome: "Atos",
  idade: 26,
  cpf: "123456789",
  email: "atos@email.com",
};
const chaves = ["nome", "idade", "cpf", "email"];
console.log(cliente[chaves[0]]);

chaves.forEach((info) => console.log(cliente[info]));
