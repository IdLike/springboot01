/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-08-07 17:37:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '一班', '张三', '80');
INSERT INTO `student` VALUES ('2', '三班', '李四', '100');
INSERT INTO `student` VALUES ('3', '三班', '李四', '95');
INSERT INTO `student` VALUES ('4', '三班', '李四四', '95');
INSERT INTO `student` VALUES ('5', '三班', '李四四', '95');
INSERT INTO `student` VALUES ('6', '七班', '王二小', '56');
INSERT INTO `student` VALUES ('7', '八班', '王二小', '0');
