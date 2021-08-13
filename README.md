# Projeto de Cadastrp de Pets
Este sistema consiste em um porjeto para cadastro de Pets.


Projeto implementado seguindo o padrão de micro serviços.

Para execução pode ser utilizado o FrameWork STS Tools.

Os projetos estão divididos em:

hr-pet - Responsável pelo cadastro dos Pets.

A classe principal Pet pode ser cadastrada com Valores de Nome do Pet, Nome do proprietário e Raça.
Os usuários de consulta e cadastro estão presentes na Classe User.
Os testes foram executados utilizando o Banco H2.

Os dados são injetados através do arquivo Data.sql

Projeto rodando, com cadastro efetuado conforme figura abaixo:

#Base de dados h2

hr_user

Os usuários de consulta e cadastro estão presentes na Classe User.
Os testes foram executados utilizando o Banco H2.

Os dados são injetados através do arquivo Data.sql

Projeto rodando, com cadastro efetuado conforme figura abaixo:

#Base de dados h2

hr_oauth

Onde estão concentradas todas as configurações para acesso e segurança do projeto.

hr_api_gateway

Utilizado para servidor de configuração 

hr_eureka_server

Servidor para registrar os microserviços. Este registro já está programado para portas aleatórias.

Seguem alguns prints de tela com resultados do passo a passo.

![image](https://user-images.githubusercontent.com/35120906/129282927-01a19602-6fc1-4dad-a53d-8a5239b3adcc.png)

#Função findAll()

![image](https://user-images.githubusercontent.com/35120906/129287051-f125c874-ba49-46dd-8518-e1deeef1d68e.png)
 
 # Criada as Definições de Usuário
 
 ![image](https://user-images.githubusercontent.com/35120906/129293578-12ea4e69-5bc1-4f98-8682-505ad4789359.png)

 Regras
 
 ![image](https://user-images.githubusercontent.com/35120906/129293875-b77ac6b3-9684-4e86-ab60-ee798ebf6b6c.png)

 Usuário
 
 ![image](https://user-images.githubusercontent.com/35120906/129293988-f0e941bb-2af1-4412-946a-bc6607ff1268.png)
 
 Regras de Usuário
 
 ![image](https://user-images.githubusercontent.com/35120906/129294021-48b9af26-9733-445a-a214-f9fa2af74acc.png)
 
 Consultando usuário
 
 ![image](https://user-images.githubusercontent.com/35120906/129296351-e8c734dd-7a0f-4770-9630-bb3510419f76.png)
 
 Usuário por email
 
 ![image](https://user-images.githubusercontent.com/35120906/129361298-50bfe926-e3fd-41f4-a04c-46753d82ddbe.png)





