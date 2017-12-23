-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 23 Ara 2017, 16:40:35
-- Sunucu sürümü: 10.1.21-MariaDB
-- PHP Sürümü: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `ybs_diyetisyen`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `girdiler`
--

CREATE TABLE `girdiler` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Ad` varchar(45) NOT NULL DEFAULT '',
  `Soyad` varchar(45) NOT NULL DEFAULT '',
  `Yas` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `Boy` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `Kilo` double NOT NULL DEFAULT '0',
  `Beslenme` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `EgzersizSuresi` varchar(45) NOT NULL DEFAULT '0',
  `SuMiktari` varchar(45) NOT NULL DEFAULT '0',
  `EkmekTuketimi` tinyint(1) NOT NULL DEFAULT '0',
  `IlacTuketimi` tinyint(1) NOT NULL DEFAULT '0',
  `Tarih` varchar(45) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Tablo döküm verisi `girdiler`
--

INSERT INTO `girdiler` (`ID`, `Ad`, `Soyad`, `Yas`, `Boy`, `Kilo`, `Beslenme`, `EgzersizSuresi`, `SuMiktari`, `EkmekTuketimi`, `IlacTuketimi`, `Tarih`) VALUES
(1, 'Ali O?ulcan', 'Gümü?soy', 0, 181, 0, 2, '30-', '1.5-2', 1, 0, '2017-12-23T18:37:16.915');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `girdiler`
--
ALTER TABLE `girdiler`
  ADD PRIMARY KEY (`ID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `girdiler`
--
ALTER TABLE `girdiler`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
