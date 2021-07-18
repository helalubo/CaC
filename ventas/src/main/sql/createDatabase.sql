SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";




/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ventas_db`
--
CREATE DATABASE IF NOT EXISTS `ventas_db` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci;
USE `ventas_db`;

-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `videosJuegos`
--
CREATE TABLE `ventas_db`.`producto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` INT(150) NULL,
  `nombre` VARCHAR(200) NULL,
  `marca` VARCHAR(200) NULL,
  `tipo` VARCHAR(200) NULL,
  `pais` VARCHAR(45) NULL,
  `descripcion` VARCHAR(550) NULL,
  `precio` float,
  PRIMARY KEY (`id`));


  CREATE TABLE `ventas_db`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dni` VARCHAR(40) NULL,
  `nombre` VARCHAR(200) NULL,
  `apellido` VARCHAR(45) NULL,
  `direccion` VARCHAR(200) NULL,
  `telefono` int( 11 ),
  `correo` VARCHAR(550) NULL,
  `clave` VARCHAR(550) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `ventas_db`.`venta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT,
  `idProducto` INT,
  `metodoDePago` VARCHAR(200) NULL,
  `fecha` datetime not null DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));




  
