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

 Date: 10/18/2015 11:11:47 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `schedule`
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `scheduleId` char(32) NOT NULL COMMENT '主键',
  `routeId` char(32) NOT NULL COMMENT '经典线路的ID。关联route表。',
  `order` int(11) NOT NULL DEFAULT '0' COMMENT '顺序。顺序号小的排在前面。',
  `type` char(1) NOT NULL COMMENT '类型。1；驾车；2：住宿；3：餐饮；4：景点',
  `name` varchar(50) DEFAULT NULL COMMENT '名称。比如：某个景点的名称是xx村。',
  `summary` varchar(50) DEFAULT NULL COMMENT '简介',
  `description` longtext COMMENT '详情',
  `thumbnail` char(32) DEFAULT NULL COMMENT '缩略图',
  `link` varchar(200) DEFAULT NULL COMMENT '链接。对于景点、住宿、餐饮可能会链接到具体详情页。',
  `direction` char(1) DEFAULT NULL COMMENT '左还是右。0：左；1：右。',
  PRIMARY KEY (`scheduleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='经典线路行程表，用于记录经典线路的行程安排。';

SET FOREIGN_KEY_CHECKS = 1;
