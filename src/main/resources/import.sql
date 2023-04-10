-- Marcas
INSERT INTO marca (nombre, detalle) VALUES ('Coca-Cola', 'Marca de refrescos y bebidas');
INSERT INTO marca (nombre, detalle) VALUES ('Bimbo', 'Marca de pan y bollería');
INSERT INTO marca (nombre, detalle) VALUES ('Pepsi', 'Marca de refrescos y bebidas');
INSERT INTO marca (nombre, detalle) VALUES ('Nestlé', 'Marca de alimentos y bebidas');
INSERT INTO marca (nombre, detalle) VALUES ('Kellogg''s', 'Marca de cereales y alimentos para el desayuno');
INSERT INTO marca (nombre, detalle) VALUES ('Lays', 'Marca de snacks');
INSERT INTO marca (nombre, detalle) VALUES ('Ferrero Rocher', 'Marca de chocolates y dulces');
INSERT INTO marca (nombre, detalle) VALUES ('Quaker', 'Marca de cereales y avena');
INSERT INTO marca (nombre, detalle) VALUES ('Colgate', 'Marca de productos para la higiene bucal');
INSERT INTO marca (nombre, detalle) VALUES ('Mars', 'Marca de chocolates y dulces');
INSERT INTO marca (nombre, detalle) VALUES ('Sprite', 'Marca de refrescos y bebidas');
INSERT INTO marca (nombre, detalle) VALUES ('Oreo', 'Marca de galletas y snacks');
INSERT INTO marca (nombre, detalle) VALUES ('Gatorade', 'Marca de bebidas deportivas');
INSERT INTO marca (nombre, detalle) VALUES ('Hershey''s', 'Marca de chocolates y dulces');
INSERT INTO marca (nombre, detalle) VALUES ('Red Bull', 'Marca de bebidas energéticas');
INSERT INTO marca (nombre, detalle) VALUES ('M&M''s', 'Marca de chocolates y dulces');
INSERT INTO marca (nombre, detalle) VALUES ('Tostitos', 'Marca de snacks y tortilla chips');
INSERT INTO marca (nombre, detalle) VALUES ('Doritos', 'Marca de snacks y tortilla chips');
INSERT INTO marca (nombre, detalle) VALUES ('Wrigley''s', 'Marca de chicles y caramelos');

--Categorias
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Refrescos', 'Productos de refrescos de las marcas Coca-Cola y Pepsi');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Pan', 'Productos de pan de la marca Bimbo');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Alimentos', 'Productos de alimentos de la marca Nestlé');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Cereales', 'Productos de cereales de la marca Kellogg''s');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Snacks', 'Productos de snacks de las marcas Lays y Oreo');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Chocolates y dulces', 'Productos de chocolates y dulces de las marcas Ferrero Rocher y Hershey''s');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Bebidas deportivas', 'Productos de bebidas deportivas de la marca Gatorade');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Bebidas energéticas', 'Productos de bebidas energéticas de la marca Red Bull');

INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Coca-Cola','1245','Refresco de cola de la marca Coca-Cola',1,1, 'ABCD12',250,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Bimbo Pan Blanco','3987','Pan blanco de la marca Bimbo',2,2, 'KLMN34',340,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Nestlé Chocolate','7831','Crunch	Chocolate con cereal de la marca Nestlé',5,4, 'PQR789',850,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Kelloggs Corn Flakes','9256','Kelloggs Corn Flakes	Cereales de maíz de la marca Kellogg',3,5, 'XYZ123',486,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Lays Papas Fritas','2568','Lays Papas Fritas	Papas fritas de la marca Lays',4,6, 'DEF456',730,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Ferrero Rocher','4567','Bombones de chocolate de la marca Ferrero Rocher	Chocolates y dulces',5,7, 'GHI789',1500,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Gatorade Orange','7894','Bebida deportiva sabor naranja de la marca Gatorade	Bebidas deportivas',7,13, 'JKL567',350,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Red Bull','1325','Bebida energética de la marca Red Bull	Bebidas energéticas',7,15, 'MNO456',370,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Oreo','3467','Galleta con crema de la marca Oreo',5,12, 'PLL789',239,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Hersheys Kisses de Chocolate','5678','Chocolates pequeños de la marca Hershey',5,14, 'STU901',198,0,NOW());



--Categorías
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Desayuno', 'Productos de desayuno de la marca Quaker');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Aperitivos', 'Productos de aperitivos de la marca Tostitos');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Higiene bucal', 'Productos de higiene bucal de la marca Colgate');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Bebidas', 'Productos de bebidas de la marca Sprite');
INSERT INTO CATEGORIA_PRODUCTO (nombre, descripcion) VALUES ('Golosinas', 'Productos de golosinas de la marca M&M''s');

--Marcas
INSERT INTO marca (nombre, detalle) VALUES ('Quilmes', 'Marca de cervezas');
INSERT INTO marca (nombre, detalle) VALUES ('La Serenísima', 'Marca de productos lácteos');
INSERT INTO marca (nombre, detalle) VALUES ('Arcor', 'Marca de golosinas y alimentos');
INSERT INTO marca (nombre, detalle) VALUES ('Natura', 'Marca de productos de belleza y cuidado personal');
INSERT INTO marca (nombre, detalle) VALUES ('Peugeot', 'Marca de autos y vehículos');

--Productos
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Quaker Avena instantánea','1467','Avena instantánea de la marca Quaker para desayunos',6,8, 'AVN123',550,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Tostitos Salsa Dip','3426','Salsa Dip de la marca Tostitos para aperitivos',7,18, 'TST678',290,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Colgate Cepillo dental','7664','Cepillo dental de la marca Colgate para higiene bucal',8,9, 'COL890',120,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'Sprite Zero','9284','Sprite sin azúcar de la marca Sprite',9,12, 'SPR456',320,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'M&M''s cacahuate','1289','M&M''s de cacahuate de la marca M&M''s',10,17, 'MM1258',180,0,NOW());
INSERT INTO PRODUCTO (nombre_prod, codigo_prod, descripcion, categoria_id, marca_id, serial, precio, estado, fecha_alta) VALUES ( 'La Serenísima Leche','6372','Leche entera de la marca La Serenísima',3,10, 'LSR456',120,0,NOW());
