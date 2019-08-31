insert into clientes (id, cpf, email, idade, nome, telefone) values (1,'382.142.634-92', 'enoque@gmail.com', '27','Enoque Leal','11984555577');
insert into clientes (id, cpf, email, idade, nome, telefone) values (2,'864.150.375-79', 'thaiane@gmail.com', '24','Thaiane Oliveira','11980000009');

insert into usuarios (id, senha, tipo, usuario, cliente_id) values (1,'123456', 0, 'enoqueleal', 1);
insert into usuarios (id, senha, tipo, usuario, cliente_id) values (2,'654321', 1, 'oliveirathai', 2);