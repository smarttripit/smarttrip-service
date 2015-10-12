/*
Navicat MySQL Data Transfer

Source Server         : 本机3306-root
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : smarttrip

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2015-10-12 11:22:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `region`
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `regionId` char(32) NOT NULL COMMENT '主键',
  `firstRegion` varchar(50) NOT NULL COMMENT '一级地区分类，比如：北京',
  `secondRegion` varchar(50) NOT NULL COMMENT '二级地区分类，比如：怀柔',
  PRIMARY KEY (`regionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地区表，用于维护城市、区县的关系';

-- ----------------------------
-- Records of region
-- ----------------------------
