insert into clientes (id, cpf, email, idade, nome, telefone) values (1,'382.142.634-92', 'enoque@gmail.com', '27','Enoque Leal','11984555577');
insert into clientes (id, cpf, email, idade, nome, telefone) values (2,'864.150.375-79', 'thaiane@gmail.com', '24','Thaiane Oliveira','11980000009');

insert into usuarios (id, senha, tipo, usuario, cliente_id) values (1,'123456', 0, 'enoqueleal', 1);
insert into usuarios (id, senha, tipo, usuario, cliente_id) values (2,'654321', 1, 'oliveirathai', 2);

insert into fundos (id,nome,impacto, descricao) values (1, 'SOTUG FUNDO DE INVESTIMENTO EM COTAS DE FUNDOS DE INVESTIMENTO MULTIMERCADO CRÉDITO PRIVADO ', '', 'Desenquadramento');
insert into fundos (id,nome,impacto, descricao) values (2, 'TERRA NOVA FUNDO DE INVESTIMENTO DE RENDA FIXA INSTITUCIONAL IMA-B LONGO PRAZO ', '- 1,57% ', 'Provisão para crédito de liquidação duvidosa');
insert into fundos (id,nome,impacto, descricao) values (3, 'MELLON FAMA PRIVATE EQUITY I - FI EM QUOTAS DE FUNDOS DE INVESTIMENTO MULTIMERCADO ', '', 'Renúncia');
insert into fundos (id,nome,impacto, descricao) values (4, 'RHODES FUNDO DE INVESTIMENTO EM COTAS DE FUNDOS DE INVESTIMENTO RENDA FIXA LONGO PRAZO ', '- 9,67%', 'Desvalorização da Cota');