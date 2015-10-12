/*
Navicat MySQL Data Transfer

Source Server         : 本机3306-root
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : smarttrip

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2015-10-12 11:23:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `schedule`
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `scheduleId` char(32) NOT NULL COMMENT '主键',
  `routeId` char(32) NOT NULL COMMENT '经典线路的ID。关联route表。',
  `order` int(11) NOT NULL DEFAULT '0' COMMENT '顺序。顺序号小的排在前面。',
  `type` char(1) NOT NULL COMMENT '类型。1；驾车；2：住宿；3：餐饮；4：景点',
  `name` varchar(50) DEFAULT NULL COMMENT '名称。比如：某个景点的名称是xx村。',
  `abstract` varchar(50) DEFAULT NULL COMMENT '简介',
  `description` longtext COMMENT '详情',
  `thumbnail` char(32) DEFAULT NULL COMMENT '缩略图',
  `link` varchar(200) DEFAULT NULL COMMENT '链接。对于景点、住宿、餐饮可能会链接到具体详情页。',
  `direction` char(1) DEFAULT NULL COMMENT '左还是右。0：左；1：右。',
  PRIMARY KEY (`scheduleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='经典线路行程表，用于记录经典线路的行程安排。';

-- ----------------------------
-- Records of schedule
-- ----------------------------
