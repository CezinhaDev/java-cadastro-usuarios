# 🧩 **DESAFIO JAVA: GERENCIADOR DE CADASTRO DE USUÁRIOS COM DATAS E STRINGS**

Este projeto foi desenvolvido como parte de um desafio prático para reforçar conhecimentos em **manipulação de strings**, **datas**, **validações simples** e **lógica condicional** usando **Java 8+**.

---

## 🚀 **FUNCIONALIDADES PRINCIPAIS**

O programa simula o cadastro de um usuário com os seguintes campos:

- 👤 **Nome completo**  
- 📧 **E-mail**  
- 📅 **Data de nascimento**  
- 🔒 **Senha**

A partir desses dados, ele realiza diversas análises, como:

- ✅ Exibição do nome em **maiúsculas** e **minúsculas**  
- ✅ Exibição da **primeira e última letra** do nome  
- ✅ Verificação se o nome contém a palavra `"java"`  
- ✅ Verificação se o e-mail e senha são válidos (validação básica)  
- ✅ Exibição da **posição da última letra 'a'**  
- ✅ Verificação se o **aniversário é hoje**, **já passou** ou **ainda vai chegar**  
- ✅ Cálculo da **idade atual** com base na data de nascimento  
- ✅ Exibição da **data de nascimento formatada**  
- ✅ Cálculo da **data de nascimento daqui a 10 anos**  
- ✅ Cálculo de **quantos dias faltam para o próximo aniversário**

---

## 📚 **CONCEITOS E MÉTODOS UTILIZADOS**

### 📆 Datas com Java (`java.time`)

- `LocalDate.now()`  
- `LocalDate.parse()`  
- `withYear()`  
- `plusYears()`  
- `Period.between()`  
- `ChronoUnit.DAYS.between()`  
- `DateTimeFormatter.ofPattern("dd/MM/yyyy")`  

### 🧪 Métodos de String

- `toLowerCase()`  
- `toUpperCase()`  
- `charAt()`  
- `substring()`  
- `contains()`  
- `equalsIgnoreCase()`  
- `lastIndexOf()`  

---

## 🛠️ **TECNOLOGIAS E FERRAMENTAS**

- ☕ **Java 8 ou superior**  
- 🖥️ **VS Code / IntelliJ / Eclipse**  
- ⚙️ **JDK instalado**  
- 💻 **Terminal / Prompt de comando**

---

## 📁 **ESTRUTURA DO PROJETO**

desafio-java-cadastro/
┣ 📂 desafio/br/com/cadastro/
┃ ┗ 📜 Main.java
┗ 📜 README.md

yaml
Copiar
Editar

---

## 💡 **COMO EXECUTAR**

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/desafio-java-cadastro.git
Compile e execute:

bash
Copiar
Editar
javac desafio/br/com/cadastro/Main.java
java desafio.br.com.cadastro.Main
👨‍💻 AUTOR
Desenvolvido por César Henrique 💻
🔗 LinkedIn
🔗 GitHub

📌 OBSERVAÇÕES
Este projeto foi feito com fins educacionais para treinar conceitos essenciais de programação Java e manipulação de dados. Futuramente, pode ser estendido para incluir validação com regex, banco de dados e interface gráfica.

