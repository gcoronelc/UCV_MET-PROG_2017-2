/*
Empresa        :  EGCC
Software       :  Examen Parcial
DBMS           :  SQL SERVER
Base de Datos  :  ventas
Script         :  Crea la base de datos con sus respectivas tablas
Responsable    :  Ing. Eric Gustavo Coronel Castillo
Telefono       :  (511) 9966-64457
Email          :  gcoronelc@gmail.com
Blog           :  http://gcoronelc.blogspot.com
Creado el      :  27-09-2017
*/



-- =============================================
-- Creación de la Base de Datos
-- =============================================

USE master;
go

IF( EXISTS ( SELECT name FROM master.sys.databases WHERE name = 'VENTAS' ) )
BEGIN
	DROP DATABASE VENTAS;
END;
go

CREATE DATABASE VENTAS;
go


-- =============================================
-- Seleccionar la Base de Datos
-- =============================================

USE VENTAS;


-- =============================================
-- CREACION DE TABLAS DE VENTAS
-- =============================================

CREATE TABLE VENTA
( 
	idventa              int IDENTITY ,
	fecha                date not null DEFAULT GETDATE(),
	empresa              varchar(100) NOT NULL,
	categoria            varchar(20) NOT NULL,
	nombre               varchar(100)  NOT NULL,
	precio               decimal(10,2) NOT NULL,
	cantidad             int NOT NULL,
	importe              decimal(10,2) NOT NULL DEFAULT (0),
	impuesto             decimal(10,2) NOT NULL DEFAULT (0),
	total                decimal(10,2) NOT NULL DEFAULT (0),
	tganancia            int NOT NULL check( tganancia IN (1,2) ) DEFAULT 1,
	pganancia            decimal(5,2) NOT NULL DEFAULT (0),
	ganancia             decimal(10,2) NOT NULL DEFAULT (0),
	CONSTRAINT XPKVENTA PRIMARY KEY  NONCLUSTERED (idventa ASC)
);
go


-- =============================================
-- CARGA DE DATOS
-- =============================================

INSERT INTO VENTA(fecha,empresa,categoria,nombre,precio,cantidad) 
VALUES('20170715','UCH','PROGRAMACION','SPRING FRAMEWORK',800.0,10);

INSERT INTO VENTA(fecha,empresa,categoria,nombre,precio,cantidad) 
VALUES('20170716','UCV','PROGRAMACION','SPRING FRAMEWORK',800.0,15);

INSERT INTO VENTA(fecha,empresa,categoria,nombre,precio,cantidad) 
VALUES('20170810','BANCO DE CREDITO','OFIMATICA','TABLAS DINAMICAS',500.0,35);

INSERT INTO VENTA(fecha,empresa,categoria,nombre,precio,cantidad) 
VALUES('20170815','CONTINENTAL','OFIMATICA','MANEJO DE DATOS',500.0,40);

INSERT INTO VENTA(fecha,empresa,categoria,nombre,precio,cantidad) 
VALUES('20170818','BANCO DE CREDITO','PROGRAMACION','JAVA WEB',800.0,50);

INSERT INTO VENTA(fecha,empresa,categoria,nombre,precio,cantidad) 
VALUES('20170920','ISIL','PROGRAMACION','DESARROLLO CON ANDROID',800.0,15);


SELECT * FROM VENTA;

-- =============================================
-- ACTUALIZAR DATOS
-- =============================================

UPDATE VENTA SET 
TOTAL = PRECIO * CANTIDAD,
TGANANCIA = case categoria 
				when 'PROGRAMACION' then iif(cantidad > 12, 2, 1) 
				when 'OFIMATICA' then iif(cantidad > 12, 2, 1) 
				when 'ADMINISTRACION' then iif(cantidad > 12, 2, 1) 
				when 'OTROS' then iif(cantidad > 12, 2, 1) 
		    end,
PGANANCIA = case categoria 
				when 'PROGRAMACION' then iif(cantidad > 12, 0.07, 0.05) 
				when 'OFIMATICA' then iif(cantidad > 12, 0.05, 0.03) 
				when 'ADMINISTRACION' then iif(cantidad > 12, 0.10, 0.08) 
				when 'OTROS' then iif(cantidad > 12, 0.06, 0.04) 
		    end;

UPDATE VENTA SET 
IMPORTE = TOTAL / 1.18;

UPDATE VENTA SET 
IMPUESTO = TOTAL - IMPORTE,
GANANCIA  = PGANANCIA * IMPORTE;
GO


-- =============================================
-- CONSULTA 1
-- =============================================

SELECT * FROM VENTA;
GO

SELECT empresa, nombre curso, cantidad participantes, precio, importe, impuesto, total, ganancia
FROM VENTA
WHERE tganancia = 2;
GO



-- =============================================
-- CONSULTA 
-- =============================================

SELECT * FROM VENTA;
GO

SELECT 
	tganancia, nombre curso, cantidad participantes, precio, importe, impuesto, total, ganancia
FROM VENTA
WHERE empresa='BANCO DE CREDITO' and cantidad > 30;
GO


