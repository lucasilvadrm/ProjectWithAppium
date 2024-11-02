# Projeto de aprendizado utilizando Appium e Cucumber.

## Visão Geral
Este projeto é um framework de automação de testes para aplicativos móveis usando Appium e Cucumber como principais tecnologias. É projetado para executar testes em dispositivos Android. O projeto teve como principal finalidade buscar uma arquitetura de automação de testes que seja escalável e de fácil manutenção.

## Pré-requisitos
- Java 11
- Maven
- Android SDK
- Servidor Appium

## Configuração

### Clonar o repositório
```sh
git clone https://github.com/lucasilvadrm/ProjectWithAppium.git
cd ProjectWithAppium
```

### Instalar dependências
```sh
mvn clean install
``` 

### Para rodar o projeto
- Você precisa ter um device conectado ou um emulador aberto. 
- O servidor Appium precisa estar em execução e configurado.
- Certifique-se que você tenha o Appium 2 instalado.
- Utilize o comando abaixo para iniciar o servidor Appium antes de rodar os testes:
```sh
appium --address 127.0.0.1 --port 4724 --allow-cors
```

### Estrutura do projeto
- **src/main/java**: Contém as classes de configuração e utilitários.
- **src/test/java**: Contém as classes de execução dos testes.
- **src/test/resources**: Contém os arquivos de configuração e os arquivos de feature.

### Executar os testes
- Para rodar os testes, utilize o comando abaixo:
```sh
mvn test
```

## Autor
- [@lucasilvadrm](https://www.github.com/lucasilvadrm)