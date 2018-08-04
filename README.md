# Engenharia de Reuso - Atividade Eng. Reversa

Requisitos:

- Git
- Maven (> 3.0)
- Docker

## Passos para execução

Em qualquer sistema operacional, abra o terminal ou prompt de comando.

1. Baixe o código fonte

```sh
git clone https://github.com/diogomoreira/atividade-reuso.git
cd atividade-reuso
```

2. Construa a imagem do Docker

```sh
docker build -t db-reuso ./
```

3. Execute o container

```sh
docker run -p 5432:5432 -d db-reuso
```

4. Execute o sistema

```sh
mvn spring-boot:run
```