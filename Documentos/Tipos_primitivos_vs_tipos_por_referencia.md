<span style="color:yellow">Tipos primitivos versus tipos por referência</span>

Os tipos do Java são divididos em primitivos e por referência. Você já trabalhou com váriaveis do tipo int - um dos primitivos. Os outros tipos primitivos são boolean, byte, char, short, long, float, e double. 

Todos os tipos não primitivos são por refrência, assim, as classes que especificam os objetos são pro referência. 

Uma variável de tipo primitivo pode armazenar exatamente um valor de seu tipo declarado por vez. Por exemplo uma variável int pode armazenar um número inteiro de cada vez. Quando outro valor é atribuido a essa variável, ele substitui o anterior -  que é perdido. 

Lembre-se que as variáveis locais não são inicializadas por padrão - dos tipos byte, cahr, short, int, long, float e double como 0, as do tipo boolean como false. Você pode especificar seu próprio valor inicial para uma variável do tipo primitivo atribuindo a ela um valor na sua declaração, como em: 

```java
private int numeroDeEstudante = 10;
```

Os programas utilizam as variáveis de tipo por referência (normalmente chamadas *referências*) para armazenar as localizações de objetos na memória do computador. Dizemos que essa variável referencia um objeto no programa. Objetos que são referenciados podem conter muitas variáveis de instância. 

```java
Scanner input = new Scanner(System.in);
```
Cria um objeto da classe Scanner, então atribui à variável input uma referência a esse objeto Scanner.

```java
Conta c1 = new Conta();
```

Desenvolve um objeto da classe Conta, então atribui à variável minhaConta uma referência, se não forem inicializadas explicitamente, o são por padrão para o valor null - que representa uma "referência à nada"

Para chamar métodos em um objeto, você precisa de uma referência a ele.

Variáveis de tipo primitivo não fazem referência a objetos, assim elas não podem ser usadas para chamar métodos.