INSERT INTO tb_category(id,name) VALUES (1,'Livros');
INSERT INTO tb_category(id,name) VALUES (2,'Computadores');
INSERT INTO tb_category(id,name) VALUES (3,'Eletrônicos');

INSERT INTO tb_user(id,name,email,password) VALUES (1,'Filipe','filipe@senai.com','senai');

INSERT INTO tb_order(moment,status,user_id) VALUES (now(),'PENDENTE',1);

INSERT INTO tb_product(id,name,description,price,img_url,categories_id) VALUES (1,'Kindle','Kindle',100,'https://www.amazon.com/Kindle-Fire-8th-Generation-Wi-Fi/dp/B007NF0S2M/ref=sr_1_1?dchild=1&keywords=kindle+fire&qid=1646981287&sr=8-1',[1,2]);

INSERT INTO tb_product_category(product_id,category_id) VALUES (1,1);
INSERT INTO tb_product_category(product_id,category_id) VALUES (1,2);

INSERT INTO tb_payment(moment,order_id) VALUES (now(),1);

INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (1,1,1,100);
