CREATE SCHEMA IF NOT EXISTS schema_clients;

CREATE TABLE IF NOT EXISTS schema_clients.demo_customer (
  customer_id INT AUTO_INCREMENT  PRIMARY KEY,
  nif VARCHAR(250) NOT NULL,
  docNum VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  givenName VARCHAR(250) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS schema_clients.demo_product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  productName VARCHAR(250) ,
  productTypeName VARCHAR(250),
  numeracioTerminal VARCHAR(250) DEFAULT NULL,
  soldAt DATETIME,
  customerId NVARCHAR(36) ,
  FOREIGN KEY (customerId) REFERENCES schema_clients.demo_customer(customer_id)
);


