DROP DATABASE IF EXISTS bdproyecto;
create database bdproyecto;
use bdproyecto;

-- Table: cliente
CREATE TABLE cliente (
    dni int  NOT NULL,
    nombre_cliente varchar(30)  NOT NULL,
    telefono_cliente char(9)  NOT NULL,
    direccion_cliente varchar(50)  NOT NULL,
    CONSTRAINT cliente_pk PRIMARY KEY  (dni)
);


INSERT INTO cliente VALUES("71765432", "Anderson Abarca", "987654321", "Av. El Parral #218");
INSERT INTO cliente VALUES("70345678", "Manuel Reyes", "895476321", "Jr. Los Alisos");
INSERT INTO cliente VALUES("73765432", "Francisco Castañeda", "241728673", "Av. Las Palmeras");
INSERT INTO cliente VALUES("71764432", "Victor Segovia", "127634892", "Av. Aviacion");

-- Table: empleado
CREATE TABLE empleado (
    codigo int primary key auto_increment,
    nombre_empleado varchar(30)  NOT NULL,
    telefono_empleado char(9)  NOT NULL,
    direccion_empleado varchar(50)  NOT NULL
)auto_increment=1001;

INSERT INTO empleado(nombre_empleado,telefono_empleado,direccion_empleado) VALUES("Gustavo Mendoza", "697114919", "Av. Las Rosas");
INSERT INTO empleado(nombre_empleado,telefono_empleado,direccion_empleado) VALUES("Ricardo Sanchez", "777920537", "Av. Las Flores");
INSERT INTO empleado(nombre_empleado,telefono_empleado,direccion_empleado) VALUES("Miguel Romero", "377089470", "Av. Bolivia");
INSERT INTO empleado(nombre_empleado,telefono_empleado,direccion_empleado) VALUES("Luis Gonzalez", "691366069", "Av. Primavera");

-- Table: producto
CREATE TABLE producto (
    id_producto int  NOT NULL,
    descripcion_producto varchar(30)  NOT NULL,
    precio_unitario decimal(8,1)  NOT NULL,
    stock_producto int  NOT NULL,
    proveedor_ruc_proveedor char(11)  NOT NULL,
    Categoria_id_categoria int  NOT NULL,
    CONSTRAINT producto_pk PRIMARY KEY  (id_producto)
);


INSERT INTO producto VALUES("10001", "Par de Zapatillas Adidas Negro", "299.9", "15", "20552103816", "1");
INSERT INTO producto VALUES("10002", "Par de Zapatillas Adidas Azul", "299.5", "20", "20552103816", "1");
INSERT INTO producto VALUES("10003", "Par de Zapatillas Adidas Rojo", "299.3", "25", "20570835654", "1");
INSERT INTO producto VALUES("10004", "Par de Zapatillas Adidas Negro", "299.9", "21", "20570835654", "1");
INSERT INTO producto VALUES("10005", "Par de Zapatillas Converse Urbanas Rojo", "359.9", "18", "20552103816", "1");
INSERT INTO producto VALUES("10006", "Par de Zapatillas Converse Clasica Negras", "309.9", "19", "20487854841", "1");
INSERT INTO producto VALUES("10007", "Par de Zandalias Adidas Blanco", "199.2", "12", "20552103817", "1");
INSERT INTO producto VALUES("10008", "Par de Zandalias Adidas Azul", "199.5", "12", "20552103817", "1");
INSERT INTO producto VALUES("10009", "Par de Zandalias Adidas Rojo", "199.3", "12", "20552103817", "1");
INSERT INTO producto VALUES("10010", "Par de Medias Negras", "29.3", "32", "20603431589", "1");
INSERT INTO producto VALUES("10011", "Par de Medias Azules", "29.3", "12", "20603431589", "1");
INSERT INTO producto VALUES("10012", "Par de Medias Amarillas", "29.3", "12", "20603431589", "1");
INSERT INTO producto VALUES("10013", "Par de Medias Grises", "25.9", "13", "20603431589", "1");
INSERT INTO producto VALUES("10014", "Par de Medias de Cuadrados Negros y Grises", "30.9", "14", "20525873103", "1");
INSERT INTO producto VALUES("20001", "Pantalón Largo Azul Oscuro", "89.9", "40", "20570659317", "2");
INSERT INTO producto VALUES("20002", "Pantalón Largo Rojo", "85.8", "27", "20570659317", "2");
INSERT INTO producto VALUES("20003", "Pantalón Largo Rosa", "86.5", "25", "20570659317", "2");
INSERT INTO producto VALUES("20004", "Pantalón Largo Celeste", "88.3", "35", "20525877605", "2");
INSERT INTO producto VALUES("20005", "Pantalón Largo Negro", "89.9", "36", "20525877605", "2");
INSERT INTO producto VALUES("20006", "Pantalón Largo Amarillo", "87.5", "35", "20525877605", "2");
INSERT INTO producto VALUES("20007", "Pantalón Largo Verde", "85.9", "40", "20450487059", "2");
INSERT INTO producto VALUES("20008", "Shorts Color Crema", "65.6", "35", "20490469797", "2");
INSERT INTO producto VALUES("20009", "Shorts Color Azul", "68.7", "35", "20490469797", "2");
INSERT INTO producto VALUES("20010", "Shorts Color Verde", "64.5", "35", "20526100876", "2");
INSERT INTO producto VALUES("20011", "Shorts Color Rojo", "65.2", "35", "20526100876", "2");
INSERT INTO producto VALUES("20012", "Shorts Color Negro", "69.3", "35", "20490469792", "2");
INSERT INTO producto VALUES("20013", "Prenda Interior de Hombre Celeste", "29.2", "20", "20136157133", "2");
INSERT INTO producto VALUES("20014", "Prenda Interior de Hombre Negro y Azul", "29.5", "22", "20136157133", "2");
INSERT INTO producto VALUES("20015", "Prenda Interior de Hombre Gris", "28.2", "25", "20136157133", "2");
INSERT INTO producto VALUES("20016", "Prenda Interior de Hombre Negro", "29.9", "15", "20603209975", "2");
INSERT INTO producto VALUES("20017", "Prenda Interior de Mujer Negro", "29.9", "30", "20542024748", "2");
INSERT INTO producto VALUES("20018", "Prenda Interior de Mujer Morado", "29.9", "20", "20603085087", "2");
INSERT INTO producto VALUES("20019", "Prenda Interior de Mujer Crema de Rayas", "29.9", "18", "20542024748", "2");
INSERT INTO producto VALUES("30001", "Camisa de Hombre Manga Corta Azul", "98.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30002", "Camisa de Hombre Manga Corta Verde", "95.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30003", "Camisa de Hombre Manga Corta Negro", "95.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30004", "Camisa de Hombre Manga Corta Gris", "85.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30005", "Camisa de Hombre Manga Largo Azul", "86.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30006", "Camisa de Hombre Manga Largo Verde", "87.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30007", "Camisa de Hombre Manga Largo Negro", "88.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30008", "Camisa de Hombre Manga Largo Gris", "90.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30009", "Camisa de Mujer Amarillo", "89.9","20", "20603252307", "3");
INSERT INTO producto VALUES("30010", "Camisa de Mujer Verde", "99.9","20", "20603252307", "3");
INSERT INTO producto VALUES("30011", "Camisa de Mujer Negro", "86.9","20", "20603252307", "3");
INSERT INTO producto VALUES("30012", "Camisa de Mujer Rosado", "83.9","20", "20603252307", "3");
INSERT INTO producto VALUES("30013", "Camisa de Mujer Celeste", "82.9","20", "20605591061", "3");
INSERT INTO producto VALUES("30014", "Camiseta Deportiva de Perú", "69.9","20", "220603252307", "3");
INSERT INTO producto VALUES("30015", "Camiseta Deportiva de Real Madrid FC", "83.9","20", "20603252307", "3");
INSERT INTO producto VALUES("30016", "Camiseta Deportiva de PSG FC", "84.5","20", "20603252307", "3");
INSERT INTO producto VALUES("30017", "Camiseta Deportiva de Liverpool FC", "85.9","20", "20603252307", "3");
INSERT INTO producto VALUES("30018", "Camiseta Deportiva de Barcelona FC", "86.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30019", "Camiseta Deportiva de Liverpool FC", "89.9","20", "20553856451", "3");
INSERT INTO producto VALUES("30020", "Camiseta Deportiva de Manchester City FC", "89.9","20", "20605591061", "3");
INSERT INTO producto VALUES("30021", "Camiseta Deportiva de Azul", "89.9","20", "20605591061", "3");
INSERT INTO producto VALUES("30022", "Camiseta Deportiva de Verde", "89.9","20", "20605591061", "3");
INSERT INTO producto VALUES("30023", "Camiseta Deportiva de Negro", "89.9","20", "20605591061", "3");
INSERT INTO producto VALUES("30024", "Casaca de Hombre Negro", "100.2","20", "20605591061", "3");
INSERT INTO producto VALUES("30025", "Casaca de Hombre Azul", "99.9","20", "20605297324", "3");
INSERT INTO producto VALUES("30026", "Casaca de Hombre Verde", "98.9","20", "20605297324", "3");
INSERT INTO producto VALUES("30027", "Casaca de Hombre Rojo", "101.3","20", "20605297324", "3");
INSERT INTO producto VALUES("30028", "Casaca de Hombre Gris", "97.9","20", "20605297324", "3");
INSERT INTO producto VALUES("30029", "Chompa de Hombre Negro", "110.9","20", "20605297324", "3");
INSERT INTO producto VALUES("30030", "Chompa de Hombre Azul", "110.9","20", "20605297324", "3");
INSERT INTO producto VALUES("30031", "Chompa de Hombre Verde", "112.9","20", "20571835654", "3");
INSERT INTO producto VALUES("30032", "Chompa de Hombre Rojo", "119.8","20", "20571835654", "3");
INSERT INTO producto VALUES("30033", "Chompa de Hombre Gris", "113.9","20", "20571835654", "3");
INSERT INTO producto VALUES("30034", "Casaca de Hombre Blanco", "114.9","20", "20571835654", "3");
INSERT INTO producto VALUES("30035", "Chompa de Mujer Celeste", "110.9","20", "20571835654", "3");
INSERT INTO producto VALUES("30036", "Chompa de Mujer Rosado", "112.6","20", "20571835654", "3");
INSERT INTO producto VALUES("30037", "Chompa de Mujer Verde", "113.5","20", "20571835654", "3");
INSERT INTO producto VALUES("30038", "Chompa de Mujer Azul", "112.9","20", "20571835654", "3");
INSERT INTO producto VALUES("30039", "Chompa de Mujer Rojo", "114.5","20", "20571835654", "3");
INSERT INTO producto VALUES("30040", "Chompa de Mujer Negro", "115.3","20", "20602272291", "3");
INSERT INTO producto VALUES("30041", "Chompa de Mujer Blanco", "116.4","20", "20602272291", "3");
INSERT INTO producto VALUES("30042", "Polera Azul", "89.9","20", "20602272291", "3");
INSERT INTO producto VALUES("30043", "Polera Rojo", "85.9","20", "220602272291", "3");
INSERT INTO producto VALUES("30044", "Polera Negro", "86.3","20", "20602272291", "3");
INSERT INTO producto VALUES("30045", "Polera Gris", "85.9","20", "20602272291", "3");
INSERT INTO producto VALUES("30046", "Polera Verde", "89.9","20", "20602272291", "3");
INSERT INTO producto VALUES("30047", "Polera Rosado", "85.6","20", "20602272291", "3");
INSERT INTO producto VALUES("30048", "Polera Celeste", "89.9","20", "20602272291", "3");
INSERT INTO producto VALUES("30049", "Polera Blanco", "83.3","20", "20602272291", "3");
INSERT INTO producto VALUES("30050", "Polera Amarillo", "89.9","20", "20602272291", "3");
INSERT INTO producto VALUES("30051", "Polo de Hombre Azul", "69.2","20", "20601710316", "3");
INSERT INTO producto VALUES("30052", "Polo de Hombre Blanco", "65.9","20", "20601710316", "3");
INSERT INTO producto VALUES("30053", "Polo de Hombre Rojo", "68.5","20", "20601710316", "3");
INSERT INTO producto VALUES("30054", "Polo de Hombre Verde", "67.6","20", "20601710316", "3");
INSERT INTO producto VALUES("30055", "Polo de Hombre Amarillo", "63.9","20", "20601710316", "3");
INSERT INTO producto VALUES("30056", "Polo de Hombre Gris", "66.9","20", "20601710316", "3");
INSERT INTO producto VALUES("30057", "Polo de Hombre Negro", "65.9","20", "20601677688", "3");
INSERT INTO producto VALUES("30058", "Polo de Mujer Azul", "67.9","20", "20601677688", "3");
INSERT INTO producto VALUES("30059", "Polo de Mujer Verde", "68.7","20", "20601677688", "3");
INSERT INTO producto VALUES("30060", "Polo de Mujer Celeste", "66.8","20", "20601677688", "3");
INSERT INTO producto VALUES("30061", "Polo de Mujer Amarillo", "65.5","20", "20601677688", "3");
INSERT INTO producto VALUES("30062", "Polo de Mujer Rosado", "64.9","20", "20601677688", "3");
INSERT INTO producto VALUES("30063", "Polo de Mujer Naranja", "63.8","20", "20601677688", "3");
INSERT INTO producto VALUES("30064", "Polo de Mujer Gris", "68.9","20", "20601677688", "3");
INSERT INTO producto VALUES("30065", "Polo de Mujer Blanco", "66.6","20", "20601677688", "3");
INSERT INTO producto VALUES("30066", "Polo de Mujer Negro", "65.5","20", "20601677688", "3");
INSERT INTO producto VALUES("40001", "Lentes Color Negro", "120.9","15", "20493986385", "4");
INSERT INTO producto VALUES("40002", "Lentes Color Azul", "122.4","15", "20493986385", "4");
INSERT INTO producto VALUES("40003", "Gorro de Snow Gris", "92.2","15", "20603087624", "4");
INSERT INTO producto VALUES("40004", "Gorro de Snow Verde", "95.6","15", "20603087624", "4");
INSERT INTO producto VALUES("40005", "Gorro de Snow Azul", "96.9","15", "20603087624", "4");
INSERT INTO producto VALUES("40006", "Gorro de Snow Negro", "92.8","15", "20603087624", "4");
INSERT INTO producto VALUES("40007", "Gorro Color Negro", "95.6","15", "20603087624", "4");
INSERT INTO producto VALUES("40008", "Gorro Color Crema", "93.9","15", "20568938144", "4");
INSERT INTO producto VALUES("40009", "Gorro Color Azul", "98.9","15", "20568938144", "4");
INSERT INTO producto VALUES("40010", "Gorro Color Rojo", "99.5","15", "20568938144", "4");
INSERT INTO producto VALUES("40011", "Gorro Color Blanco", "96.9","15", "20568938144", "4");
INSERT INTO producto VALUES("40012", "Gorro Color Verde", "89.9","15", "20568938144", "4");
INSERT INTO producto VALUES("40013", "Aretes de Perlas", "120.9","15", "20600843576", "4");
INSERT INTO producto VALUES("40014", "Aretes de Aros", "125.9","15", "20600843576", "4");
INSERT INTO producto VALUES("40015", "Aretes de Corazon", "130.9","15", "20600843576", "4");
INSERT INTO producto VALUES("40016", "Pulsera Roja", "15.9","15", "20603614748", "4");
INSERT INTO producto VALUES("40017", "Pulsera de Colores", "16.9","15", "20603614748", "4");
INSERT INTO producto VALUES("40018", "Pulsera Azul", "13.9","15", "20603614748", "4");
INSERT INTO producto VALUES("40019", "Pulsera Negro", "14.7","15", "20603614748", "4");
INSERT INTO producto VALUES("40020", "Pulsera Gris", "10.9","15", "20603614748", "4");
INSERT INTO producto VALUES("40021", "Reloj Negro", "35.5","15", "20570812361", "4");
INSERT INTO producto VALUES("40022", "Reloj Verde", "34.6","15", "20570812361", "4");
INSERT INTO producto VALUES("40023", "Reloj Azul", "33.8","15", "20570812361", "4");

-- Table: Categoria
CREATE TABLE Categoria (
    id_categoria int  NOT NULL,
    nombre_categoria varchar(30)  NOT NULL,
    CONSTRAINT Categoria_pk PRIMARY KEY  (id_categoria)
);

INSERT INTO categoria VALUES("1", "Calzado");
INSERT INTO categoria VALUES("2", "Prendas Inferiores");
INSERT INTO categoria VALUES("3", "Prendas Superiores");
INSERT INTO categoria VALUES("4", "Accesorios");

-- Table: Marca
CREATE TABLE Marca (
    id_marca int primary key auto_increment,
    nombre_marca varchar(30)  NOT NULL
)auto_increment=101;

INSERT INTO Marca(nombre_marca) VALUES("Adidas");
INSERT INTO Marca(nombre_marca) VALUES("Puma");
INSERT INTO Marca(nombre_marca) VALUES("Prada");
INSERT INTO Marca(nombre_marca) VALUES("Hugo Boss");
INSERT INTO Marca(nombre_marca) VALUES("Chanel");
INSERT INTO Marca(nombre_marca) VALUES("Gucci");
INSERT INTO Marca(nombre_marca) VALUES("Zara");
INSERT INTO Marca(nombre_marca) VALUES("Nike");
INSERT INTO Marca(nombre_marca) VALUES("Q&Q Quartz");
INSERT INTO Marca(nombre_marca) VALUES("Seiko");
INSERT INTO Marca(nombre_marca) VALUES("Ray Ban");
INSERT INTO Marca(nombre_marca) VALUES("Guess");

-- Table: logearse
CREATE TABLE logearse (
    cliente_dni int  NOT NULL,
    empleado_codigo int  NOT NULL,
    contrasenia varchar(50)  NOT NULL,
    CONSTRAINT logearse_pk PRIMARY KEY  (empleado_codigo,cliente_dni)
) ENGINE='InnoDB'DEFAULT CHARSET =LATIN1;

INSERT INTO logearse VALUES("71765432", "", aes_encrypt('111','AES'));
INSERT INTO logearse VALUES("70345678", "", aes_encrypt('222','AES'));
INSERT INTO logearse VALUES("73765432", "", aes_encrypt('333','AES'));
INSERT INTO logearse VALUES("71764432", "", aes_encrypt('444','AES'));
INSERT INTO logearse VALUES("", "1001", aes_encrypt('555','AES'));
INSERT INTO logearse VALUES("", "1002", aes_encrypt('666','AES'));
INSERT INTO logearse VALUES("", "1003", aes_encrypt('777','AES'));
INSERT INTO logearse VALUES("", "1004", aes_encrypt('888','AES'));

-- Table: Registro_datos
CREATE TABLE Registro_datos (
    logearse_empleado_codigo int  NOT NULL,
    logearse_cliente_dni int  NOT NULL,
    correo varchar(50)  NOT NULL,
    CONSTRAINT Registro_datos_pk PRIMARY KEY  (logearse_empleado_codigo,logearse_cliente_dni)
);

INSERT INTO Registro_datos VALUES("1001", "", "gustavomendoza@gmail.com");
INSERT INTO Registro_datos VALUES("1002", "", "ricardosanchez@gmail.com");
INSERT INTO Registro_datos VALUES("1003", "", "miguelromero@gmail.com");
INSERT INTO Registro_datos VALUES("1004", "", "luisgonzalez@gmail.com");
INSERT INTO Registro_datos VALUES("", "71765432", "andersonabarca@gmail.com");
INSERT INTO Registro_datos VALUES("", "70345678", "manuelreyes@gmail.com");
INSERT INTO Registro_datos VALUES("", "73765432", "franciscocastañeda@gmail.com");
INSERT INTO Registro_datos VALUES("", "71764432", "victorsegovia@gmail.com");

-- Table: pedido_proveedor
CREATE TABLE pedido_proveedor (
    nro_pedido char(5)  NOT NULL,
    empleado_codigo int  NOT NULL,
    producto_id_producto int  NOT NULL,
    cantidad_pedido int  NOT NULL,
    fecha_pedido date  NOT NULL,
    proveedor_ruc_proveedor char(11)  NOT NULL,
    CONSTRAINT pedido_proveedor_pk PRIMARY KEY  (nro_pedido)
);

INSERT INTO pedido_proveedor VALUES("P0001","1001", "10001", "8", "2022-04-13","20552103816");
INSERT INTO pedido_proveedor VALUES("P0002","1002", "10003", "6", "2022-03-10","20570835654");
INSERT INTO pedido_proveedor VALUES("P0003","1002", "20005", "4", "2022-02-15","20525877605");
INSERT INTO pedido_proveedor VALUES("P0004","1004", "40001", "10", "2022-04-20","20605297324");
INSERT INTO pedido_proveedor VALUES("P0005","1001", "20011", "10", "2022-03-24","20603252307");
INSERT INTO pedido_proveedor VALUES("P0006","1002", "30011", "15", "2022-02-10","20526100876");
INSERT INTO pedido_proveedor VALUES("P0007","1003", "40010", "20", "2022-04-12","20568938144");
INSERT INTO pedido_proveedor VALUES("P0008","1004", "30015", "9", "2022-04-11","22060325230");

-- Table: detalle_venta
CREATE TABLE detalle_venta (
    cantidad int  NOT NULL,
    precio_venta decimal(8,1)  NOT NULL,
    producto_id_producto int  NOT NULL,
    venta_nro int  NOT NULL,
    CONSTRAINT detalle_venta_pk PRIMARY KEY  (producto_id_producto,venta_nro)
);

INSERT INTO detalle_venta VALUES("2","599.8","10001","1000001");
INSERT INTO detalle_venta VALUES("3","257.4","20002","1000002");
INSERT INTO detalle_venta VALUES("1","86.5","20003","1000003");
INSERT INTO detalle_venta VALUES("1","299.3","10003","1000004");
INSERT INTO detalle_venta VALUES("3","299.7","30010","1000005");
INSERT INTO detalle_venta VALUES("2","173.8","30005","1000006");
INSERT INTO detalle_venta VALUES("1","64.5","20010","1000007");
INSERT INTO detalle_venta VALUES("4","483.6","40001","1000008");

-- Table: historial_compra
CREATE TABLE historial_compra (
    detalle_venta_producto_id_producto int  NOT NULL,
    detalle_venta_venta_nro int  NOT NULL,
    fecha date  NOT NULL,
    importe decimal(8,1)  NOT NULL
);

INSERT INTO historial_compra VALUES("10001","1000001","2022-05-13","596.7");
INSERT INTO historial_compra VALUES("20002","1000002","2022-05-15","252.3");
INSERT INTO historial_compra VALUES("20003","1000003","2022-05-16","85");
INSERT INTO historial_compra VALUES("10003","1000004","2022-05-18","295.7");
INSERT INTO historial_compra VALUES("30010","1000005","2022-06-15","293.4");
INSERT INTO historial_compra VALUES("30005","1000006","2022-06-10","171.7");
INSERT INTO historial_compra VALUES("20010","1000007","2022-06-11","61.3");
INSERT INTO historial_compra VALUES("40001","1000008","2022-06-12","481.2");

-- Table: venta
CREATE TABLE venta (
    nro int primary key auto_increment,
    fecha_venta date  NOT NULL,
    descuento decimal(5,1)  NOT NULL,
    cliente_dni int  NOT NULL
)auto_increment=1000001;

INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES("2022-05-13","3.1","71765432");
INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES("2022-05-15","5.1","70345678");
INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES("2022-05-16","1.5","71765432");
INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES("2022-05-18","3.6","70345678");
INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES("2022-06-15","6.3","73765432");
INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES("2022-06-10","2.1","71764432");
INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES("2022-06-11","3.2","73765432");
INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES("2022-06-12","2.4","71764432");


-- Table: proveedor
CREATE TABLE proveedor (
    ruc_proveedor char(11)  NOT NULL,
    telefono_proveedor char(9)  NOT NULL,
    razon_social varchar(50)  NOT NULL,
    pagina_web varchar(50)  NOT NULL,
    direccion_proveedor varchar(45)  NOT NULL,
    Marca_id_marca int  NOT NULL,
    CONSTRAINT proveedor_pk PRIMARY KEY  (ruc_proveedor)
);

INSERT INTO proveedor VALUES("20552103816","920890897","S.A.","https://www.adidas.pe/","Av. Óscar R. Benavides 1025","101");
INSERT INTO proveedor VALUES("20570835654","997258648","S.A.","https://www.adidas.pe/","Av. Arenales 2015","101");
INSERT INTO proveedor VALUES("20487854841","910247841","S.A.","https://www.adidas.pe/","Av. Angamos 1020","101");
INSERT INTO proveedor VALUES("20552103817","938145316","S.A.","https://about.puma.com/","Av. Canadá 3085","102");
INSERT INTO proveedor VALUES("20603431589","988795620","S.A.","https://about.puma.com/","Av. Fernando Wiesse 1024","102");
INSERT INTO proveedor VALUES("20525873103","974255723","S.A.","https://about.puma.com/","Av. Héroes del Cenepa 4035","102");
INSERT INTO proveedor VALUES("20570659317","967601069","S.A.C.","https://www.prada.com/es/es.html","Av. Javier Prado 1027","103");
INSERT INTO proveedor VALUES("20525877605","905666080","S.A.","https://www.hugoboss.com/home","Av. Brasil 2062","104");
INSERT INTO proveedor VALUES("20450487059","964535631","S.A.","https://www.hugoboss.com/home","Av. La Mar 1084","104");
INSERT INTO proveedor VALUES("20490469797","988555163","S.R.L.","https://www.chanel.com/es/","Av. Bolivia 1093","105");
INSERT INTO proveedor VALUES("20526100876","970218214","S.A.","https://www.gucci.com/","Av. Francisco Bolognesi 3074","106");
INSERT INTO proveedor VALUES("20490469792","941684074","S.A.","https://www.gucci.com/","Av. Los Próceres 1051","106");
INSERT INTO proveedor VALUES("20136157133","999967365","S.A.C.","https://www.prada.com/es/es.html","Av. Miguel Grau 4034","103");
INSERT INTO proveedor VALUES("20603209975","987374567","S.A.","https://www.zara.com/pe/","Av. Caquetá 1034","107");
INSERT INTO proveedor VALUES("20542024748","910589001","S.A.","https://www.zara.com/pe/","Av. El Pacífico 1052","107");
INSERT INTO proveedor VALUES("20603085087","958219177","S.A.","https://www.zara.com/pe/","Av. Húsares de Junín 3052","107");
INSERT INTO proveedor VALUES("20553856451","927230495","S.R.L.","https://www.chanel.com/es/","Av. Arequipa 1086","105");
INSERT INTO proveedor VALUES("20603252307","973949615","S.A.","https://www.nike.com/es/","Av. José Larco 1086","108");
INSERT INTO proveedor VALUES("20605591061","936559609","S.A.","https://www.nike.com/es/","Av. Guzmán Blanco 2024","108");
INSERT INTO proveedor VALUES("22060325230","989874436","S.A.","https://www.nike.com/es/","Av. Inca Garcilaso de la Vega 1021","108");
INSERT INTO proveedor VALUES("20605297324","991446107","S.A.C.","https://qq-watch.jp/eng/","Av. Cieneguilla 2022","109");
INSERT INTO proveedor VALUES("20571835654","900346576","S.A.","https://www.hugoboss.com/home","Av. Iquitos 1058","104");
INSERT INTO proveedor VALUES("20602272291","964152596","S.A.","https://www.guess.com.pe/","Av. España 4012","112");
INSERT INTO proveedor VALUES("20601710316","942296907","S.R.L.","https://www.seikowatches.com/es-es","Av. Salaverry 2008","110");
INSERT INTO proveedor VALUES("20601677688","947081739","S.A.","https://www.adidas.pe/","Av. José de San Martín 1002","101");
INSERT INTO proveedor VALUES("20493986385","911526786","S.A.","https://about.puma.com/","Av. San Borja Sur 2076","102");
INSERT INTO proveedor VALUES("20603087624","978307908","S.A.C.","https://qq-watch.jp/eng/","Av. Jorge Basadre 3072","109");
INSERT INTO proveedor VALUES("20568938144","991490674","S.A.","https://www.ray-ban.com/latam","Av. México 2039","111");
INSERT INTO proveedor VALUES("20600843576","946308987","S.A.","https://www.ray-ban.com/latam","Av. San Luis 1029","111");
INSERT INTO proveedor VALUES("20603614748","942540006","S.A.C.","https://qq-watch.jp/eng/","Av. Emancipación 2038","109");
INSERT INTO proveedor VALUES("20570812361","994589794","S.A.","https://www.guess.com.pe/","Av. Tingo María 3059","112");

