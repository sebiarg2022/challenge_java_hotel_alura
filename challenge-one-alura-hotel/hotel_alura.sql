-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel_alura
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `huespedes`
--

DROP TABLE IF EXISTS `huespedes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `huespedes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `id_reserva` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_foreign_key_idx` (`id_reserva`),
  CONSTRAINT `id_foreign_key` FOREIGN KEY (`id_reserva`) REFERENCES `reservas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huespedes`
--

LOCK TABLES `huespedes` WRITE;
/*!40000 ALTER TABLE `huespedes` DISABLE KEYS */;
INSERT INTO `huespedes` VALUES (6,'alejandro','lucas','1980-10-23','argentino-argentina','112345678',1),(7,'juan','pedro','1980-10-17','argentino-argentina','112345678',3),(8,'alejo','saz','1970-10-15','australiano-australiana','11234567',6),(9,'juan','garcia','1960-10-30','belga-belga','2587896000',19);
/*!40000 ALTER TABLE `huespedes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_entrada` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `valor` varchar(45) DEFAULT NULL,
  `forma_pago` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
INSERT INTO `reservas` VALUES (1,'2022-10-05','2022-10-14','2000','Tarjeta de Débito'),(2,'2022-08-01','2022-10-14','2340','Tarjeta de Crédito'),(3,'2022-10-20','2022-10-28','1440','Tarjeta de Crédito'),(4,'2022-10-20','2022-10-13','1000','Tarjeta de Crédito'),(6,'2022-10-01','2022-10-01','2000','Tarjeta de Crédito'),(7,'2022-10-01','2022-10-01','2500','Tarjeta de Crédito'),(8,'2022-10-03','2022-10-01','3000','Tarjeta de Crédito'),(9,'2022-09-02','2022-10-19','6000','Tarjeta de Crédito'),(10,'2022-10-01','2022-10-20','5000','Tarjeta de Débito'),(11,'2022-10-01','2022-10-14','4800','Tarjeta de Crédito'),(12,'2022-10-05','2022-10-30','4500','Tarjeta de Débito'),(13,'2022-10-13','2022-10-29','2880','Dinero en efectivo'),(14,'2022-10-04','2022-10-31','4860','Dinero en efectivo'),(15,'2022-10-04','2022-10-27','4140','Tarjeta de Crédito'),(16,'2022-10-06','2022-10-07','180','Tarjeta de Crédito'),(17,'2022-10-06','2022-10-21','2700','Tarjeta de Crédito'),(18,'2022-10-06','2022-10-13','1260','Tarjeta de Crédito'),(19,'2022-10-06','2022-10-28','3960','Tarjeta de Crédito');
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-09 15:12:59
