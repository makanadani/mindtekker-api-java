
# 🧠 Mindtekker API

API REST desenvolvida em **Java com Spring Boot**, projetada para integrar-se ao aplicativo mobile Mindtekker. A aplicação tem como foco a promoção do bem-estar dos colaboradores, fornecendo frases motivacionais e armazenando respostas de check-ins anônimos sobre saúde emocional e clima organizacional.

## 🚀 Funcionalidades

- 🎯 Sorteio de frases motivacionais aleatórias
- 📝 Recebimento de respostas de usuários por ID de pergunta
- 🧠 Armazenamento de métricas psicossociais no banco de dados Oracle
- 🔐 API estruturada com padrões REST

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Flyway
- Oracle JDBC (ojdbc11)
- Maven
- Retrofit (no app mobile Android)

## 📦 Endpoints

| Método | Endpoint                                         | Descrição                                |
|--------|--------------------------------------------------|------------------------------------------|
| GET    | `/frases/sortear`                                | Retorna uma frase motivacional aleatória |
| POST   | `/respostas/salvar/{idPergunta}/{valorResposta}` | Salva uma resposta por ID de pergunta    |

---

## 🧪 Como Rodar Localmente

### ⚙️ Pré-requisitos

- Java 17+
- Maven
- Oracle Database (ou simulado)
- IntelliJ IDEA ou outra IDE

---

### 1. Clone o projeto da API

```bash
git clone https://github.com/makanadani/mindtekker-api.git
cd mindtekker-api
```

### 2. Rode o projeto com Spring Boot

No terminal da sua IDE ou diretamente no sistema:

```bash
./mvnw spring-boot:run
```

> A aplicação será iniciada na porta `8080`.

---

### 3. Descubra seu IP local

No Windows:

```bash
ipconfig
```

Procure por:

```
Endereço IPv4 . . . . . . . . . . : 192.168.x.x
```

Anote esse IP — ele será usado pelo app mobile.

---

### 4. Clone o projeto da aplicação Android

```bash
git clone https://github.com/makanadani/mindtekker.git
```

Abra no **Android Studio**.

---

### 5. Configure os arquivos Retrofit no app Android

Edite as seguintes classes para usar seu IP local:

- `RetrofitClient`
- `RetrofitClientFrase`
- `RetrofitClienteResposta`

Substitua:

```kotlin
http://<seu-ip-aqui>:8080/frases/
http://<seu-ip-aqui>:8080/respostas/
```

por algo como:

```kotlin
http://192.168.15.8:8080/frases/
```

> Exemplo:
![image](https://github.com/user-attachments/assets/3f2f7264-3a10-4fdc-add1-d4304d09652e)

---

### 6. Conecte e configure o celular Android

- Ative o **modo desenvolvedor** no dispositivo.
- Ative **depuração USB**.
- Conecte via cabo ao computador para testes.

> Certifique-se de que o **celular e o computador estão na mesma rede Wi-Fi.**

---

##👨‍💻 Equipe

- **Gabriela Liborio de Souza** · RM 557810
- **Giovane Su Xincheng** · RM 95369
- **Lucas Bracco Yamamoto** · RM 554458
- **Marina Yumi Kanadani** · RM 558404

---

## 📄 Licença

Projeto acadêmico desenvolvido para o Challenge FIAP 2025 em parceria com a Softtek.  
Todos os direitos reservados © 2025.
