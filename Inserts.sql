INSERT INTO Categoria (Descripcion, Tipo_item) VALUES
                                                   ('Plato principal', 'Principal'),
                                                   ('Entrada fría', 'Entrada'),
                                                   ('Postre dulce', 'Postre'),
                                                   ('Bebida alcohólica', 'Bebida'),
                                                   ('Bebida sin alcohol', 'Bebida');
INSERT INTO Cliente (Nombre, CUIT, Email, Direccion, CoordenadaLat, CoordenadaLng, Eliminado) VALUES
                                                                                       ('Juan Pérez', '20304050607', 'juan.perez@example.com', 'Calle Falsa 123', -34.603684, -58.381559, 0),
                                                                                       ('María López', '27384950601', 'maria.lopez@example.com', 'Av. Siempre Viva 742', -34.610122, -58.400776, 0);
INSERT INTO Vendedor (Nombre, Direccion, CoordenadaLat, CoordenadaLng, Eliminado) VALUES
                                                                           ('Restaurante El Buen Sabor', 'Av. Corrientes 1234', -34.603734, -58.381573, 0),
                                                                           ('Cafetería Delicias', 'Calle Gallo 567', -34.598569, -58.396377, 0);
INSERT INTO ItemMenu (Nombre, Descripcion, Precio, ID_Categoria, ID_Vendedor, GraduacionAlcoholica, Tamanio, Calorias, AptoCeliaco, AptoVegetariano, Peso, Eliminado) VALUES
                                                                                                                                                               ('Cerveza Artesanal', 'Cerveza IPA de 500ml', 350.00, 1, 1, 5.5, 500, 210, FALSE, FALSE, 0.5, 0),
                                                                                                                                                               ('Agua Mineral', 'Botella de agua de 500ml', 150.00, 2, 1, 0.0, 500, 0, TRUE, TRUE, 0.5, 0),
                                                                                                                                                               ('Milanesa con Papas', 'Milanesa de carne con papas fritas', 950.00, 3, 1, NULL, 1, 800, FALSE, FALSE, 0.75, 0),
                                                                                                                                                               ('Cheesecake', 'Porción de cheesecake con frutos rojos', 550.00, 4, 2, NULL, 1, 450, TRUE, TRUE, 0.3, 0);
INSERT INTO Pedido (ID_Cliente, ID_Vendedor, Fecha_Pedido, Hora_Pedido, Precio, Estado, Eliminado) VALUES
                                                                                            (1, 1, '2024-11-16', '12:30:00', 1300.00, 'EN_ESPERA',0),
                                                                                            (2, 2, '2024-11-15', '14:00:00', 550.00, 'EN_ESPERA',0);
INSERT INTO Pago (Metodo, Alias, CUIT, CVU) VALUES
                                                           ('Tarjeta', 'juan-perez', '20304050607', NULL),
                                                           ('Transferencia', NULL, '27384950601', '00012345000067890');
INSERT INTO ItemPedido (ID_Pedido, ID_ItemMenu, Cantidad) VALUES
                                                              (1, 1, 2),
                                                              (1, 3, 1),
                                                              (2, 4, 1);
