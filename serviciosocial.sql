-- MySQL dump 10.13  Distrib 5.5.21, for Win64 (x86)
--
-- Host: localhost    Database: serviciosocial
-- ------------------------------------------------------
-- Server version	5.5.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumno` (
  `matricula` varchar(9) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `correoElectronico` varchar(30) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `programaEducativo` varchar(30) NOT NULL,
  PRIMARY KEY (`matricula`),
  UNIQUE KEY `matricula_UNIQUE` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES ('S17012932','Gonzáles Portilla Susana','susana-140294@hotmail.com','2288010203','Ingeniería de Software'),('S17012935','Acevedo Suárez Josué Armando','josuefresh@hotmail.com','2281407960','Ingeniería de Software'),('S17012993','Olivo Martínez Luis Ángel','luisolivo340@gmail.com','2283139766','Ingeniería de Software');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dependencia`
--

DROP TABLE IF EXISTS `dependencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dependencia` (
  `idDependencia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `direccion` varchar(80) NOT NULL,
  `ciudad` varchar(20) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correoElectronico` varchar(30) NOT NULL,
  PRIMARY KEY (`idDependencia`),
  UNIQUE KEY `idDependencia_UNIQUE` (`idDependencia`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dependencia`
--

LOCK TABLES `dependencia` WRITE;
/*!40000 ALTER TABLE `dependencia` DISABLE KEYS */;
INSERT INTO `dependencia` VALUES (1,'Facultad de Estadística e Informática','Av. Xalapa S/N','Xalapa','Veracruz','2228421700','gcontreras@uv.mx'),(2,'Centro de Investigación en Inteligencia Artificial','Sebastián Camacho No. 5','Xalapa','Veracruz','2281020304','cenia@gmail.com');
/*!40000 ALTER TABLE `dependencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documentoalumno`
--

DROP TABLE IF EXISTS `documentoalumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documentoalumno` (
  `idDocumentoAlumno` int(11) NOT NULL AUTO_INCREMENT,
  `nombreArchivo` varchar(50) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `ruta` varchar(200) NOT NULL,
  `idInscripcion` int(11) NOT NULL,
  PRIMARY KEY (`idDocumentoAlumno`),
  UNIQUE KEY `iddocumentoAlumno_UNIQUE` (`idDocumentoAlumno`),
  KEY `fk_DocumentoAlumno_Inscripcion1_idx` (`idInscripcion`),
  CONSTRAINT `fk_DocumentoAlumno_Inscripcion1` FOREIGN KEY (`idInscripcion`) REFERENCES `inscripcion` (`idInscripcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documentoalumno`
--

LOCK TABLES `documentoalumno` WRITE;
/*!40000 ALTER TABLE `documentoalumno` DISABLE KEYS */;
/*!40000 ALTER TABLE `documentoalumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documentoserviciosocial`
--

DROP TABLE IF EXISTS `documentoserviciosocial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documentoserviciosocial` (
  `idDocumentoServicioSocial` int(11) NOT NULL AUTO_INCREMENT,
  `nombreArchivo` varchar(50) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `ruta` varchar(200) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `idInscripcion` int(11) NOT NULL,
  PRIMARY KEY (`idDocumentoServicioSocial`),
  UNIQUE KEY `idDocumentoServicioSocial_UNIQUE` (`idDocumentoServicioSocial`),
  KEY `fk_DocumentoServicioSocial_Inscripcion1_idx` (`idInscripcion`),
  CONSTRAINT `fk_DocumentoServicioSocial_Inscripcion1` FOREIGN KEY (`idInscripcion`) REFERENCES `inscripcion` (`idInscripcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documentoserviciosocial`
--

LOCK TABLES `documentoserviciosocial` WRITE;
/*!40000 ALTER TABLE `documentoserviciosocial` DISABLE KEYS */;
/*!40000 ALTER TABLE `documentoserviciosocial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experienciaeducativa`
--

DROP TABLE IF EXISTS `experienciaeducativa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experienciaeducativa` (
  `idExperienciaEducativa` int(11) NOT NULL AUTO_INCREMENT,
  `bloque` int(11) NOT NULL,
  `seccion` int(11) NOT NULL,
  `nrc` int(11) NOT NULL,
  `periodo` varchar(11) NOT NULL,
  PRIMARY KEY (`idExperienciaEducativa`),
  UNIQUE KEY `idExperienciaEducativa_UNIQUE` (`idExperienciaEducativa`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experienciaeducativa`
--

LOCK TABLES `experienciaeducativa` WRITE;
/*!40000 ALTER TABLE `experienciaeducativa` DISABLE KEYS */;
INSERT INTO `experienciaeducativa` VALUES (1,8,1,81210,'FEB19-JUL19');
/*!40000 ALTER TABLE `experienciaeducativa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horario` (
  `idHorario` int(11) NOT NULL AUTO_INCREMENT,
  `dia` varchar(9) NOT NULL,
  `horario` varchar(11) NOT NULL,
  `idPlanActividades` int(11) NOT NULL,
  PRIMARY KEY (`idHorario`),
  UNIQUE KEY `idHorario_UNIQUE` (`idHorario`),
  KEY `fk_Horario_PlanActividades1_idx` (`idPlanActividades`),
  CONSTRAINT `fk_Horario_PlanActividades1` FOREIGN KEY (`idPlanActividades`) REFERENCES `planactividades` (`idPlanActividades`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
INSERT INTO `horario` VALUES (1,'Lunes','09:00-13:00',1),(2,'Martes','07:00-11:00',1),(3,'Miércoles','10:00-13:00',1),(4,'Jueves','07:00-11:00',1),(5,'Viernes','07:00-10:00',1),(6,'Sábado','09:00-13:00',1),(7,'Lunes','07:00-11:00',2),(8,'Martes','07:00-11:00',2),(9,'Miércoles','07:00-11:00',2),(10,'Jueves','07:00-11:00',2),(11,'Viernes','07:00-11:00',2);
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripcion`
--

DROP TABLE IF EXISTS `inscripcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inscripcion` (
  `idInscripcion` int(11) NOT NULL AUTO_INCREMENT,
  `numInscripcion` int(11) NOT NULL,
  `estado` varchar(9) NOT NULL,
  `horasRealizado` int(11) NOT NULL,
  `matricula` varchar(9) NOT NULL,
  `idExperienciaEducativa` int(11) NOT NULL,
  `idPlanActividades` int(11) DEFAULT NULL,
  PRIMARY KEY (`idInscripcion`),
  UNIQUE KEY `idInscripcion_UNIQUE` (`idInscripcion`),
  KEY `fk_Alumno_has_ExperienciaEducativa_ExperienciaEducativa1_idx` (`idExperienciaEducativa`),
  KEY `fk_Alumno_has_ExperienciaEducativa_Alumno1_idx` (`matricula`),
  KEY `fkidPlanActividades_idx` (`idPlanActividades`),
  CONSTRAINT `restPlanActividadesInscripcion` FOREIGN KEY (`idPlanActividades`) REFERENCES `planactividades` (`idPlanActividades`),
  CONSTRAINT `fk_Alumno_has_ExperienciaEducativa_Alumno1` FOREIGN KEY (`matricula`) REFERENCES `alumno` (`matricula`),
  CONSTRAINT `fk_Alumno_has_ExperienciaEducativa_ExperienciaEducativa1` FOREIGN KEY (`idExperienciaEducativa`) REFERENCES `experienciaeducativa` (`idExperienciaEducativa`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripcion`
--

LOCK TABLES `inscripcion` WRITE;
/*!40000 ALTER TABLE `inscripcion` DISABLE KEYS */;
INSERT INTO `inscripcion` VALUES (1,1,'En curso',0,'S17012932',1,1),(2,1,'En curso',0,'S17012935',1,2),(3,1,'En curso',0,'S17012993',1,NULL);
/*!40000 ALTER TABLE `inscripcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planactividades`
--

DROP TABLE IF EXISTS `planactividades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `planactividades` (
  `idPlanActividades` int(11) NOT NULL AUTO_INCREMENT,
  `nombreProyecto` varchar(60) NOT NULL,
  `descripcion` varchar(400) NOT NULL,
  `actividades` varchar(300) NOT NULL,
  `idDependencia` int(11) NOT NULL,
  `idResponsableProyecto` int(11) NOT NULL,
  PRIMARY KEY (`idPlanActividades`),
  UNIQUE KEY `idplanActividades_UNIQUE` (`idPlanActividades`),
  KEY `fk_PlanActividades_Dependencia_idx` (`idDependencia`),
  KEY `fk_PlanActividades_ResponsableProyecto1_idx` (`idResponsableProyecto`),
  CONSTRAINT `fk_PlanActividades_Dependencia` FOREIGN KEY (`idDependencia`) REFERENCES `dependencia` (`idDependencia`),
  CONSTRAINT `fk_PlanActividades_ResponsableProyecto1` FOREIGN KEY (`idResponsableProyecto`) REFERENCES `responsableproyecto` (`idResponsableProyecto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planactividades`
--

LOCK TABLES `planactividades` WRITE;
/*!40000 ALTER TABLE `planactividades` DISABLE KEYS */;
INSERT INTO `planactividades` VALUES (1,'Enseñanza de Programación para niños','La enseñanza de la programación fomenta el razonamiento estructural  de la mente y ayuda a ordenar ideas, esto conlleva beneficios a toda persona y aún mas en los niños. ','Desarrollo del programa de capacitación.',1,1),(2,'Traducción de documentos','La tarducción de documentos facilita el aprendizaje de las personas ya que les permite consultar fuentes en otros idiomas.','Desarrollo de software para traducción de documentos.',2,2);
/*!40000 ALTER TABLE `planactividades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reporte`
--

DROP TABLE IF EXISTS `reporte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reporte` (
  `idReporte` int(11) NOT NULL AUTO_INCREMENT,
  `nombreArchivo` varchar(50) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `ruta` varchar(200) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `horasRealizadas` int(11) NOT NULL,
  `mes` varchar(10) NOT NULL,
  `idInscripcion` int(11) NOT NULL,
  PRIMARY KEY (`idReporte`),
  UNIQUE KEY `idReporte_UNIQUE` (`idReporte`),
  KEY `fk_Reporte_Inscripcion1_idx` (`idInscripcion`),
  CONSTRAINT `fk_Reporte_Inscripcion1` FOREIGN KEY (`idInscripcion`) REFERENCES `inscripcion` (`idInscripcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reporte`
--

LOCK TABLES `reporte` WRITE;
/*!40000 ALTER TABLE `reporte` DISABLE KEYS */;
/*!40000 ALTER TABLE `reporte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `responsableproyecto`
--

DROP TABLE IF EXISTS `responsableproyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `responsableproyecto` (
  `idResponsableProyecto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `correoElectronico` varchar(30) NOT NULL,
  PRIMARY KEY (`idResponsableProyecto`),
  UNIQUE KEY `idResponsableProyecto_UNIQUE` (`idResponsableProyecto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `responsableproyecto`
--

LOCK TABLES `responsableproyecto` WRITE;
/*!40000 ALTER TABLE `responsableproyecto` DISABLE KEYS */;
INSERT INTO `responsableproyecto` VALUES (1,'Conteras Vega Gerardo','Coordinador Laboratorio de Redes','gcontreras@uv.mx'),(2,'Acosta Mesa Héctor Gabriel','Responsable Laboratorio IA','hacosta@outlook.com');
/*!40000 ALTER TABLE `responsableproyecto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `usuario` varchar(10) NOT NULL,
  `contrasenia` varchar(15) NOT NULL,
  PRIMARY KEY (`usuario`),
  UNIQUE KEY `usuario_UNIQUE` (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('CO-IS','coordinador'),('TA-IS','auxiliar');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-07 16:05:54
