#language: pt
Funcionalidade: Cadastrar novo user e vender um pet
  Eu como administrador do sistema
  devo ser capaz de cadastrar users e pets
  Para que eu possa vender os pets para os users

  Cenario: Venda do PET Rufus para MAria
    Dado o user
      | "mariass" | "Maria" | "Assunção" | "mass@gmail.com" | "1234 | "1198765-4321" |
    E Com o Pet
      | "Rufus" | "Dog" |
    Entao uma nova ordem de venda sera criada
    E o status da venda deve ser alterado para "COMPLETED"