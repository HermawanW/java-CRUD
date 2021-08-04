-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 04, 2021 at 01:52 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tutorialjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `nis` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `jurusan` varchar(100) DEFAULT NULL,
  `jk` varchar(16) DEFAULT NULL,
  `alamat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`nis`, `nama`, `jurusan`, `jk`, `alamat`) VALUES
(1314174, 'caca', 'Rekayasa Perangkat Lunak', 'Laki-laki', 'Jl aja dulu siapa tau jodoh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`nis`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
