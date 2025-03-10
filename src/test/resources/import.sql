-- Test Categories
INSERT INTO tb_category(id, name) VALUES (1, 'Test Books');
INSERT INTO tb_category(id, name) VALUES (2, 'Test Electronics');
INSERT INTO tb_category(id, name) VALUES (3, 'Test Computers');

-- Test Products
INSERT INTO tb_product(id, name, description, price, img_url) VALUES (1, 'Test Product 1', 'Test Description 1', 99.99, 'test-img-1.jpg');
INSERT INTO tb_product(id, name, description, price, img_url) VALUES (2, 'Test Product 2', 'Test Description 2', 199.99, 'test-img-2.jpg');

-- Product Categories
INSERT INTO tb_product_category(product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category(product_id, category_id) VALUES (1, 2);
INSERT INTO tb_product_category(product_id, category_id) VALUES (2, 2);
INSERT INTO tb_product_category(product_id, category_id) VALUES (2, 3);
