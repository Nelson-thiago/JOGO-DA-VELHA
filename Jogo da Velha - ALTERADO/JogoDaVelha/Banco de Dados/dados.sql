-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09/06/2023 às 05:03
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `nomes`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `dados`
--

CREATE TABLE `dados` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `matricula` varchar(255) DEFAULT NULL,
  `pontos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `dados`
--

INSERT INTO `dados` (`id`, `nome`, `matricula`, `pontos`) VALUES
(1, 'ANTONIO HARLITON MARTINS DE SOUZA', '2022000628', 0),
(2, 'ALESSANDRA VAZ PEREIRA', '2021002548', 0),
(3, 'AMANDA PAULA DA SILVA SANTOS', '2022002275', 0),
(4, 'BEATRIZ MARTIRES PAES', '2020000870', 0),
(5, 'BERNARDO AMAZONAS DA CUNHA', '2019002999', 0),
(6, 'CAIO CESAR FANECO GONZAGA', '2022003497', 0),
(7, 'CARLOS ALEXANDRE BENTES CONCEIÇÃO', '2020001036', 0),
(8, 'DIEGO DA SILVA RAPOSO', '2022006560', 0),
(9, 'DIOGO AIRES DE SOUZA FILHO', '2022001536', 0),
(10, 'DOUGLAS DA COSTA CRUZ', '2022007431', 0),
(11, 'ESTEFANE MENEZES DE ANDRADE', '2022004144', 0),
(12, 'FABIO ANDRÉ DA FROTA LIMA', '2022004153', 0),
(13, 'FLÁVIO DE SOUZA SANTOS', '2022003998', 0),
(14, 'GABRIEL BEZERRA DE JESUS', '2022007530', 0),
(15, 'ITALO FREITAS DOS SANTOS', '2022002088', 0),
(16, 'IVONEY LEAL DOS SANTOS', '2019002961', 0),
(17, 'JONATHAN REBELLO NASCIMENTO', '2022002097', 0),
(18, 'JOSÉ MARQUES DA COSTA BISNETO', '2022000637', 0),
(19, 'JOSUÉ ALEXANDRE FERREIRA', '2022002103', 0),
(20, 'JUAN SANTOS DE OLIVEIRA', '2022004912', 0),
(21, 'JÚLIA DONADELLI GIROLDO', '2022001966', 0),
(22, 'KAUA ANTHONY BASTOS VIEIRA', '2022007478', 0),
(23, 'NELSON THIAGO DA SILVA PINTO', '2022004387', 0),
(24, 'KEYLLA CILENY GOMES DA PAIXÃO', '2022000646', 0),
(29, 'LÍVIA SILVA DE OLIVEIRA', '2022001509', 0),
(30, 'LUCIANO DE CARVALHO FILARDI', '2022007440', 0),
(31, 'LUIZ CLAUDIO DO NASCIMENTO XAVIER', '2022007422', 0),
(32, 'MARIELLE MAR SANTOS', '2022002121', 0),
(33, 'MATHEUS ANDRADE DE OLIVEIRA', '2022002284', 0),
(34, 'MATHEUS PAZ ASSUNÇÃO', '2022002140', 0),
(35, 'MAXIMUS SAULO GUERREIRO FERREIRA', '2022006505', 0),
(36, 'MIGUEL PINHEIRO LEITE', '2022007487', 0),
(37, 'NADSON CLEY BEZERRA DE ARAUJO', '2022001975', 0),
(38, 'NATÃ DA SILVA PINTO', '2022001554', 0),
(39, 'RAIMUNDO DIONE ÁLVARO DE ARAÚJO', '2022004037', 0),
(40, 'REBECA SOBREIRA DA SILVA', '2022006603', 0),
(41, 'SABRINA DA SILVA FRAZÃO', '2022002300', 0),
(42, 'SAMUEL BARROS ANIJAR', '2022006532', 0),
(43, 'VINICIUS MOREIRA ARAÚJO', '2022004046', 0),
(44, 'WARLISON SAMUEL ALVES DA SILVA', '2022002168', 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `dados`
--
ALTER TABLE `dados`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `dados`
--
ALTER TABLE `dados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;