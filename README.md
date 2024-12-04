# Order Calculator

**Order Calculator** é um projeto backend desenvolvido em **Java** utilizando o framework **Spring Boot** e gerenciado pelo **Maven**. Ele calcula o valor total de um pedido considerando um desconto e um valor de frete dinâmico.

---

## 🚀 Funcionalidades

- **Cálculo do Valor Total do Pedido:**
  - Aplica uma porcentagem de desconto ao valor base do pedido.
  - Soma o valor do frete ao total após o desconto.
- **Regras de Cálculo de Frete:**
  - O valor do frete é calculado com base em regras personalizadas (detalhadas no domínio).

---

## 🛠️ Tecnologias Utilizadas

- **Java 21+**
- **Spring Boot**
- **Maven**

---

## 📦 Estrutura do Projeto

```
order-total-system/
├── src/
│   ├── main/
│   │   ├── java/dev/yourname/order_total/
│   │   │   ├── entities/      # Entidades do Domínio
│   │   │   ├── services/      # Regras de Negócio
│   │   └── resources/
│   │       ├── application.properties  # Configurações do Spring
├── pom.xml
└── README.md
```

---

## 📄 Modelo de Domínio e Banco de Dados

### Entidade Pedido
- **Campos**:
  - `code` (Long): Identificador único do pedido.
  - `basic` (BigDecimal): Valor base do pedido antes do desconto.
  - `discount` (Double): Porcentagem de desconto aplicada.

---

## 🔧 Configuração e Execução

### Pré-requisitos

- **Java 21+**

### Configuração

1. Clone o repositório:
   ```bash
   git clone git@github.com:rodrigofx3/order-calculator.git
   cd order-calculator
   ```

3. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/yourname/order-total-system/blob/main/LICENSE)
