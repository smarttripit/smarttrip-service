/*
Navicat MySQL Data Transfer

Source Server         : 本机3306-root
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : smarttrip

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2015-10-12 11:22:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `routetheme`
-- ----------------------------
DROP TABLE IF EXISTS `routetheme`;
CREATE TABLE `routetheme` (
  `id` char(32) NOT NULL,
  `routeId` char(32) NOT NULL COMMENT '经典线路的ID。关联route表。',
  `themeId` char(32) NOT NULL COMMENT '主题的ID。关联theme表。',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='经典线路（表：route）和主题（表：theme）的关联表，用于表示一个经典线路所属的主题。一个经典线路可能有几个主题。';

-- ----------------------------
-- Records of routetheme
-- ----------------------------
