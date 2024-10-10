CREATE TABLE delivery_partners(
	partner_id VARCHAR(10) PRIMARY KEY NOT NULL,
	partner_name VARCHAR(20),
	phone_no BIGINT,
	rating INT CHECK (rating BETWEEN 1 AND 5)
);

INSERT INTO delivery_partners(partner_id,partner_name,phone_no,rating)
VALUES 	('PTR1001','Uber Eats', 1234567890, 5),
		('PTR1002','DoorDash', 2345678901, 4),
		('PTR1003','Grubhub', 3456789012, 3),
		('PTR1004','Postmates', 4567890123, 4),
		('PTR1005','Zomato', 5678901234, 5),
		('PTR1006','Swiggy', 6789012345, 5),
		('PTR1007','Deliveroo', 7890123456, 4),
		('PTR1008','Foodpanda', 8901234567, 3),
		('PTR1009','Just Eat', 9012345678, 4),
		('PTR1010','Glovo', 0123456789, 4),
		('PTR1011','EatStreet', 1112223333, 2),
		('PTR1012','Seamless', 2223334444, 2),
		('PTR1013','Caviar', 3334445555, 2),
		('PTR1014','Slice', 4445556666, 4),
		('PTR1015','ChowNow', 5556667777, 3);

SELECT * FROM delivery_partners;

SELECT partner_id, partner_name, phone_no FROM delivery_partners 
WHERE rating BETWEEN 3 AND 5 ORDER BY partner_id ASC;

CREATE TABLE customers(
	customer_id VARCHAR(10) PRIMARY KEY NOT NULL,
	customer_name VARCHAR(20),
	address VARCHAR(20),
	phone_no BIGINT,
	email_id VARCHAR(20)
);

INSERT INTO customers(customer_id, customer_name, address, phone_no, email_id)
VALUES ('CUST1001','THOMAS', 'KOCHI', 9856325486,'thomas@gmail.com'),
	   ('CUST1002','CHARLES', 'ALLPEY', 9856367486,'charles@gmail.com'),
	   ('CUST1003','SUDHAKAR', 'KOCHI', 9856323869,'sudhakar@gmail.com'),
	   ('CUST1004','JAGADISH', 'ERNAKULAM', 9856326666,'jagadish@gmail.com'),
	   ('CUST1005','ALBERT', 'ALLPEY', 9856328659,'albert@gmail.com'),
	   ('CUST1006','ASHWIN DAS', 'KANNUR', 9856325659,'ashwin@gmail.com');

SELECT * FROM customers;

UPDATE customers
SET phone_no = 9876543210
WHERE customer_id = 'CUST1004';

SELECT * FROM customers ORDER BY customer_id;

SELECT customer_id, customer_name, address, phone_no FROM customers
WHERE email_id LIKE '%@gmail.com' ORDER BY customer_id;

ALTER TABLE customers
ALTER COLUMN customer_id TYPE INT
USING SUBSTRING(customer_id, '(\d+)$')::INT;

SELECT * FROM customers ORDER BY customer_id ASC;

CREATE TABLE hotel_details(
	hotel_id VARCHAR(10) PRIMARY KEY NOT NULL,
	hotel_name VARCHAR(20),
	hotel_type VARCHAR(20),
	rating INT CHECK (rating BETWEEN 1 AND 5)
);

INSERT INTO hotel_details(hotel_id, hotel_name, hotel_type, rating)
VALUES ('HTL1001','The Gourmet Kitchen', 'veg', 5),
       ('HTL1002','Spicy Delight', 'non-veg', 4),
       ('HTL1003','Healthy Bites', 'veg', 5),
       ('HTL1004','Tasty Corner', 'non-veg', 3),
       ('HTL1005','Urban Eateries', 'veg', 4),
       ('HTL1006','The Green Bowl', 'veg', 5),
       ('HTL1007','Street Food Hub', 'non-veg', 3),
       ('HTL1008','Delicious Treats', 'non-veg', 4),
       ('HTL1009','Fusion Flavors', 'veg', 4),
       ('HTL1010','Classic Cuisine', 'non-veg', 5);

SELECT * FROM hotel_details;

ALTER TABLE hotel_details
RENAME COLUMN rating TO hotel_ratings;

SELECT CONCAT(Hotel_name, ' is a ', Hotel_type, ' hotel') AS HOTEL_INFO
FROM Hotel_details
ORDER BY Hotel_name DESC;

CREATE TABLE orders (
	order_id VARCHAR(10) PRIMARY KEY NOT NULL,
	customer_id INT REFERENCES customers(customer_id),
	hotel_id VARCHAR(10) REFERENCES hotel_details(hotel_id),
	partner_id VARCHAR(10) REFERENCES delivery_partners(partner_id),
	order_date DATE,
	order_amount INT
);

INSERT INTO orders (order_id, customer_id, hotel_id, partner_id, order_date, order_amount) 
VALUES 
('ORD1001', 1001, 'HTL1001', 'PTR1001', '2024-10-01', 500),
('ORD1002', 1002, 'HTL1002', 'PTR1006', '2024-10-02', 1000),
('ORD1003', 1003, 'HTL1001', 'PTR1003', '2024-10-03', 750),
('ORD1004', 1004, 'HTL1002', 'PTR1002', '2024-10-04', 1200),
('ORD1005', 1005, 'HTL1003', 'PTR1015', '2024-10-05', 450),
('ORD1006', 1006, 'HTL1006', 'PTR1003', '2024-10-06', 800),
('ORD1007', 1004, 'HTL1005', 'PTR1007', '2024-10-07', 950),
('ORD1008', 1003, 'HTL1004', 'PTR1009', '2024-10-08', 600),
('ORD1009', 1004, 'HTL1009', 'PTR1010', '2024-10-09', 1300),
('ORD1010', 1005, 'HTL1001', 'PTR1011', '2024-10-10', 700),
('ORD1011', 1006, 'HTL1001', 'PTR1013', '2024-10-11', 500),
('ORD1012', 1001, 'HTL1009', 'PTR1015', '2024-10-12', 900),
('ORD1013', 1002, 'HTL1010', 'PTR1004', '2024-10-13', 1100),
('ORD1014', 1001, 'HTL1008', 'PTR1008', '2024-10-14', 450),
('ORD1015', 1004, 'HTL1009', 'PTR1012', '2024-10-15', 1150),
('ORD1016', 1006, 'HTL1001', 'PTR1004', '2024-10-16', 1250),
('ORD1017', 1001, 'HTL1002', 'PTR1002', '2024-10-17', 700),
('ORD1018', 1002, 'HTL1008', 'PTR1010', '2024-10-18', 1350),
('ORD1019', 1004, 'HTL1002', 'PTR1015', '2024-10-19', 800),
('ORD1020', 1006, 'HTL1002', 'PTR1009', '2024-10-20', 950);

SELECT * FROM orders;

UPDATE orders
SET hotel_id = 'HTL1001'
WHERE order_id = 'ORD1020';

SELECT hotel_details.hotel_id, hotel_details.hotel_name, COUNT(orders.order_id) AS NO_OF_ORDERS
FROM hotel_details JOIN orders ON hotel_details.hotel_id = orders.hotel_id
GROUP BY hotel_details.hotel_id
HAVING COUNT(orders.order_id) > 5
ORDER BY hotel_details.hotel_id;

UPDATE orders
SET order_date = '2019-05-12'
WHERE order_id = 'ORD1020';

UPDATE orders
SET order_date = '2019-05-12'
WHERE order_id = 'ORD1010';

UPDATE orders
SET order_date = '2019-05-12'
WHERE order_id = 'ORD1005';

SELECT hotel_details.hotel_id, hotel_details.hotel_name, hotel_details.hotel_type FROM hotel_details
JOIN orders ON hotel_details.hotel_id = orders.hotel_id
WHERE NOT orders.order_date = '2019-05-12'
ORDER BY hotel_details.hotel_id;

SELECT orders.order_id, customers.customer_name, hotel_details.hotel_name, order_amount AS Amount FROM orders
JOIN customers ON orders.customer_id = customers.customer_id
JOIN hotel_details ON orders.hotel_id = hotel_details.hotel_id
ORDER BY orders.order_id;

SELECT customers.customer_id,customers.customer_name, COUNT(orders.customer_id) AS order_count, SUM(orders.order_amount) AS total_amount FROM customers
JOIN orders ON orders.customer_id = customers.customer_id
GROUP BY customers.customer_id
ORDER BY customers.customer_id;

CREATE TABLE Supplier (
    Supplier_id numeric(5),
    Supplier_name varchar(150),
    Address varchar(150),
    City varchar(50),
    State varchar(15),
    Country varchar(15),
    Contact varchar(10)
);

ALTER TABLE Supplier
ADD CONSTRAINT chk_contact_length CHECK (LENGTH(Contact) = 10);