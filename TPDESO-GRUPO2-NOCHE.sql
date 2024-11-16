
CREATE TABLE Categoria (
    ID_Categoria INT AUTO_INCREMENT PRIMARY KEY,
    Descripcion VARCHAR(255),
    Tipo_item VARCHAR(100)
);


CREATE TABLE Cliente (
    ID_Cliente INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255),
    CUIT VARCHAR(20) UNIQUE,
    Email VARCHAR(255),
    Direccion VARCHAR(255),
    CoordenadaLat DECIMAL(12, 8),
    CoordenadaLng DECIMAL(12, 8),
    Eliminado BOOLEAN
);


CREATE TABLE Vendedor (
    ID_Vendedor INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255),
    Direccion VARCHAR(255),
    CoordenadaLat DECIMAL(12, 8),
    CoordenadaLng DECIMAL(12, 8),
    Eliminado BOOLEAN
);


CREATE TABLE ItemMenu (
    ID_ItemMenu INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255),
    Descripcion VARCHAR(255),
    Precio DECIMAL(10, 2),
    ID_Categoria INT,
    ID_Vendedor INT,
    GraduacionAlcoholica FLOAT,
    Tamanio INT,
    Calorias INT,
    AptoCeliaco BOOLEAN,
    AptoVegetariano BOOLEAN,
    Peso FLOAT,
    Eliminado BOOLEAN,
    FOREIGN KEY (ID_Categoria) REFERENCES Categoria(ID_Categoria),
    FOREIGN KEY (ID_Vendedor) REFERENCES Vendedor(ID_Vendedor)
);


CREATE TABLE Pago(
                     ID_Pago INT AUTO_INCREMENT PRIMARY KEY,
                     Metodo VARCHAR(15),
                     Alias VARCHAR(20),
                     CUIT VARCHAR(20),
                     CVU VARCHAR(20)
);


CREATE TABLE Pedido (
    ID_Pedido INT AUTO_INCREMENT PRIMARY KEY,
    ID_Cliente INT,
    ID_Vendedor INT,
    ID_Pago INT,
    Fecha_Pedido DATE,
    Hora_Pedido TIME,
    Precio DECIMAL(10, 2),
    Estado VARCHAR(50),
    Eliminado BOOLEAN,
    FOREIGN KEY (ID_Cliente) REFERENCES Cliente(ID_Cliente),
    FOREIGN KEY (ID_Vendedor) REFERENCES Vendedor(ID_Vendedor),
    FOREIGN KEY (ID_Pago) REFERENCES Pago(ID_Pago)
);


CREATE TABLE ItemPedido(
    ID_ItemPedido INT AUTO_INCREMENT PRIMARY KEY,
    ID_Pedido INT,
    ID_ItemMenu INT,
    Cantidad INT,
    FOREIGN KEY (ID_Pedido) REFERENCES Pedido(ID_Pedido),
    FOREIGN KEY (ID_ItemMenu) REFERENCES ItemMenu(ID_ItemMenu)
);