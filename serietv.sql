-- MySQL dump 10.13  Distrib 8.0.42, for Linux (x86_64)
--
-- Host: localhost    Database: serietv
-- ------------------------------------------------------
-- Server version	8.0.42-0ubuntu0.24.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `serie`
--

DROP TABLE IF EXISTS `serie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `serie` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(10) NOT NULL,
  `titulo` varchar(200) NOT NULL,
  `fecha` date NOT NULL,
  `temporadas` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `actores` varchar(200) NOT NULL,
  `sinopsis` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serie`
--

LOCK TABLES `serie` WRITE;
/*!40000 ALTER TABLE `serie` DISABLE KEYS */;
INSERT INTO `serie` VALUES (1,'ST001','Stranger Things','2016-07-15','4','Ciencia Ficcion','Millie Bobby Brown, Finn Wolfhard','Un grupo de niños se enfrenta a fuerzas sobrenaturales en los años 80.'),(2,'BB002','Breaking Bad','2008-01-20','5','Drama','Bryan Cranston, Aaron Paul','Un profesor de química se convierte en fabricante de metanfetamina.'),(3,'FR003','Friends','1994-09-22','10','comedia','Jennifer Aniston, Courteney Cox','Un grupo de amigos vive situaciones divertidas en Nueva York.'),(4,'GH004','Grey\'s Anatomy','2005-03-27','19','drama','Ellen Pompeo, Patrick Dempsey','Drama médico centrado en la vida de los cirujanos del Seattle Grace Hospital.'),(5,'MX005','Merlina','2022-11-23','1','misterio','Jenna Ortega, Catherine Zeta-Jones','La hija de la familia Addams investiga una serie de asesinatos en su nueva escuela.'),(6,'LO006','Loki','2021-06-09','2','acción','Tom Hiddleston, Sophia Di Martino','El dios del engaño viaja por el tiempo tras robar el Teseracto.'),(7,'WD007','The Walking Dead','2010-10-31','11','terror','Andrew Lincoln, Norman Reedus','Un grupo de supervivientes lucha por vivir en un mundo invadido por zombis.'),(8,'OU008','Outlander','2014-08-09','7','romántica','Caitriona Balfe, Sam Heughan','Una enfermera viaja en el tiempo desde 1945 hasta 1743 en Escocia.');
/*!40000 ALTER TABLE `serie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-09 17:12:19
