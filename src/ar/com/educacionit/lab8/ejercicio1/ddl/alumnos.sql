CREATE DATABASE `j2se`;
DROP TABLE IF EXISTS `j2se`.`alumnos`;
CREATE TABLE  `j2se`.`alumnos` (
  `alu_id` int(10) unsigned NOT NULL auto_increment,
  `alu_nombre` varchar(255) NOT NULL default '',
  `alu_apellido` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`alu_id`)
) TYPE=MyISAM;