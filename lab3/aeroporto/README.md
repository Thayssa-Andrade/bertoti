# Aeroporto

## Sumário executivo

O Aeroporto é uma aplicação web para organizar partidas e visualizar rotas de voos. O usuário escolhe a origem e o destino entre dez aeroportos do Brasil e do exterior, informa a data e a hora da partida e cadastra o voo.

- **Painel de voos.** Permite consultar, editar e remover registros, buscar por origem ou destino e ordenar a lista por horário de partida ou ordem de cadastro.
- **Visualização de rotas.** O globo exibe o trajeto entre os aeroportos escolhidos no formulário. A ação **Ver rota** também exibe o trajeto de um voo cadastrado cujos aeroportos estejam no catálogo.
- **Status estimado.** O painel classifica os voos como agendados, em voo ou concluídos com base no horário de partida informado. A classificação é calculada pela aplicação, sem dados de rastreamento em tempo real.

A aplicação usa Spring Boot e armazena os registros no Oracle Database Free. O Spring Boot inicia o banco via Docker Compose, e um volume Docker preserva os dados entre execuções.

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
