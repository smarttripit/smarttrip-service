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

 Date: 10/18/2015 11:11:22 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `region`
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `regionId` char(32) NOT NULL COMMENT '主键',
  `firstRegion` varchar(50) NOT NULL COMMENT '一级地区分类，比如：北京',
  `secondRegion` varchar(50) NOT NULL COMMENT '二级地区分类，比如：怀柔',
  PRIMARY KEY (`regionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地区表，用于维护城市、区县的关系';

SET FOREIGN_KEY_CHECKS = 1;
