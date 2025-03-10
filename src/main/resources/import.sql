-- Categories
INSERT INTO tb_category(id,name) VALUES (1,'Livros');
INSERT INTO tb_category(id,name) VALUES (2,'Computadores');
INSERT INTO tb_category(id,name) VALUES (3,'Eletrônicos');
INSERT INTO tb_category(id,name) VALUES (4,'Games');
INSERT INTO tb_category(id,name) VALUES (5,'Acessórios');

-- Products
INSERT INTO tb_product(name,description,price,img_url) VALUES ('Kindle','E-reader Amazon Kindle 11ª geração',499.90,'https://m.media-amazon.com/images/I/61Ow0E1+7rL._AC_SX679_.jpg');
INSERT INTO tb_product(name,description,price,img_url) VALUES ('Notebook Lenovo','Notebook Lenovo IdeaPad 3i Intel Core i5 8GB 256GB SSD',3199.90,'https://images.kabum.com.br/produtos/fotos/sync_mirakl/193662/Notebook-Lenovo-IdeaPad-3i-Intel-Core-i5-1135G7-8GB-RAM-256GB-SSD-Windows-11-15-6-Cinza-82MD0007BR_1683840658_gg.jpg');
INSERT INTO tb_product(name,description,price,img_url) VALUES ('Smart TV Samsung','Smart TV 50" UHD 4K Samsung',2799.90,'https://images.samsung.com/is/image/samsung/p6pim/br/un50au7700gxzd/gallery/br-uhd-au7000-un50au7700gxzd-489834-un50au7700gxzd-530960496');
INSERT INTO tb_product(name,description,price,img_url) VALUES ('PlayStation 5','Console PlayStation 5 Sony',4499.90,'https://images.kabum.com.br/produtos/fotos/238670/console-sony-playstation-5_1634132554_gg.jpg');
INSERT INTO tb_product(name,description,price,img_url) VALUES ('Mouse Gamer','Mouse Gamer Logitech G Pro Wireless',699.90,'https://resource.logitechg.com/w_692,c_limit,q_auto,f_auto,dpr_1.0/d_transparent.gif/content/dam/gaming/en/products/pro-wireless-gaming-mouse/pro-wireless-carbon-gallery-1.png');

-- Product Categories
INSERT INTO tb_product_category(product_id,category_id) VALUES (1,1);
INSERT INTO tb_product_category(product_id,category_id) VALUES (1,3);
INSERT INTO tb_product_category(product_id,category_id) VALUES (2,2);
INSERT INTO tb_product_category(product_id,category_id) VALUES (2,3);
INSERT INTO tb_product_category(product_id,category_id) VALUES (3,3);
INSERT INTO tb_product_category(product_id,category_id) VALUES (4,3);
INSERT INTO tb_product_category(product_id,category_id) VALUES (4,4);
INSERT INTO tb_product_category(product_id,category_id) VALUES (5,3);
INSERT INTO tb_product_category(product_id,category_id) VALUES (5,5);

-- Users
INSERT INTO tb_user (name, email, password, phone, birth_date, roles) VALUES ('João Silva', 'joao@email.com', 'senha123', '11999999999', '1990-05-20', 'USER');
INSERT INTO tb_user (name, email, password, phone, birth_date, roles) VALUES ('Maria Santos', 'maria@email.com', 'senha456', '11988888888', '1985-10-15', 'ADMIN');
INSERT INTO tb_user (name, email, password, phone, birth_date, roles) VALUES ('Pedro Oliveira', 'pedro@email.com', 'senha789', '11977777777', '1995-03-25', 'USER');
INSERT INTO tb_user (name, email, password, phone, birth_date, roles) VALUES ('Ana Costa', 'ana@email.com', 'senha321', '11966666666', '1992-07-10', 'USER');

-- Orders (Using different status: 0=WAITING_PAYMENT, 1=PAID, 2=SHIPPED, 3=DELIVERED, 4=CANCELLED)
INSERT INTO tb_order(moment,status,user_id) VALUES ('2024-01-15 10:30:00',0,1);
INSERT INTO tb_order(moment,status,user_id) VALUES ('2024-01-14 15:45:00',1,2);
INSERT INTO tb_order(moment,status,user_id) VALUES ('2024-01-13 09:20:00',2,3);
INSERT INTO tb_order(moment,status,user_id) VALUES ('2024-01-12 14:15:00',3,4);
INSERT INTO tb_order(moment,status,user_id) VALUES ('2024-01-11 16:50:00',4,1);

-- Order Items
INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (1,1,1,499.90);
INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (1,5,1,699.90);
INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (2,2,1,3199.90);
INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (3,4,1,4499.90);
INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (4,3,1,2799.90);
INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (4,5,2,699.90);
INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (5,1,1,499.90);

-- Payments (for PAID and DELIVERED orders)
INSERT INTO tb_payment(moment,order_id) VALUES ('2024-01-14 16:00:00',2);
INSERT INTO tb_payment(moment,order_id) VALUES ('2024-01-12 14:30:00',4);
