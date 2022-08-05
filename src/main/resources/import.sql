INSERT INTO tb_user(name, email, phone, password) VALUES ('Maria Brown', 'maria@gmail.com', '988888888', '123456');
INSERT INTO tb_user(name, email, phone, password) VALUES ('Alex Green', 'alex@gmail.com', '977777777', '123456');

INSERT INTO tb_order(moment, ORDER_STATUS, client_id)  VALUES ('2019-06-20T19:53:07Z',2,1);
INSERT INTO tb_order(moment, ORDER_STATUS, client_id)  VALUES ('2019-07-21T03:42:10Z',1,2);
INSERT INTO tb_order(moment, ORDER_STATUS, client_id)  VALUES ('2019-07-22T15:21:22Z',1,1);

INSERT INTO tb_category(name)  VALUES ('Electronics');
INSERT INTO tb_category(name)  VALUES ('Books');
INSERT INTO tb_category(name)  VALUES ('Computers');

INSERT INTO tb_product(name, description, price, IMG_URL)  VALUES ('The Lord of the Rings','Em uma terra fantástica e única...',90.5,'');
INSERT INTO tb_product(name, description, price, IMG_URL)  VALUES ('Smart TV','Processador Crystal 4K',2190.0,'');
INSERT INTO tb_product(name, description, price, IMG_URL)  VALUES ('Macbook Pro','O novo chip M2 deixa o MacBook Pro de 13 polegadas',1250.0,'');
INSERT INTO tb_product(name, description, price, IMG_URL)  VALUES ('PC Gamer','PC Gamer atualmente é o AMD Ryzen 9-5900X, um poderoso processador de 3.7 GHz',1200.0,'');
INSERT INTO tb_product(name, description, price, IMG_URL)  VALUES ('Rails for Dummies','Ruby on Rails For Dummies',100.99,'');

INSERT INTO tb_payment(moment,ORDER_ID)  VALUES ('2019-06-20T21:53:07Z',1);

INSERT INTO TB_PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (1,2);
INSERT INTO TB_PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (2,1);
INSERT INTO TB_PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (2,3);
INSERT INTO TB_PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (3,3);
INSERT INTO TB_PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (4,3);
INSERT INTO TB_PRODUCT_CATEGORY(PRODUCT_ID, CATEGORY_ID) VALUES (5,2);

INSERT INTO TB_ORDER_ITEM(PRICE, QUANTITY, PRODUCT_ID, ORDER_ID) VALUES (90.5,2,1,1);
INSERT INTO TB_ORDER_ITEM(PRICE, QUANTITY, PRODUCT_ID, ORDER_ID) VALUES (1250.0,1,3,1);
INSERT INTO TB_ORDER_ITEM(PRICE, QUANTITY, PRODUCT_ID, ORDER_ID) VALUES (1250.0,2,3,2);
INSERT INTO TB_ORDER_ITEM(PRICE, QUANTITY, PRODUCT_ID, ORDER_ID) VALUES (100.99,2,5,3);