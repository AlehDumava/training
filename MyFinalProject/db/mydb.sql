-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `enrollee`
--

DROP TABLE IF EXISTS `enrollee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollee` (
  `id` tinyint NOT NULL,
  `full_name` varchar(45) NOT NULL,
  `passport` varchar(45) NOT NULL,
  `user_id` tinyint NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `grades_idx` (`id`),
  CONSTRAINT `grades` FOREIGN KEY (`id`) REFERENCES `grades` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollee`
--

LOCK TABLES `enrollee` WRITE;
/*!40000 ALTER TABLE `enrollee` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrollee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grades`
--

DROP TABLE IF EXISTS `grades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grades` (
  `user_id` tinyint NOT NULL,
  `subject_first` decimal(2,1) DEFAULT NULL,
  `subject_second` decimal(2,1) DEFAULT NULL,
  `subject_third` decimal(2,1) DEFAULT NULL,
  `sertificate_score` decimal(2,1) DEFAULT NULL,
  `total_score` decimal(2,1) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grades`
--

LOCK TABLES `grades` WRITE;
/*!40000 ALTER TABLE `grades` DISABLE KEYS */;
/*!40000 ALTER TABLE `grades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `speciality`
--

DROP TABLE IF EXISTS `speciality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `speciality` (
  `speciality_id` int DEFAULT NULL,
  `speciality` varchar(45) DEFAULT NULL,
  `faculty` varchar(45) DEFAULT NULL,
  `user_id` tinyint NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `speciality` FOREIGN KEY (`user_id`) REFERENCES `enrollee` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `speciality`
--

LOCK TABLES `speciality` WRITE;
/*!40000 ALTER TABLE `speciality` DISABLE KEYS */;
/*!40000 ALTER TABLE `speciality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `summary_table`
--

DROP TABLE IF EXISTS `summary_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `summary_table` (
  `id` tinyint NOT NULL,
  `final_evaluation` varchar(45) DEFAULT NULL,
  `enrollment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `summary` FOREIGN KEY (`id`) REFERENCES `grades` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `summary_table`
--

LOCK TABLES `summary_table` WRITE;
/*!40000 ALTER TABLE `summary_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `summary_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` tinyint NOT NULL,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  CONSTRAINT `id_enrollee` FOREIGN KEY (`id`) REFERENCES `enrollee` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-19 22:39:36
