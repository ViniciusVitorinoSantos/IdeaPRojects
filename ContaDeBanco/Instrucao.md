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





