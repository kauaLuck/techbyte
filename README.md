#  API REST de Produtos - Spring Boot

Projeto desenvolvido em Java com Spring Boot para disponibilizar um serviço REST que expõe os dados de produtos.

---

##  Tecnologias Utilizadas

* **Java 25+** (ou versão equivalente)
* **Spring Boot** (Spring Web, Spring MVC)
* **Maven** (Gerenciador de dependências)
* **IDE** (IntelliJ IDEA)

---

##  Funcionalidades

- Exposição de endpoint REST (`GET /produto`) para retornar os detalhes de um produto em formato JSON.
- Manipulação de dados com tipos adequados (`BigDecimal` para valores monetários).

---

##  Como Executar o Projeto

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/kauaLuck/techbyte
   ```

2. **Navegar até a pasta do projeto:**
   ```bash
   cd teu-repositorio
   ```

3. **Executar a aplicação:**
   * Pela IDE: Execute a classe principal `Application.java` ou `ProdutoApplication.java`.
   * Pelo terminal (Maven):
     ```bash
     ./mvnw spring-boot:run
     ```

4. **Aceder no Navegador ou Postman:**
   ```text
   http://localhost:8080/produto
   ```

---

## 📸 Demonstração do Código (Spring Boot)

Abaixo está a implementação da Controller responsável por expor o endpoint `/produto`:

## Na WEB:
<img width="591" height="205" alt="image" src="https://github.com/user-attachments/assets/f6411fe5-785b-41de-bf30-27fbb64af481" />

## No POSTMAN:
<img width="685" height="190" alt="image" src="https://github.com/user-attachments/assets/3f53e3ba-332d-41d0-870f-550c1f87b1ed" />


---

##  Modelagem do Banco de Dados

Abaixo está a representação da estrutura da tabela `Produto` no banco de dados:

<img width="410" height="428" alt="image" src="https://github.com/user-attachments/assets/b8da8f41-693a-4ceb-a839-a17e86577f00" />


### Exemplo de Estrutura da Tabela (`SQL`):

```sql
CREATE TABLE produto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10,2) NOT NULL
);
```

