-- This file is only provided to run on the MySQL Workbench or MySQL Shell to create tables and insert values.
-- Place this file on some other directory before starting the server.

-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: remotemysql.com:3306
-- Generation Time: Aug 01, 2021 at 08:05 AM
-- Server version: 8.0.13-4
-- PHP Version: 7.2.24-0ubuntu0.18.04.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `PKsLR7vkAi`
--

-- --------------------------------------------------------

--
-- Table structure for table `Book_Info`
--

CREATE TABLE `Book_Info` (
  `ISBN` bigint(20) NOT NULL,
  `Title` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Author` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Country` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Cover` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Book_Info`
--

INSERT INTO `Book_Info` (`ISBN`, `Title`, `Author`, `Country`, `Cover`, `Price`) VALUES
(111, 'War and Peace', 'Leo Tolstoy', 'Russia', 'Hard-Cover', 2276),
(112, 'Peace and Live', 'Leo Tolstoy', 'Russia', 'Hard-Cover', 2276),
(113, 'Friendship', 'Leo Tolstoy', 'Russia', 'Hard-Cover', 2276);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Book_Info`
--
ALTER TABLE `Book_Info`
  ADD PRIMARY KEY (`ISBN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
