# MEDICO, PACIENTE, CONSULTAS

=> O nosso sistema receberá dados de médicos e pacientes. Um médico atende a um paciente por vez. O paciente pode ter várias consultas com diferentes médicos.

1. O nosso sistema é de gestão de médicos para uma clínica. Ele permite o cadastro e gerenciamento de médicos, armazenando suas informações como:
- nome
- email
- CRM
- especialidade
- endereco (logradouro, bairro, cep, cidade, uf, numero, complemento)

2.  Funcionalidades
- Cadastro de médico
- Listagem de médicos cadastrados
- Atualização de dados do médico
- Remoção de médicos

# AULA 02
Verbos/métodos HTTP
`GET` -> É quando você pede algo de retorno.
`POST` -> É quando você passa informações.
PUT
DELETE

Resquest [REQUISIÇÃO] -> é o que você passa esperando o retorno.
Response [RESPOSTA] -> é a resposta que você recebe.

# AULA 03
`DTO` -> Padrão de projetos onde isolamos cada item que está sendo enviado pelo `simulador de requisição`. DATA TRANSFER OBJECT, OBJETO DE TRANSFERÊNCIA DE DADOS.
- Criação de uma classe `record` chamada `DadosCadastroMedico`, onde iremos receber os dados do json e converter em dados autônomos.

`API` -> É um conjuntos de ações e regras para a comunicação entre diferentes ferramentas. Define como os sistemas devem interagir.
Normalmente, uma API oferece dados para serem consumidos pelo frontend.

`POLIMORFISMO`-> É quando um método se comporta de maneira diferente dependendo da forma que é invocado. Significa muitas formas.
- Sobrecarga de método - [OVERLOADING] - Tempo de compilação.
- Sobrescrita de método - [OVERRIDING] - Tempo de execução.

`ABSTRAÇÃO` -> É quando uma classe/método não pode ser instânciada(clonada). [abstract].

## ANOTATIONS - ANOTAÇÕES
1. Anotações do Spring Web
`@RequestMapping("/medicos")`
=> Define que a classe está mapeada para a url[endpoint] /medicos.

`@RestController`
=> Define que a classe é uma classe controladora no Spring.

`@GetMapping` 
=> Define que o método será somente leitura.

`@PostMapping`
=> Define que o método irá receber dados.

`@PutMapping`
=> Atualiza alguma informação.

`@DeleteMapping`
=> Deleta dados.

`@ResquestBody`
=> é utilizada quando você irá receber dados pelo simulador de requisição [insomnia], e informa que os dados serão enviados no corpo da requisição.

2. Anotações do lombok
`@Getter`
=> Cria todos os getters para todos os atributos da classe.

`@Setter`
=> Cria todos os setters para todos os atributos da classe.

`@AllArgsConstructor`
=> Cria um método construtor com todos os atributos.

`@NoArgsConstructor`
=> Cria um método construtor com nenhum dos atributos.

3. Anotações do Spring JPA
`@Entity` 
=> É uma anotação que você irá utilizar para informar ao springboot que a classe anotada será uma tabela no banco de dados.

`@Table`
=> É uma anotação que você irá utilizar para criar no Banco de dados uma tabela com o nome da classe anotada.
* Você pode alterar o padrão do nome da tabela utilizando: @Table(name = "nomedatabela").

`@Id`
=> Define que o atributo será uma chave primária na tabela.

`@GeneratedValue(strategy = GenerationType.IDENTITY)`
=> Define que a criação do ID será de forma automática.
=> strategy -> é a estratégia utilizada.
=> GenerationType -> é o tipo de geração utilizada.
=> IDENTITY -> a geração automática será através do ID.

`@Enumerated`
=> Informa que aquele atributo é uma classe enum.

`@Embedded`
=> Anota que uma classe faz parte dessa tabela no banco de dados.

`@Embeddable`
=> Anota que essa classe irá fazer parte de uma tabela de uma outra classe.


4. BANCO DE DADOS

`Chave primária (PK)` -> é o atributo que identifica a tabela no banco de dados.
`Chave estrangeira (FK)` -> é o atributo que se relaciona com uma tabela que possui esse atributo como chave primária, no banco de dados.


5. PADROES DE PROJETO
`DTO` -> Padrão de projetos onde isolamos cada item que está sendo enviado pelo `simulador de requisição`. DATA TRANSFER OBJECT, OBJETO DE TRANSFERÊNCIA DE DADOS.
- Criação de uma classe `record` chamada `DadosCadastroMedico`, onde iremos receber os dados do json e converter em dados autônomos.

`DAO` -> é um padrão de projetos em que separamos a lógica do acesso ao banco de dados do restante da aplicação.

`INTERFACE` -> é um tipo de padrão de projetos presente no java onde uma classe é declarada e ela possui atributos constantes e não pode ser instânciada. É conhecida como uma classe de contrato, onde você poderá utilizar os métodos e atributos dessa classe.

`INJEÇÃO DE DEPÊNDECIAS` -> é um tipo de padrão de projetos [DI] onde você informa ao springboot que ele irá ficar responsável pela criação de determinado dado (ele que conhece como funciona).


# Atividade Realizada no dia 14/02/2025 - Colocar no Notion
- Construir um pacote chamado [endereco] dentro de [model] e criar uma classe [Endereco] com os atributos listados abaixo. Além disso, crie os getters, setters, construtor com todos os parâmetros e construtor sem nenhum parâmetro com lombok.
(logradouro, bairro, cep, cidade, uf, numero, complemento)
* Coloque todos os atributos privados e do tipo String.


# Atividade Realizada no dia 21/02/2025 
1. Criar um novo projeto chamado [api_produtos] através do site do inicializador do spring boot.

2. No momento da escolha das depêndecias, escolher as seguintes:
- Spring boot devtools
- Spring Web
- Lombok

3. No projeto, utilizar o padrão de projetos MVC.
- Criar um pacote [controller] e incluir uma classe controladora chamada [ProdutoController].
- Nessa classe, utilizar um endpoint e também um método que irá receber informações pelo insomnia. Essas informações deverão ser exibidas no terminal.
- Lembrar de utilizar as anotations das depêndecias.

4. Criar uma pasta chamada [model] e criar uma classe [Produto]. Essa classe será uma classe modelo. 
- Essa classe deverá ter os seguintes atributos privados:
- id;
- nome;
- preco;
- Utilize na classe model as anotations para transformar essa classe em uma tabela no banco de dados e também para que o spring entenda que essa classe é uma classe de entidade.


# Criar um novo model chamado [paciente]
1. Nessa classe [Paciente.java], inclua as características nome, cpf, email, senha, telefone.
2. Além disso, utilize a classe [Endereco.java] para receber o endereço do Paciente.
3. Faça os testes pelo insomnia para saber se no banco de dados h2, está sendo recebido os dados.


# Criar um Update para o paciente nos campos
nome, email, telefone, endereco


# RELACIONAMENTO ENTRE TABELAS NO SPRINGBOOT
`@OneToOne` ->  Um para um. (Uma consulta está ligada a um único paciente).
`@OneToMany` -> Um para muitos. (Um médico tem várias consultas).
`@ManyToOne` -> Muitos para um. (Muitas consultas para um unico médico).
`@ManyToMany` -> Muitos para muitos. (Muitos pacientes para muitas consultas).

`@JoinColumn(name='fk')` -> Define o nome da coluna `alias` no banco que faz a ligação.

OBS:
1. Sempre defina o lado "dono" da `relação(@JoinColumn) `no lado de quem tem a `FK(chave estrangeira)`.
2. Use o `Cascade` se quiser que a operação como `persist` ou `remove` sejam propagadas.

