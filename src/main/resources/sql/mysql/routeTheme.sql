/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50627
 Source Host           : localhost
 Source Database       : smarttrip

 Target Server Type    : MySQL
 Target Server Version : 50627
 File Encoding         : utf-8

 Date: 10/18/2015 11:11:37 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `routeTheme`
-- ----------------------------
DROP TABLE IF EXISTS `routeTheme`;
CREATE TABLE `routeTheme` (
  `id` char(32) NOT NULL,
  `routeId` char(32) NOT NULL COMMENT '经典线路的ID。关联route表。',
  `themeId` char(32) NOT NULL COMMENT '主题的ID。关联theme表。',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='经典线路（表：route）和主题（表：theme）的关联表，用于表示一个经典线路所属的主题。一个经典线路可能有几个主题。';

SET FOREIGN_KEY_CHECKS = 1;
