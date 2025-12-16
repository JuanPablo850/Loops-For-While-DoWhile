# 🔁 Estruturas de Repetição (Loops) em Java

Este repositório foi criado com o objetivo de **estudar, praticar e entender** o funcionamento das **estruturas de repetição (loops)** na linguagem **Java**.

Os loops permitem executar um bloco de código **várias vezes**, de forma controlada, evitando repetição de código e facilitando a lógica do programa.

---

## 📚 Conteúdo do Repositório

Neste projeto você encontrará exemplos e exercícios utilizando:

- Loop `for`
- Loop `while`
- Loop `do while`

Os arquivos estão organizados dentro da pasta `src`, separados por exercícios (`Ex01.java`, `Ex02.java`, etc.).

---

## ☕ O que são Loops em Java?

Loops são estruturas usadas para **repetir um trecho de código** enquanto uma condição for verdadeira.

Eles são muito utilizados para:
- Contadores
- Validações
- Menus
- Leitura de dados
- Execuções repetidas

---

## 🔹 Loop `for`

O `for` é usado quando você **sabe a quantidade de repetições** que deseja executar.

### 📌 Sintaxe
```java
for (inicialização; condição; incremento) {
    // código a ser repetido
}
```
## 📌 Exemplo
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
## 🔹 Loop while
O while é utilizado quando não se sabe exatamente quantas vezes o código será executado, apenas a condição.

📌 Sintaxe
```java
while (condição) {
    // código a ser repetido
}
```
📌 Exemplo
```
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}
```
## 🔹 Loop do while
O do while garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja falsa.

📌 Sintaxe
```
do {
    // código a ser repetido
} while (condição);
```
📌 Exemplo
```
Copiar código
int numero = 1;

do {
    System.out.println(numero);
    numero++;
} while (numero <= 5);
```

