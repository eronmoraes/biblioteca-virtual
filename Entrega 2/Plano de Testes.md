### Cenário 1:

Dado que o estoque do livro1 é de 9 unidades

Quando informo uma venda de 3 unidades

Então a venda é registrada

E o estoque passa a ser de 6 unidades


### Cenário 2:

Dado que o estoque da revista1 é de 5 unidades

Quando informo uma venda de 6 unidades

Então a venda não é registrada

E exibe na tela a mensagem de "Estoque Insuficiente"


### Cenário 3:

Dado que o usuario irá comprar mais do mesmo produto

Quando o usuário seleciona a HQ1 a ser adicionado ao carrinho 2 vezes

Então adiciona HQ1 no carrinho 2 vezes

E a venda de 2 HQ1 é registrada
