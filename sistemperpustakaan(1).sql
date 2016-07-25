-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 26, 2015 at 04:01 PM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sistemperpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE IF NOT EXISTS `anggota` (
  `ID_Pendaftar` varchar(10) NOT NULL,
  `NIP_NIS` varchar(10) NOT NULL,
  `Nama` varchar(45) NOT NULL,
  `Tempat_Lahir` varchar(25) NOT NULL,
  `Tgl_Lahir` varchar(15) NOT NULL,
  `Jenis_Kelamin` varchar(15) NOT NULL,
  `Agama` varchar(15) NOT NULL,
  `Jurusan` varchar(15) NOT NULL,
  `Alamat` varchar(45) NOT NULL,
  `Status` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`ID_Pendaftar`, `NIP_NIS`, `Nama`, `Tempat_Lahir`, `Tgl_Lahir`, `Jenis_Kelamin`, `Agama`, `Jurusan`, `Alamat`, `Status`) VALUES
('ID004', '1104030044', 'Ncy', 'Tangerang', '01-06-1991', 'Perempuan', 'Budha', 'Mesin', 'Tanah gocap', 'Siswa'),
('ID001', '1104030099', 'INDRA', 'TANGERANG', '03-01-1994', 'Laki-Laki', 'ISLAM', 'TEKNIK', 'BALARAJA', 'Siswa'),
('ID002', '1104030052', 'SUBKI', 'BANDUNG', '11-11-1991', 'Laki-Laki', 'ISLAM', 'MULTIMEDIA', 'BOGOR', 'Guru'),
('ID003', '1104030011', 'DEANA', 'TANGERANG', '28-12-1995', 'Perempuan', 'ISLAM', 'AKUTANSI', 'BANDUNG', 'Guru'),
('ID005', '1104030001', 'BAGUS', 'TANGERANG', '11-01-1988', 'Laki-Laki', 'ISLAM', 'TEKNIK', 'CILEDUK', 'Siswa'),
('ID006', '1104030012', 'JOHAN', 'TANGERANG', '03-03-1989', 'Laki-Laki', 'ISLAM', 'OTOMOTIF', 'BALARAJA', 'Siswa'),
('ID007', '1104030086', 'INYONG', 'WATERGOLD', '19-01-1989', 'Laki-Laki', 'KHATOLIK', 'TEKNIK', 'PERUMNAS', 'Guru'),
('ID008', '1104030022', 'Olive', 'Tangerang', '11-11-1991', 'Perempuan', 'ISLAM', 'Otomotif', 'Balaraja', 'Siswa');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE IF NOT EXISTS `buku` (
  `ID_Buku` varchar(10) NOT NULL,
  `Judul` varchar(150) NOT NULL,
  `Pengarang` varchar(45) NOT NULL,
  `Penerbit` varchar(45) NOT NULL,
  `ISBN` varchar(15) NOT NULL,
  `Tahun` int(5) NOT NULL,
  `Kategori` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`ID_Buku`, `Judul`, `Pengarang`, `Penerbit`, `ISBN`, `Tahun`, `Kategori`) VALUES
('B001', 'Pengaruh Budaya Asing Terhadap Remaja Indonesia', 'Imam', 'Andre', '12345', 2015, 'Nasional'),
('B002', 'Perancangan Sistem', 'Rizal', 'Stuart', '123456789', 1990, 'Java'),
('B003', 'Perubahan Budaya', 'Eman', 'Siti', '1233210', 2015, 'Sosial'),
('B004', 'Belajar MySQL', 'Jems', 'Udin', '1234567', 2013, 'Pemrograman'),
('B005', 'Pedoman Penulisan Skripsi', 'Santoso', 'Sukron', '0987654', 2013, 'Pendidikan');

-- --------------------------------------------------------

--
-- Table structure for table `copybuku`
--

CREATE TABLE IF NOT EXISTS `copybuku` (
  `ID_Buku` varchar(10) NOT NULL,
  `Judul` varchar(150) NOT NULL,
  `Statusbuku` varchar(15) NOT NULL,
  `ID_Copybuku` varchar(10) NOT NULL,
  `Copy` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `copybuku`
--

INSERT INTO `copybuku` (`ID_Buku`, `Judul`, `Statusbuku`, `ID_Copybuku`, `Copy`) VALUES
('B001', 'Pengaruh Budaya Asing Terhadap Remaja Indonesia', 'Terpinjam', 'B00101', '01'),
('B001', 'Pengaruh Budaya Asing Terhadap Remaja Indonesia', 'Terpinjam', 'B00102', '02'),
('B002', 'Perancangan Sistem', 'Ada', 'B00203', '03'),
('B002', 'Perancangan Sistem', 'Ada', 'B00201', '01'),
('B002', 'Perancangan Sistem', 'Ada', 'B00202', '02'),
('B001', 'Pengaruh Budaya Asing Terhadap Remaja Indonesia', 'Terpinjam', 'B00103', '03'),
('B003', 'Perubahan Budaya', 'Ada', 'B00301', '01'),
('B003', 'Perubahan Budaya', 'Ada', 'B00302', '02'),
('B003', 'Perubahan Budaya', 'Ada', 'B00303', '03'),
('B004', 'Belajar MySQL', 'Ada', 'B00401', '01'),
('B004', 'Belajar MySQL', 'Ada', 'B00402', '02'),
('B004', 'Belajar MySQL', 'Ada', 'B00403', '03'),
('B005', 'Pedoman Penulisan Skripsi', 'Ada', 'B00501', '01'),
('B005', 'Pedoman Penulisan Skripsi', 'Ada', 'B00502', '02'),
('B005', 'Pedoman Penulisan Skripsi', 'Ada', 'B00503', '03');

-- --------------------------------------------------------

--
-- Table structure for table `denda`
--

CREATE TABLE IF NOT EXISTS `denda` (
  `KD_Denda` varchar(10) NOT NULL,
  `Jenis_Denda` varchar(15) NOT NULL,
  `Biaya` int(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `denda`
--

INSERT INTO `denda` (`KD_Denda`, `Jenis_Denda`, `Biaya`) VALUES
('D001', 'Hilang', 100000),
('D002', 'Rusak', 50000),
('D003', 'Telat', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `kartu`
--

CREATE TABLE IF NOT EXISTS `kartu` (
  `ID_Anggota` varchar(10) NOT NULL,
  `ID_Pendaftar` varchar(10) NOT NULL,
  `Nama_Kartu` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kartu`
--

INSERT INTO `kartu` (`ID_Anggota`, `ID_Pendaftar`, `Nama_Kartu`) VALUES
('A004', 'ID004', 'KARTU ANGGOTA PERPUSTAKAAN'),
('A003', 'ID003', 'KARTU ANGGOTA PERPUSTAKAAN'),
('A002', 'ID002', 'KARTU ANGGOTA PERPUSTAKAAN'),
('A001', 'ID001', 'KARTU ANGGOTA PERPUSTAKAAN'),
('A005', 'ID005', 'KARTU ANGGOTA PERPUSTAKAAN'),
('A006', 'ID006', 'KARTU ANGGOTA PERPUSTAKAAN'),
('A007', 'ID007', 'KARTU ANGGOTA PERPUSTAKAAN'),
('A008', 'ID008', 'KARTU ANGGOTA PERPUSTAKAAN');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE IF NOT EXISTS `peminjaman` (
  `No_Pinjam` varchar(10) NOT NULL,
  `Tgl_Pinjam` varchar(20) NOT NULL,
  `Tglhrskembali` varchar(20) NOT NULL,
  `ID_Anggota` varchar(10) NOT NULL,
  `ID_Copybuku` varchar(10) NOT NULL,
  `Statusbuku` varchar(15) NOT NULL,
  `Pinjam` int(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`No_Pinjam`, `Tgl_Pinjam`, `Tglhrskembali`, `ID_Anggota`, `ID_Copybuku`, `Statusbuku`, `Pinjam`) VALUES
('A00104', '23-May-2015', '30-May-2015', 'A001', 'B00103', 'Terpinjam', 4),
('A00103', '23-May-2015', '30-May-2015', 'A001', 'B00102', 'Terpinjam', 3),
('A00102', '23-May-2015', '30-May-2015', 'A001', 'B00101', 'Kembali', 2),
('A00101', '23-May-2015', '30-May-2015', 'A001', 'B00101', 'Kembali', 1),
('A00201', '10-Jul-2015', '17-Jul-2015', 'A002', 'B00101', 'Terpinjam', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE IF NOT EXISTS `pengembalian` (
  `No_Kembali` varchar(10) NOT NULL,
  `Tgl_Kembali` varchar(20) NOT NULL,
  `No_Pinjam` varchar(10) NOT NULL,
  `KD_Denda` varchar(10) NOT NULL,
  `Total` int(15) NOT NULL,
  `ID_Copybuku` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengembalian`
--

INSERT INTO `pengembalian` (`No_Kembali`, `Tgl_Kembali`, `No_Pinjam`, `KD_Denda`, `Total`, `ID_Copybuku`) VALUES
('K002', '23-May-2015', 'A00102', '', 0, 'B00101'),
('K001', '23-May-2015', 'A00101', '', 0, 'B00101');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
