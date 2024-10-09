CREATE TABLE tblCustomers (
    CustomerID SERIAL PRIMARY KEY,
    CompanyName VARCHAR(255) NOT NULL,
    ContactName VARCHAR(255),
    ContactTitle VARCHAR(100),
    Address VARCHAR(255),
    City VARCHAR(100),
    Region VARCHAR(100),
    PostalCode VARCHAR(50),
    Country VARCHAR(50) DEFAULT 'Canada',
    Phone VARCHAR(50),
    Fax VARCHAR(50)
);

CREATE TABLE tblSupplier (
    SupplierID SERIAL PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Address VARCHAR(255),
    City VARCHAR(100),
    Province VARCHAR(100)
);

CREATE TABLE tblShippers (
    ShipperID SERIAL PRIMARY KEY,
    CompanyName VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE tblProducts (
    ProductID SERIAL PRIMARY KEY,
    SupplierID INT REFERENCES tblSupplier(SupplierID),
    CategoryID INT,
    ProductName VARCHAR(255) NOT NULL,
    EnglishName VARCHAR(255),
    QuantityPerUnit VARCHAR(50),
    UnitPrice DECIMAL(10, 2),
    UnitsInStock INT,
    UnitsOnOrder INT,
    ReorderLevel INT,
    Discontinued BOOLEAN
);

CREATE TABLE tblOrders (
    OrderID SERIAL PRIMARY KEY,
    CustomerID INT REFERENCES tblCustomers(CustomerID),
    EmployeeID INT,
    ShipName VARCHAR(255),
    ShipAddress VARCHAR(255),
    ShipCity VARCHAR(100),
    ShipRegion VARCHAR(100),
    ShipPostalCode VARCHAR(50),
    ShipCountry VARCHAR(50),
    ShipVia INT REFERENCES tblShippers(ShipperID),
    OrderDate DATE NOT NULL,
    RequiredDate DATE,
    ShippedDate DATE,
    Freight DECIMAL(10, 2),
    CONSTRAINT chk_shipped_date CHECK (ShippedDate > OrderDate)
);

CREATE TABLE tblOrderDetails (
    OrderDetailID SERIAL PRIMARY KEY,
    OrderID INT REFERENCES tblOrders(OrderID),
    ProductID INT REFERENCES tblProducts(ProductID),
    UnitPrice DECIMAL(10, 2) NOT NULL,
    Quantity INT NOT NULL CHECK (Quantity > 0),
    Discount DECIMAL(5, 2)
);

INSERT INTO tblCustomers (CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax)
VALUES
('Acme Corp', 'John Doe', 'Manager', '123 Elm St', 'Toronto', 'Ontario', 'M4B1B3', 'Canada', '123-456-7890', '123-456-7891'),
('Widget Co', 'Jane Smith', 'CEO', '456 Maple Ave', 'Vancouver', 'British Columbia', 'V5K0A1', 'Canada', '123-555-1212', '123-555-1213');

-- Insert into tblSupplier
INSERT INTO tblSupplier (Name, Address, City, Province)
VALUES
('Supplier One', '789 Pine St', 'Calgary', 'Alberta'),
('Supplier Two', '321 Oak Rd', 'Montreal', 'Quebec');

INSERT INTO tblShippers (CompanyName)
VALUES
('FastShip'), 
('ShipItNow');

INSERT INTO tblProducts (SupplierID, CategoryID, ProductName, EnglishName, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued)
VALUES
(1, 10, 'Product A', 'English Product A', '10 boxes', 100.00, 50, 10, 5, FALSE),
(2, 20, 'Product B', 'English Product B', '5 boxes', 150.00, 100, 20, 10, TRUE);

INSERT INTO tblOrders (CustomerID, EmployeeID, ShipName, ShipAddress, ShipCity, ShipRegion, ShipPostalCode, ShipCountry, ShipVia, OrderDate, RequiredDate, ShippedDate, Freight)
VALUES
(1, 101, 'Acme Corp', '123 Elm St', 'Toronto', 'Ontario', 'M4B1B3', 'Canada', 1, '2024-10-01', '2024-10-05', '2024-10-03', 20.00),
(2, 102, 'Widget Co', '456 Maple Ave', 'Vancouver', 'British Columbia', 'V5K0A1', 'Canada', 2, '2024-10-02', '2024-10-06', '2024-10-04', 15.00);

INSERT INTO tblOrderDetails (OrderID, ProductID, UnitPrice, Quantity, Discount)
VALUES
(1, 1, 100.00, 10, 0.00),
(2, 2, 150.00, 5, 5.00);

select * from tblcustomers;
select * from tblorderdetails;
select * from tblorders;
select * from tblproducts;
select * from tblshippers;
select * from tblsupplier;
