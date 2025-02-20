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

`@GeneratedValue`
=> Define que a criação do ID será de forma automática.

`@Enumerated`
=> Informa que aquele atributo é uma classe enum.













# Atividade Realizada no dia 14/02/2025 - Colocar no Notion
- Construir um pacote chamado [endereco] dentro de [model] e criar uma classe [Endereco] com os atributos listados abaixo. Além disso, crie os getters, setters, construtor com todos os parâmetros e construtor sem nenhum parâmetro com lombok.
(logradouro, bairro, cep, cidade, uf, numero, complemento)
* Coloque todos os atributos privados e do tipo String.
