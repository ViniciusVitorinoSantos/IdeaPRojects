# <span style="color:orange">Váriaveis de instância, métodos set e get.</span>


![alt text](robot-LD&R.jpg)

<span style="color:orange">**Nesta sessão, será criado duas calsses  - Conta e TesteConta.**

A classe *TesteConta* é uma classe de aplicativo em que o  método main criara e usará um objeto *Conta* para demosntras as capacidades da classe *Conta*.</span>

---

<span style="color:orange">Classe conta com uma variável de instaância, um método set e um método get.</span>

Difetentes contas normalmente tem diferentes nomes. Por essa razão, a classe *Conta* contém uma variável de instância, nome. Variavéis de instância de uma classe armazanenam ados para cada objeto (isto é, cada instância ) da classe. 
A classe Conta contem dois métodos() → o metodo setNome() → método getNome() 

O método setNome() → Armazena o nome em um objeto Conta.
O metodo getNome() → Obtém o nome em um objeto Conta.

```java
package com.evilcorp;

public class Conta {
    //Variável de instância.
    private String nome;

    //Construtor
    public Conta() {
        this.nome = getNome();
    }

    //Método para definir o nome no objeto.
    public void setNome(String nome) {
        this.nome = nome; //Armazena o nome.
    }

    //Método para obter o nome do objeto.
    public String getNome() {
        return nome; //Retorna o valor do nome para o chamador.
    }
}
```
<span style="color: orange">*Declaração de classe*</span>

```java
public class Conta{
    
}
```

A palavra-chave public é um modificador de acesso. Por enquanto, simplesmente declaramos tada classe pulic. Cada eclaração de classe public deve ser armazenada em um arquivo com o mesmo nome qua a classe e terminar com a extensão .java; do contrário, ocorrerá um erro de compilação. Assim, as classes public Conta e TesteConta devem ser declaradas nos arquivos separados Conta.java e TesteConta.java, respectivamente. 
Cada declaração de classe tem a palavra-chave class seguida imediatamente pelo nome da classe, nesse caso, Conta.

<span style="color:blue">**Usar camel-case**</span>

<span style="color:orange">*Variável de instância nome*</span>
Um objeto tem atributos, implementados como vatriáveis de instância que o acompanham ao longo da sua vida. As variáveis de instância existem antes que os métodos sejam chamados em um objeto, enquanto eles são executados e depois que a execução deles foi concluída. Cada objeto (intância) da classe tem sua própria cópoia das variáveis de instância da classe. Uma classe normalmente contém um ou mais métodos que manipulam as variáveis de instância pertencentes aos objetosparticulares dela.
Variáveis de instância instância são declaradas dentro de uma declaração de classe, mas fora do corpo dos métodos da classe

```java
private String nome;//Variável de instância
```

<span style="color:yellow">Boa prética de programação</span>

<span style="color:green">Preferimos listar as variáveis de instância de uma classe no corpo dela, assim se pode ver o nome e o tipo das variáveis antes de elas serem utilizadas nos métodos da classe. É possivel listar as vatiáveis de instância da classe em qualquer lugar nela, fora das suas instruções de métod, mas espalhar as variáveis de instância pode resutar em um código dificil de ler. </span>

<span style="color:orange">*Miodificadore de acesso public / private*</span>

A maioria das declarações de variáveis de instância é precedida pela palavra-chave private. Da mesma forma que public, (private) é um modificador de acesso. As variáveis ou métodos declarados como o modificador de acesso private só são acessiveis a métodos da classe em que isso ocorre. Assim a variável nome só pode ser empregada nos métodos de cada objeto Conta nesse caso (setNome e getNome).

<span style="color:orange">*Método setNome() da classe Conta*</span>

Analise do codigo da de claração do método setNome:

```java
public void setNome(String nome){
this.nome = nome; // Armazena o nome.
}
```

Nós nos referimos à primeira linha de cada instrução de método como cabeçalho do método. O tipo de retorno do méotodo (que aparece antes do nome deste) especifica a qualidade dos dados que o método retorna ao chamador depois de realizar sua tarefa. O tipo de retorno void indica qu esetNome() executará uma tarefa, mas não retornará (isto é, fornecerá) nenhuma informação ao seu chamador. 
O método setNome() recebe um parâmetro nome do tipo String → que representa o nome que será passado para o método como um argumento.

Os parâmetros são declarados em uma lista de parâmetros que está localizda entre os parênteses que seguem o nome do método.

<span style="color: orange">Parâmetros são variáveis locais</span>

Declaramos todas as variáveis de um aplicativo no método Main(). Variáveis declaradas de um método especifico (como main) são variáveis locais que somente podem ser utilizadas nele. Cada método só pode acessar suas próprias variáveis locais, não aquela dos outros. Quando esse método terminar, os valores de suas variáveis locais são perdidos. Os parâmetros de um método também são variáveis locais dele. 

<span style="color: orange">Corpo do método setName()</span>

Cada corpo de método é delimitado por um par de chaves contendo uma ou mais instruções que executam tarefas do método. Nesse caso, o corpo do método comtém uma única instução que atribui o valor do parâmetro nome (uma String) à variável de intância nome da classe, armazenando assim o nome da conta no objeto. 

Se um método contiver uma variável local com o mesmo nome de uma variável de instância o corpo desse método irá referenciar a variável local em vez da variável de intância. Nesse caso, diz-se que a variável local simula a variável de instância no corpo do método. O corpo do método por usar a palavra-chave <span style="color: red"><strong>(this)</strong></span> para referenciar a variável de instância simulada explicitamente, como mostrado à esquerda da atribuição.

<span style="color:green"><strong>Boa prática de programação:</strong>
Usar a palavra <span style="color: red"><strong>(this)</strong></span> é uma prática amplamente aceita afim de minizar a proliferação de nomes de identificadores.
</span>

<span style="color:orange">*Método getNome() da classe Conta*</span>

O método getNome() 
```java
public String getNome(){
    return nome;//Palavra-chave return retorna o valor nome para o método chamador.
    
}
```
Retorna ao chamador um nome do objeto específico Conta. O método tem uma lista vazia de parâmetros, então não exige informações adicionais para realizar sua tarefa. Ele retorna uma String. Quando um método que especifica um tipo de retorno diferente de <em style="color:red">void</em> é chamado e conclui sua tarefa, ele deve retornar um resultado para seu chamador. Uma instrução que chama o String, como especificado no tipo de retorno da declaração dp método.
A instrução <em style="color:red">return</em> passa o valor da String da variável de instância nome de volta ao chamador. Por exemplo, quando o valor é retornado para a instrução, a instrução o usa para gerar saída do nome.


<span style="color:orange">*Classe TesteConta que cria e usa um objeto da classe Conta*</span>

Em seguida, gostariamos de usar a classe Conta em um aplicativo e chamar cada um dos seus métodos. Uma classe que contém um método main inicia a execução de um aplicativo java. A classe Conta não pode executar por si só porque não contém um método main -  se digitar java Conta na tela de comando, você obterá um erro indicando "Main method not found in class Conta". Para corrigir esse problema, você declarar uma classe separada que contenha um método main ou colocar um método main na classe Conta.


<span style="color:orange">*Classe TesteConta condutora*</span>

Para ajudá-lo a se preparar para os programas maiores que veremos futuramente neste livro e na indústria, usaremos uma xalsse TesteConta separada contendo o método main a fim de testar a classe Conta. Depois que começa a executar main pode chamar outros métodos nessa e em outras classes; estas podem por sua vez chamar outros métodos etc. O método main da classe TesteConta cria um objeto Contae chama os métodosnessa e em outras classes; estas podem por sua vez, chamar outros métodos etc. O méotodo main da classe TesteConta cria um objeto conta e chama os métodos getNome() e setNome(). Essa classe é as vezes denominada classe driver (ou <em style="color: yellow">"Classe condutora"</em>) -> assim como um objeto Pessoa dirige um objeto Carro informando o que fazer, a classe TesteConta orienta o objeto Conta indicando o que fazer ao chamar seus métodos.

````java
//Cria e manipula o objeto Conta
import java.util.Scanner;

public class TesteConta{
    public static void main(String[] args) {
        //Cria o objeto Scanner para obter entrada a partir da janela de comando 
        Scanner input = new Scanner(System.in);
        
        //Cria um objeto conta e o atribui a minhaConta
        Conta minhaConta = new Conta();
        
        //Exibe o valor inicial do nome(null)
        System.out.printf("Nome inicial é : %s%n%n", minhaConta.getNome());
        
        //Solicita e lê o nome
        System.out.println("Por favor digite o nome: ");//Lê uma linha de texto.
        String oNome = input.nextLine();//Insere oNome em minhaConta.
        System.out.println();//Gera saída de uma linha em branco.
        
        //Exibe o nome armazenado no objeto minhaConta
        System.out.printf("O nome no objto minhaConta é %n%s%n " ,minhaConta.getNome() );
    }
}//Fim da classe TesteConta

````

<span style="color:orange">*Objeto Scanner para receber a entrada do usuário*</span>












