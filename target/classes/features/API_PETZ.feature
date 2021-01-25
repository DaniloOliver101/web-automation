#language: pt
Funcionalidade: Cadastrar novo user e vender um pet
  @API
  Cenario: Venda do PET Rufus para MAria
    Dado o user
      | "mariass" | "Maria" | "Assunção" | "mass@gmail.com" | "1234 | "1198765-4321" |
    E Com o Pet
      | "Brutus" | "Dog" |
    Entao uma nova ordem de venda sera criada
    E O status da order sera alterado para <"delivered">




