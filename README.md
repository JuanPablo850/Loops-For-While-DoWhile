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
## 📝 Exercícios para praticar
🔂 Exercícios com FOR
1️⃣ Contagem simples
Crie um programa que imprima os números de 1 a 10 usando for.
----------------------------------------------------------------------------------------------------------------------------------
2️⃣ Números pares
Mostre todos os números pares de 0 a 50.
----------------------------------------------------------------------------------------------------------------------------------
3️⃣ Tabuada
Peça um número ao usuário e exiba a tabuada dele (1 a 10).
----------------------------------------------------------------------------------------------------------------------------------
🔂 Exercícios com WHILE
4️⃣ Validação de senha
Peça uma senha ao usuário enquanto ela for diferente de "1234"
----------------------------------------------------------------------------------------------------------------------------------
5️⃣ Soma até zero
Leia números inteiros e some-os.
O programa deve parar quando o usuário digitar 0.
----------------------------------------------------------------------------------------------------------------------------------
🔂 Exercícios com DO WHILE
6️⃣ Confirmação de escolha
Peça ao usuário:
Deseja continuar? (S/N)
O programa deve executar ao menos uma vez.
----------------------------------------------------------------------------------------------------------------------------------
7️⃣ Número válido
Peça um número entre 1 e 10.
Repita até o usuário digitar um valor válido.
----------------------------------------------------------------------------------------------------------------------------------
8️⃣Calculadora simples
Crie um menu com operações (+, -, *, /).
Após cada cálculo, pergunte se deseja continuar.
----------------------------------------------------------------------------------------------------------------------------------
## 📚 Todas as respostas estão no código disponível.
