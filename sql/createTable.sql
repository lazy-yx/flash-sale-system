CREATE TABLE product
(
    id    BIGINT PRIMARY KEY AUTO_INCREMENT,
    name  VARCHAR(100),
    stock INT,
    price DECIMAL(10, 2)
);


INSERT INTO product(name, stock, price)
VALUES ('iPhone Flash Sale', 100, 4999);


CREATE TABLE orders
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id     BIGINT,
    product_id  BIGINT,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP
);