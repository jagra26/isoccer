# isoccer
#FUNCIONALIDADES
  
  #ADICIONAR PESSOAS
    
    Essa funcionalidade é acionada pelo método "addPessoa"(linha 77 da classe Sistema) que chama os métodos
    "addPresidente"(linha 109 da classe Sistema), "addTecnico"(linha 134 da classe Sistema), "addJogador"(linha 153 da classe Sistema), 
    "addFuncionario"(linha 191 da classe Sistema) e "addSocio"(linha 427 da classe Sistema). Todos eles, exceto o "addFuncionario" 
    e o "addSocio" seguem o mesmo padrão, recolhem dados do usuário, e adicionam uma nova pessoa no Sistema, usando esses dados
    como parâmetro para os respectivos tipos de pessoa. O metodo "addSocio" faz uma checagem se há presidente registrado,
    pois as taxas dependem do presidente, e chama um construtor de Socio que recolhe os dados do usuario, para em seguida adicionar 
    o novo socio ao sistema.
    O método "addFuncionario" consiste num switch que chama o construtor certo para aquele tipo de pessoa, os dados do usuário são
    recolhidos pelo próprio construtor. Ele foi feito desta forma pois há vários tipos diferentes de funcionários, se os dados fossem 
    recolhidos no "addFuncionario" o código ficaria muito poluido, apesar de funcionar igualmente. Esta estratégia poderia ter sido 
    utilizada nos outros métodos, porém, como eles são curtos não foi necessário.
    
  #LISTAR PESSOAS
  
    Essa funcionalidade é acionada pelo método "listPessoa"(linha 228 da classe Sistema) que consiste num switch que chama os metodos
    "listPresidente"(linha 268 da classe Sistema), "listTecnico"(linha 278 da classe Sistema), "listTime"(linha 288 da classe Sistema), 
    "listFuncionario"(linha 298 da classe Sistema) e "listSocio(linha 436 da classe Sistema). Tanto "listTecnico" como "listPresidente"
    funcionam da mesma forma. Imprimem na tela os dados do tecnico e do presidente do clube, respectivamente, os acessando diretamente.
    Já "listTime" e "listFuncionario" funcionam com um loop que percorre a lista (ArrayList) de jogadores 
    e funcionários, respectivamente.
    toda vez que chega a um elemento da lista ela imprime os dados deles, usando o metodo "toString". Diferentemente dos métodos 
    anteriores, nestes se usa um polimorfismo dinâmico, se sobreescreve o método "toString" nas classes Pessoa, Motorista, Jogador e 
    Médico. Este método passa a retornar uma string que diz os dados de cada classe.
    Com "listSocio" há a possibilidade de: 
    listar a quantidade de sócios, usando o método "size"(da collection ArrayList) aplicado na lista de sócios do sistema. 
    A quantidade de adimplentes, usando o metodo "adimplentes"(linha 463 da classe Sistema) que percorre a lista de sócios, somando
    a um contador toda vez que se encontra um sócio adimplente.
    A quantidade de inadimplentes, fazendo a subtrção da quantidade de sócios pela quantidade de adimplentes.
    Listar os dados dos sócios, usando a função "listDados"(linha 472 da classe Sistema) que funciona de maneira analoga ao 
    "listTecnico" com um polimorfismo de "toString" e percorrendo a lista de Sócios.
    
  #ADICIONAR RECURSOS FISICOS
  
    Essa funcionalidade é analoga a primeira, o método "addRecursos"(linha 395 da classe Sistema) chama os métodos 
    "addBus"(linha 308 da classe Sistema), "addEstadio"(linha 338 da classe Sistema) e "addCT"(linha 356 da classe Sistema).
    Estes recolhem dados do usuario, direta ou indiretamente, e adicionam os onibus, 
    estadio e centro de treinamento ao sistema, respectivamente.
    
  #LISTAR RECURSOS FISICOS
  
    Essa funcionalidade é analoga a segunda, o método "listRecursos"(linha 366 da classe Sistema) chama os metodos 
    "listBus"(linha 322 da classe Sistema), "listEstadio"(linha 341 da classe Sistema) e "listCT"(linha 359 da classe Sistema).
    Que funcionam de maneira analoga ao metodo "listPresidente".
    
  #LOGIN E SENHA
  
    No método "rodar"(linha 29 da classe Sistema) pede-se do usuario um login e uma senha para poder acessar o sistema, essas
    informações são checadas com as que tem no sistema (login "123" e senha "bolinh0". O programa fica em loop até o 
    usuario acertar login e senha, quando o metodo imprime o menu inicial e libera o sistema para o usuario.

#CLASSES
  
  #SISTEMA
  
     Essa classe foi criada para concentrar tudo que o clube tem, há um presidente, um técnico, uma lista de jogadores (time),
     uma lista de funcionários, uma lista de sócios, uma lista de inteiros representado os onibus, um estádio e um centro de treinamento
     Presidente e técnico foram postos fora de listas de pessoas pois só há um por clube, então os colocar fora de uma lista facilita o 
     acesso aos seus dados. Jogadores apesarem de serem funcionários do clube, ficam em uma lista separada dos demais. Pois há um numero 
     grande de jogadores num clube e eles ficariam espalhados numa lista generica, desta forma o acesso é simplificado.
     O estádio e o centro de treinamento, cada clube só possui um, não necessitando de uma lista. Os onibus são representados por 
     inteiros, já que disponibilidade é único dado requerido do ônibus.
     
   #PESSOA
   
    Essa classe serve de base





login 123
senha bolinh0
