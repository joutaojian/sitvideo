/*
Navicat MySQL Data Transfer

Source Server         : MySQL 5.6
Source Server Version : 50629
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2016-03-14 18:01:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_admin`
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('1', '管理员A', 'admin', 'a@qq.com', '1380038000', '2016-03-10 10:16:13');

-- ----------------------------
-- Table structure for `t_level`
-- ----------------------------
DROP TABLE IF EXISTS `t_level`;
CREATE TABLE `t_level` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_level
-- ----------------------------
INSERT INTO `t_level` VALUES ('1', '面向对象', '1');
INSERT INTO `t_level` VALUES ('2', '基本语法', '1');
INSERT INTO `t_level` VALUES ('3', '集合', '1');
INSERT INTO `t_level` VALUES ('4', '多线程', '1');
INSERT INTO `t_level` VALUES ('5', '网络编程', '1');
INSERT INTO `t_level` VALUES ('6', '数据结构', '2');
INSERT INTO `t_level` VALUES ('7', '算法设计', '2');
INSERT INTO `t_level` VALUES ('8', '设计模式', '2');
INSERT INTO `t_level` VALUES ('9', '数据库', '3');
INSERT INTO `t_level` VALUES ('10', '计算机网络', '3');
INSERT INTO `t_level` VALUES ('11', '操作系统', '3');
INSERT INTO `t_level` VALUES ('12', 'Servlet/JSP', '4');
INSERT INTO `t_level` VALUES ('13', '框架', '4');
INSERT INTO `t_level` VALUES ('14', 'Linux', '4');
INSERT INTO `t_level` VALUES ('15', '前端技术', '4');

-- ----------------------------
-- Table structure for `t_mes`
-- ----------------------------
DROP TABLE IF EXISTS `t_mes`;
CREATE TABLE `t_mes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mes_user` (`user_id`),
  CONSTRAINT `mes_user` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_mes
-- ----------------------------

-- ----------------------------
-- Table structure for `t_mov`
-- ----------------------------
DROP TABLE IF EXISTS `t_mov`;
CREATE TABLE `t_mov` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `desc` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `mov_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `img_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `res_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `level_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mov_level` (`level_id`),
  KEY `mov_user` (`user_id`),
  CONSTRAINT `mov_level` FOREIGN KEY (`level_id`) REFERENCES `t_level` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mov_user` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_mov
-- ----------------------------

-- ----------------------------
-- Table structure for `t_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_record`;
CREATE TABLE `t_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `user_id` int(11) DEFAULT NULL,
  `mov_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `record_user` (`user_id`),
  KEY `record_mov` (`mov_id`),
  CONSTRAINT `record_mov` FOREIGN KEY (`mov_id`) REFERENCES `t_mov` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `record_user` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_record
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `level_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_level` (`level_id`),
  CONSTRAINT `user_level` FOREIGN KEY (`level_id`) REFERENCES `t_level` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '周韬健', 'admin', 'admin@qq.com', '2147483647', '2016-03-10 17:07:12', '4');
INSERT INTO `t_user` VALUES ('2', '张三', null, '123456@qq.com', '2147483647', '2016-03-09 18:23:01', '2');
INSERT INTO `t_user` VALUES ('3', '李四', null, '123456789@163.com', '1324567897', '2016-03-09 19:07:28', '2');
