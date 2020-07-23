-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 21, 2020 at 06:35 AM
-- Server version: 5.7.11
-- PHP Version: 7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coronavirus`
--

-- --------------------------------------------------------

--
-- Table structure for table `cas`
--

CREATE TABLE `cas` (
  `id_cas` int(50) NOT NULL,
  `Date` Date NOT NULL,
  `nouveau_cas` int(255) NOT NULL,
  `ville` varchar(150) NOT NULL,
  `nombre_deces` int(255) NOT NULL,
  `nombre_gueris` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cas`
--

INSERT INTO `cas` (`id_cas`, `Date`, `nouveau_cas`, `ville`, `nombre_deces`, `nombre_gueris`) VALUES
(1, '2020-07-01', 400, 'Antananarivo', 50, 300),
(2, '2020-07-01', 78, 'Tamatave', 13, 50),
(3, '2020-07-01', 31, 'Antsirabe', 5, 21),
(4, '2020-07-01', 90, 'Fianarantsoa', 82, 130),
(5, '2020-07-01', 1, 'Toliara', 0, 2),
(6, '2020-07-01', 2, 'Majunga', 0, 0),
(7, '2020-07-02', 300, 'Antananarivo', 50, 300),
(8, '2020-07-02', 60, 'Tamatave', 13, 50),
(9, '2020-07-02', 50, 'Antsirabe', 5, 21),
(10, '2020-07-02', 100, 'Fianarantsoa', 82, 130),
(11, '2020-07-02', 10, 'Toliara', 0, 2),
(12, '2020-07-02', 20, 'Majunga', 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cas`
--
ALTER TABLE `cas`
  ADD PRIMARY KEY (`id_cas`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cas`
--
ALTER TABLE `cas`
  MODIFY `id_cas` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
