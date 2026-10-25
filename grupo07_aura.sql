-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 25-10-2026 a las 16:15:38
-- Versión del servidor: 8.0.25
-- Versión de PHP: 7.3.29-1~deb10u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `grupo07_aura`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agendamentos`
--

CREATE TABLE `agendamentos` (
  `codigo` int NOT NULL,
  `cliente_codigo` int NOT NULL,
  `servico_codigo` int NOT NULL,
  `data_agendamento` date NOT NULL,
  `horario` time NOT NULL,
  `profissional` varchar(100) NOT NULL,
  `status` varchar(20) NOT NULL,
  `observacoes` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `agendamentos`
--

INSERT INTO `agendamentos` (`codigo`, `cliente_codigo`, `servico_codigo`, `data_agendamento`, `horario`, `profissional`, `status`, `observacoes`) VALUES
(6, 2, 1, '2026-10-28', '21:10:00', 'Camila Santos', 'Agendado', '55'),
(7, 2, 2, '2026-10-24', '22:20:00', 'Mariana Oliveira', 'Confirmado', 'l'),
(8, 1, 2, '2026-10-29', '12:54:00', 'Camila Santos', 'Agendado', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `codigo` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `codigo_genero` int DEFAULT NULL,
  `pais` varchar(30) DEFAULT NULL,
  `tipo_documento` varchar(30) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `cep` varchar(12) DEFAULT NULL,
  `logradouro` varchar(150) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `uf` varchar(100) DEFAULT NULL,
  `numero` varchar(15) DEFAULT NULL,
  `complemento` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`codigo`, `nome`, `cpf`, `telefone`, `email`, `codigo_genero`, `pais`, `tipo_documento`, `data_nascimento`, `cep`, `logradouro`, `bairro`, `cidade`, `uf`, `numero`, `complemento`) VALUES
(1, 'ffffffffffxddlllll', '________', '+54 9 3757 545997', 'cliente@gmail.com', NULL, 'Argentina', 'DNI', NULL, '', '', '', '', 'Selecione...', '', ''),
(2, 'alalalalañññ', '40984433', '+54 9 3757 545997', '', NULL, 'Argentina', 'DNI', NULL, '', '', '', '', 'Selecione...', '', ''),
(3, 'sabrina dada', '40984435', '+54 9 3757 545997', 'sabrina@gmail.com', 2, 'Argentina', 'DNI', '1998-02-23', '3370', 'lk', 'jj', 'lk', 'La Pampa', '55', '5lm');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicos`
--

CREATE TABLE `servicos` (
  `codigo` int NOT NULL,
  `descricao` varchar(150) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `tipo_servico` varchar(100) NOT NULL DEFAULT '',
  `valor` decimal(10,2) NOT NULL,
  `duracao` int NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `servicos`
--

INSERT INTO `servicos` (`codigo`, `descricao`, `categoria`, `tipo_servico`, `valor`, `duracao`, `status`) VALUES
(1, 'poo', 'Cabelo', 'Corte masculino', '50.00', 20, 'Ativo'),
(2, 'k', 'Unhas', 'Pedicure', '58.00', 20, 'Ativo'),
(3, 'lalala', 'Unhas', 'Pedicure', '50.00', 50, 'Ativo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sexualidade`
--

CREATE TABLE `sexualidade` (
  `codigo` int NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `sigla` varchar(10) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `sexualidade`
--

INSERT INTO `sexualidade` (`codigo`, `descricao`, `sigla`, `status`) VALUES
(1, 'masculino teste', 'm', 'Ativo'),
(2, 'femenino', 'f', 'Ativo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agendamentos`
--
ALTER TABLE `agendamentos`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `cliente_codigo` (`cliente_codigo`),
  ADD KEY `servico_codigo` (`servico_codigo`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codigo_genero` (`codigo_genero`);

--
-- Indices de la tabla `servicos`
--
ALTER TABLE `servicos`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `sexualidade`
--
ALTER TABLE `sexualidade`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `agendamentos`
--
ALTER TABLE `agendamentos`
  MODIFY `codigo` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `codigo` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `servicos`
--
ALTER TABLE `servicos`
  MODIFY `codigo` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `sexualidade`
--
ALTER TABLE `sexualidade`
  MODIFY `codigo` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `agendamentos`
--
ALTER TABLE `agendamentos`
  ADD CONSTRAINT `agendamentos_ibfk_1` FOREIGN KEY (`cliente_codigo`) REFERENCES `clientes` (`codigo`),
  ADD CONSTRAINT `agendamentos_ibfk_2` FOREIGN KEY (`servico_codigo`) REFERENCES `servicos` (`codigo`);

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`codigo_genero`) REFERENCES `sexualidade` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
