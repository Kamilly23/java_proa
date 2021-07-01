-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Jul-2021 às 23:32
-- Versão do servidor: 10.4.18-MariaDB
-- versão do PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `conta_bancaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `deposito`
--

CREATE TABLE `deposito` (
  `nome` varchar(70) NOT NULL,
  `numero_conta` int(9) NOT NULL,
  `agencia` int(4) NOT NULL,
  `valor_deposito` int(11) NOT NULL,
  `tipo_deposito` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `rendimento`
--

CREATE TABLE `rendimento` (
  `id_titular` int(11) NOT NULL,
  `saldo` double NOT NULL,
  `total_saque` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `saque`
--

CREATE TABLE `saque` (
  `nome` varchar(70) NOT NULL,
  `numero_conta` int(9) NOT NULL,
  `agencia` int(7) NOT NULL,
  `saldo` double NOT NULL,
  `valor` double NOT NULL,
  `total_saques` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `titular`
--

CREATE TABLE `titular` (
  `nome` varchar(70) NOT NULL,
  `numero_conta` int(9) NOT NULL,
  `agencia` int(4) NOT NULL,
  `data_check` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `telefone` int(11) NOT NULL,
  `senha` int(8) NOT NULL,
  `cpf` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `rendimento`
--
ALTER TABLE `rendimento`
  ADD PRIMARY KEY (`id_titular`);

--
-- Índices para tabela `saque`
--
ALTER TABLE `saque`
  ADD KEY `nome` (`nome`),
  ADD KEY `numero(conta)` (`numero_conta`),
  ADD KEY `agencia` (`agencia`);

--
-- Índices para tabela `titular`
--
ALTER TABLE `titular`
  ADD UNIQUE KEY `numero(conta)` (`numero_conta`),
  ADD UNIQUE KEY `agencia` (`agencia`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `rendimento`
--
ALTER TABLE `rendimento`
  MODIFY `id_titular` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
