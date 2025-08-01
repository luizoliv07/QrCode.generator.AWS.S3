# QR Code Generator - Spring Boot

Aplicação Java com Spring Boot para geração de QR Codes e upload automático para um bucket da AWS S3.

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- AWS SDK (S3)
- Docker
- Maven

## 📦 Funcionalidades

- Geração de QR Code a partir de uma string informada via API
- Upload automático do QR Code gerado para um bucket na AWS S3
- Exposição de endpoint REST para envio da requisição
- Documentação simples com Swagger (se tiver)

## ▶️ Como executar o projeto

### Rodando localmente com Maven

```bash
./mvnw spring-boot:run
```

### Rodando com Docker

```bash
docker build -t qrcode-generator .
docker run -p 8080:8080 qrcode-generator
```


### 🎥 Apresentei esse projeto no meu LinkedIn!
[➡️ Clique aqui para ver a publicação](https://www.linkedin.com/feed/update/urn:li:activity:7341497598991552514)


