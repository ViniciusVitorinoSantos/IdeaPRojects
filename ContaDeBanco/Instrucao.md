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
public class Conta
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

<span style="color:orange">*Método set da classe Conta*</span>

Analise do codigo da de claração do método setNome:
```java
public void setNome(String nome){
this.nome = nome; // Armazena o nome.
}
```

Nós nos referimos à primeira linha de cada instrução de método como cabeçalho do método. O tipo de retorno do méotodo (que aparece antes do nome deste) especifica a qualidade dos dados que o método retorna ao chamador depois de realizar sua tarefa. O tipo de retorno void indica qu esetNome() executará uma tarefa, mas não retornará (isto é, fornecerá) nenhuma informação ao seu chamador. 
O método setNome() recebe um parâmetro nome do tipo String → que representa o nome que será passado para o método como um argumento.

Os parâmetros são declaradosem uma lista de parâmetros que está localizda entre os parênteses que seguem o nome do método





