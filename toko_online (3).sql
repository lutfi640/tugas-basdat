-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 14, 2019 at 09:33 AM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_online`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(10) NOT NULL,
  `nama_barang` varchar(20) DEFAULT NULL,
  `jumlah_barang` int(5) DEFAULT NULL,
  `keterangan` varchar(100) DEFAULT NULL,
  `harga` int(10) DEFAULT NULL,
  `id_toko` int(10) NOT NULL,
  `image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jasa_pengiriman`
--

CREATE TABLE `jasa_pengiriman` (
  `id_jasa` char(10) NOT NULL,
  `lama_pengiriman` varchar(15) DEFAULT NULL,
  `id_transaksi` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `keranjang`
--

CREATE TABLE `keranjang` (
  `id_keranjang` int(10) NOT NULL,
  `id_toko` int(10) NOT NULL,
  `id_pembeli` int(10) NOT NULL,
  `id_barang` int(10) NOT NULL,
  `qty` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `metode_bayar`
--

CREATE TABLE `metode_bayar` (
  `id_bayar` char(10) NOT NULL,
  `jenis_pembayaran` varchar(20) DEFAULT NULL,
  `no_rekening` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `id_pembeli` int(10) NOT NULL,
  `nama_pembeli` varchar(20) DEFAULT NULL,
  `no_hp` char(13) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `alamat` varchar(40) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `toko`
--

CREATE TABLE `toko` (
  `id_toko` int(10) NOT NULL,
  `nama_toko` varchar(20) DEFAULT NULL,
  `no_hp` char(13) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `reputasi` varchar(20) DEFAULT NULL,
  `pembayaran_yg_berlaku` varchar(20) DEFAULT NULL,
  `kurir_yg_berlaku` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(10) NOT NULL,
  `id_barang` int(10) DEFAULT NULL,
  `id_pembeli` int(10) DEFAULT NULL,
  `id_toko` int(10) DEFAULT NULL,
  `qty` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Triggers `transaksi`
--
DELIMITER $$
CREATE TRIGGER `aft_decbrg` AFTER INSERT ON `transaksi` FOR EACH ROW update barang
set jumlah_barang = jumlah_barang - @qty
where id_barang = @id_brg
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `bfr_decbrg` BEFORE INSERT ON `transaksi` FOR EACH ROW set @qty = new.qty,
@id_brg = new.id_barang
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `del_keranjang` AFTER UPDATE ON `transaksi` FOR EACH ROW delete from keranjang where keranjang.id_pembeli = transaksi.id_pembeli
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `id_toko` (`id_toko`);

--
-- Indexes for table `jasa_pengiriman`
--
ALTER TABLE `jasa_pengiriman`
  ADD PRIMARY KEY (`id_jasa`);

--
-- Indexes for table `keranjang`
--
ALTER TABLE `keranjang`
  ADD PRIMARY KEY (`id_keranjang`),
  ADD KEY `id_toko` (`id_toko`),
  ADD KEY `id_pembeli` (`id_pembeli`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `metode_bayar`
--
ALTER TABLE `metode_bayar`
  ADD PRIMARY KEY (`id_bayar`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`id_pembeli`),
  ADD UNIQUE KEY `no_hp` (`no_hp`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `toko`
--
ALTER TABLE `toko`
  ADD PRIMARY KEY (`id_toko`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `no_hp` (`no_hp`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_penjual` (`id_toko`),
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_pembeli` (`id_pembeli`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pembeli`
--
ALTER TABLE `pembeli`
  MODIFY `id_pembeli` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(10) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`id_toko`) REFERENCES `toko` (`id_toko`);

--
-- Constraints for table `keranjang`
--
ALTER TABLE `keranjang`
  ADD CONSTRAINT `keranjang_ibfk_1` FOREIGN KEY (`id_toko`) REFERENCES `toko` (`id_toko`),
  ADD CONSTRAINT `keranjang_ibfk_2` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`),
  ADD CONSTRAINT `keranjang_ibfk_3` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
