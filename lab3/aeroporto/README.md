# Aeroporto

Aplicação Spring Boot para cadastro e consulta de voos. O banco de dados é o Oracle Database Free, executado em um contêiner.

## Pré-requisitos

- Java 21.
- Docker em execução com o Docker Compose disponível. No Windows, abra o Docker Desktop e aguarde a inicialização.

## Executar

A partir da raiz do repositório, no PowerShell:

```powershell
cd lab3/aeroporto
.\mvnw.cmd spring-boot:run
```

No Linux ou macOS, na pasta `lab3/aeroporto`, use `sh ./mvnw spring-boot:run`.

O Spring Boot inicia o Oracle pelo Docker Compose e aguarda o banco ficar pronto. A primeira execução pode levar alguns minutos enquanto o Docker baixa a imagem e inicializa o banco. Depois que a aplicação subir, abra [http://localhost:8080](http://localhost:8080).

Use `Ctrl+C` para encerrar a aplicação. Os dados do Oracle ficam no volume Docker `oracle-data` e são reutilizados nas próximas execuções. O banco começa vazio, sem os registros de uma instalação local anterior.

## Executar os testes

Com o Docker em execução, rode na pasta `lab3/aeroporto`:

```powershell
.\mvnw.cmd test
```

No Linux ou macOS, use `sh ./mvnw test`.
