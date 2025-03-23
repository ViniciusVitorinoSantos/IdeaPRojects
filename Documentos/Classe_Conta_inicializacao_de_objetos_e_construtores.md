<span style="color:yellow">Classe Conta : Inicialização de objetos com construtores</span>

Como mencionado quando um objeto de classe Conta é criado, sua variável de instância String chamada nome é inicializada como null por padrão. Mas e se você quiser oferecer um nome ao desenvolver um objeto Conta ?

Cada classe que você declara tem como fornecer um (CONSTRUTOR) com parâmetros que podem ser utilizados para inicializar um objeto de uma classe quando o objeto for criado. O java requer uma chamada de construtor para cada objeto que é desenvolvido, então esse é o ponto ideal para inicializar as variáveis de instância de um objeto. O exemplo a seguir aprimora a classe Conta com um construtor que pode receber um nome e usálo para inicializar a variável de instância nome quando um objeto Conta é criado.


<span style="color:yellow">Declaração de um construtor Conta para inicialização de objetos personalizado</span>

Ao declarar uma class, você pode fornecer seu próprio construtor a fim de especificar a inicialização personalizada para objetos de sua classe. Por exemplo, você pode querer especificar um nome para um objeto Conta quando ele é cirado, 

```java
 Conta conta1 = new Conta("Jane Green");
```

nesse caso, o argumento "Jane Green" de String é passado para o construtor do objeto Conta e é usado para inicializar a variável de instância nome. A instrução anterior requer que a calsse forneça um construtor que recebe apenas um parâmetro String.

```java
//Classe conta com um construtor que inicializa o nome.
public class Conta{
    private String nome;//variável de instância.
    
    //O construtor que inicializa nome com nome do parâmetro.
    public Conta(String nome){//Nome do construtor é o nome da classe. 
        this.nome = nome;
    }
    
    //Método para configurar o nome.
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //Método para recuperar o nome.
    public String getNome(){
        return nome;
    }
    
    
}
```

<span style="color:yellow"> Declaração do construtor Conta</span>

Um construtor deve ter sempre o nome da classe. Já uma lista de parâmetros de um construtor especifica que ele requer um ou mais dados para executar sua tarefa. É indicado que o construtor tem tem um parâmetro String chamado nome. Ao criar um novo objeto Conta, você passará o nome de uma pessoa para o construtor, que receberá esse nome no parâmetro nome. O construtor, então, atribuirá nome à instância variável nome.

<hr>
<span style="color:darkred"><strong><em>Não chamar métodos a partir de construtores!</em></strong></span>
<hr>

<span style="color:yellow">Parâmetro nome do construtor da calsse Conta e método setNome()</span>

Lembre-se que os parâmetros de método são vairáveis locais. O construtor e o método setNome têm um parâmetro chamado nome. Embora esses parâmetros tenham o mesmo identificador (nome), este parâmetro é uma variável local do construtor que não é visivel para o método setNome().

<span style="color:yellow">Classe TesteConta : inicialização de objetos Conta quando eles são criados</span>

O programa TesteConta inicializa dois objetos Conta usando o construtor. O objeto Conta denominado Conta1. A palavra-chave new solicita memória do sistema para armazenar o objeto Conta, então chama implicitamente o construtor da classe correspondente para inicializa-lo. A chamada é indicada pelos parênteses após  o nome da classe, que contém o argumento "Jnae Green" usado para inicializar o nome do novo objeto. A expressão de criação da instância de classe na linha 10 retorna uma referência ao novo objeto, que e atribuído à variável conta1. A linha 11 repete esse processo passando o argumento "John Blue" a fim de inicializar o nome para conta2. As linhas 14 e 15 utilizam o método getNome() de nomes diferentes, confirmando que cada Conta mantém sua própria cópia da variável de instância nome.