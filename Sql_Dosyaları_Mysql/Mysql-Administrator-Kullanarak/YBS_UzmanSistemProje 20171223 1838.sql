-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.21-MariaDB


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ybs_diyetisyen
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ ybs_diyetisyen;
USE ybs_diyetisyen;

--
-- Table structure for table `ybs_diyetisyen`.`girdiler`
--

DROP TABLE IF EXISTS `girdiler`;
CREATE TABLE `girdiler` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Ad` varchar(45) NOT NULL DEFAULT '',
  `Soyad` varchar(45) NOT NULL DEFAULT '',
  `Yas` int(10) unsigned NOT NULL DEFAULT '0',
  `Boy` int(10) unsigned NOT NULL DEFAULT '0',
  `Kilo` double NOT NULL DEFAULT '0',
  `Beslenme` int(10) unsigned NOT NULL DEFAULT '0',
  `EgzersizSuresi` varchar(45) NOT NULL DEFAULT '0',
  `SuMiktari` varchar(45) NOT NULL DEFAULT '0',
  `EkmekTuketimi` tinyint(1) NOT NULL DEFAULT '0',
  `IlacTuketimi` tinyint(1) NOT NULL DEFAULT '0',
  `Tarih` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `ybs_diyetisyen`.`girdiler`
--

/*!40000 ALTER TABLE `girdiler` DISABLE KEYS */;
INSERT INTO `girdiler` (`ID`,`Ad`,`Soyad`,`Yas`,`Boy`,`Kilo`,`Beslenme`,`EgzersizSuresi`,`SuMiktari`,`EkmekTuketimi`,`IlacTuketimi`,`Tarih`) VALUES 
 (1,'Ali O?ulcan','Gümü?soy',0,181,0,2,'30-','1.5-2',1,0,'2017-12-23T18:37:16.915');
/*!40000 ALTER TABLE `girdiler` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
