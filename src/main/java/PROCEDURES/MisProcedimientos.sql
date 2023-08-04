drop procedure if exists spventa;
DELIMITER //
create procedure spventa(idproduc int,dni int,can int)
BEGIN
declare nrov int;
declare fec date;
declare des numeric(2,0);
declare preu,precv,imp numeric(8,1);
select precio_unitario into preu from producto where id_producto=idproduc;
select preu*can into precv;
select CURDATE() into fec;
if (can>5) then
   set des="5.1";
else
   set des="0.0";
end if;
select precv-des into imp;
INSERT INTO venta(fecha_venta,descuento,cliente_dni) VALUES(fec,des,dni);
select MAX(nro) into nrov from venta;
INSERT INTO detalle_venta VALUES(can,precv,idproduc,nrov);
INSERT INTO historial_compra VALUES(idproduc,nrov,fec,imp);
update producto set stock_producto=stock_producto-can where id_producto=idproduc;
end //
delimiter ;




drop procedure if exists spnvousuario;
DELIMITER //
create procedure spnvousuario(dni int,nome varchar(30),contra varchar(10), tele char(9),direc varchar(50), correo varchar(50))
BEGIN
declare coda int ;
if (dni=0) then
   insert into empleado(nombre_empleado,telefono_empleado,direccion_empleado) values(nome, tele, direc);
   select ifnull(max(codigo),0) into coda from empleado;
   insert into logearse values("", coda, contra);
   insert into Registro_datos values(coda, "", correo);
else
   insert into cliente values(dni, nome, tele, direc);
   insert into logearse values(dni, "", contra);
   insert into Registro_datos values("", dni, correo);
end if;
end //
delimiter ;




drop procedure if exists sppedidoprov;
DELIMITER //
create procedure sppedidoprov(codem int,idprodc int,can int,rc char(11))
BEGIN
declare nrov,cuenta int;
declare coda char(5);
declare fec date;
select ifnull(RIGHT(MAX(nro_pedido),4),0)+1 into cuenta from pedido_proveedor;
select concat('P',Lpad(cuenta,4,'0')) into  coda;
select CURDATE() into fec;
INSERT INTO pedido_proveedor VALUES(coda,codem,idprodc,can,fec,rc);
update producto set stock_producto=stock_producto+can where id_producto=idprodc;
end //
delimiter ;




drop procedure if exists speditpedidoprov;
DELIMITER //
create procedure speditpedidoprov(nrpedido char(5),idprod int,can int)
BEGIN
declare idprodant,canant int;
declare coda char(5);
declare fec date;
select CURDATE() into fec;
select producto_id_producto into idprodant from pedido_proveedor where nro_pedido=nrpedido;
select cantidad_pedido into canant from pedido_proveedor where nro_pedido=nrpedido;
if (idprodant=idprod) then
   update pedido_proveedor set cantidad_pedido=can,fecha_pedido=fec where nro_pedido=nrpedido;
   update producto set stock_producto=stock_producto-canant+can where id_producto=idprod;
else
   update pedido_proveedor set cantidad_pedido=can,fecha_pedido=fec,producto_id_producto=idprod where nro_pedido=nrpedido;
   update producto set stock_producto=stock_producto-canant where id_producto=idprodant;
   update producto set stock_producto=stock_producto+can where id_producto=idprod;
end if;
end //
delimiter ;




drop procedure if exists spdeletepedidoprov;
DELIMITER //
create procedure spdeletepedidoprov(nrpedido char(5))
BEGIN
declare idprodant,canant int;
declare fec date;
select CURDATE() into fec;
select producto_id_producto into idprodant from pedido_proveedor where nro_pedido=nrpedido;
select cantidad_pedido into canant from pedido_proveedor where nro_pedido=nrpedido;
delete from pedido_proveedor where nro_pedido=nrpedido;
update producto set stock_producto=stock_producto-canant where id_producto=idprodant;
end //
delimiter ;



drop procedure if exists speditventa;
DELIMITER //
create procedure speditventa(nrv int,idproduc int,can int)
BEGIN
declare canant int;
declare coda char(5);
declare fec date;
declare des numeric(2,0);
declare preu,precv,imp numeric(8,1);
select CURDATE() into fec;
select precio_unitario into preu from producto where id_producto=idproduc;
select preu*can into precv;
select cantidad into canant from detalle_venta where venta_nro=nrv;
if (can>5) then
   set des="5.1";
else
   set des="0.0";
end if;
select precv-des into imp;
update venta set fecha_venta=fec,descuento=des where nro=nrv;
update detalle_venta set cantidad=can,precio_venta=precv where venta_nro=nrv;
update historial_compra set fecha=fec,importe=precv where detalle_venta_venta_nro=nrv;
update producto set stock_producto=stock_producto+canant-can where id_producto=idproduc;
end //
delimiter ;


drop procedure if exists spdeleteventa;
DELIMITER //
create procedure spdeleteventa(nrv int)
BEGIN
declare idprodant,canant int;
declare fec date;
select CURDATE() into fec;
select producto_id_producto into idprodant from detalle_venta where venta_nro=nrv;
select cantidad into canant from detalle_venta where venta_nro=nrv;
delete from venta where nro=nrv;
delete from detalle_venta where venta_nro=nrv;
delete from historial_compra where detalle_venta_venta_nro=nrv;
update producto set stock_producto=stock_producto+canant where id_producto=idprodant;
end //
delimiter ;

