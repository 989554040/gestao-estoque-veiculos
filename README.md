# gestao-estoque-veiculos
Configuração Inicial

-Certifique-se de que Java 21, Maven e MySQL estão instalados.

No banco de dados, crie o schema gestao_veiculos (ou use o já existente).

No arquivo application.properties configure:

spring.datasource.url=jdbc:mysql://localhost:3306/gestao_veiculos?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

Clone o projeto do GitHub ou abra no IDE (IntelliJ, Eclipse, VSCode).

--Estrutura do Projeto

Model (ou Entity): contém as classes Marca, Modelo e Veiculo. Cada classe representa uma tabela no banco.

Repository: interfaces como MarcaRepository, ModeloRepository, VeiculoRepository para acessar o banco via JPA.

Service: classes que contêm a lógica de negócio (ex.: salvar, listar, atualizar).

Controller: classes que recebem as requisições HTTP (GET, POST, PUT, DELETE) e chamam os Services.

---Como rodar o projeto

Pelo terminal, no diretório do projeto:

mvn spring-boot:run

Ou diretamente pelo IDE: Run -> SpringBootApplication.

