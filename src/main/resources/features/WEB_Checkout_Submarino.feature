#language: pt
Funcionalidade: Checkout Submarino

  @WEB
  Cenario: Adicionar um produto ao carrinho com sucesso
    Dado que eu acesso a pagina "https://www.submarino.com.br"
    E que realizo uma pesquisa por "Refrigerador Electrolux"
    E na lista eu procuro pelo ""
    Quando selecionar e validar
    E ao incluir o item no carrinho
    Entao devo poder validar os dados do produto