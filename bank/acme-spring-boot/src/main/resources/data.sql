INSERT INTO TB_CLIENTS (id, name, phone, email, address, cpf, cnpj) VALUES (1, 'Carlos Barbosa','83 9 9126-7778','cbgomes@gmail.com', '12111111111','11111111111111');
INSERT INTO TB_CLIENTS (id, name, phone, email, address, cpf, cnpj) VALUES (2, 'Assis Barbosa','83 9 9125-7778','assisgomes@gmail.com', '13111111111','11111111111111');
INSERT INTO TB_CLIENTS (id, name, phone, email, address, cpf, cnpj) VALUES (3, 'Gabriel Barbosa','83 9 9124-7778','gabrielgomes@gmail.com', '14111111111','11111111111111');
INSERT INTO TB_CLIENTS (id, name, phone, email, address, cpf, cnpj) VALUES (4, 'Junior Healy Barbosa','83 9 9123-7778','juniorgomes@gmail.com', null,'13456111111111');
INSERT INTO TB_CLIENTS (id, name, phone, email, address, cpf, cnpj) VALUES (5, 'Dinaldo Barbosa','83 9 9122-7778','dinaldogomes@gmail.com', null,'11789011111111');
INSERT INTO TB_CLIENTS (id, name, phone, email, address, cpf, cnpj) VALUES (6, 'Nabor Barbosa','83 9 9121-7778','naborgomes@gmail.com', null,'11111111110001');

INSERT INTO TB_ACCOUNTS (id, id_client, number_account, number_agency, balance, type_account) VALUES (1, 1, 344590, 3305, 700, 0);
INSERT INTO TB_ACCOUNTS (id, id_client, number_account, number_agency, balance, type_account) VALUES (2, 2, 344591, 3115, 700, 1);
INSERT INTO TB_ACCOUNTS (id, id_client, number_account, number_agency, balance, type_account) VALUES (3, 3, 344592, 3408, 700, 0);
INSERT INTO TB_ACCOUNTS (id, id_client, number_account, number_agency, balance, type_account) VALUES (4, 4, 344593, 3305, 700, 1);
INSERT INTO TB_ACCOUNTS (id, id_client, number_account, number_agency, balance, type_account) VALUES (5, 5, 344594, 3115, 700, 0);
INSERT INTO TB_ACCOUNTS (id, id_client, number_account, number_agency, balance, type_account) VALUES (6, 6, 344595, 3408, 700, 1);

INSERT INTO TB_AGENCY (code_bank, bank, agency) VALUES (033, 'Santander', 3305);
INSERT INTO TB_AGENCY (code_bank, bank, agency) VALUES (001, 'Brasil', 3115);
INSERT INTO TB_AGENCY (code_bank, bank, agency) VALUES (090, 'Nu-bank', 3408);