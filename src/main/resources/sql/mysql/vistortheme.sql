/*
Navicat MySQL Data Transfer

Source Server         : 本机3306-root
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : smarttrip

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2015-10-12 11:23:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `vistortheme`
-- ----------------------------
DROP TABLE IF EXISTS `vistortheme`;
CREATE TABLE `vistortheme` (
  `id` char(32) NOT NULL COMMENT '主键',
  `vistorId` char(32) NOT NULL COMMENT '游客的ID。关联vistor表。',
  `themeId` char(255) NOT NULL COMMENT '主题的ID。关联theme表。',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='游客（表：vistor）和主题（表：theme）关联表。用于记录游客在游客中心设置的感兴趣的主题。一个游客可能有多个感兴趣的主题。';

-- ----------------------------
-- Records of vistortheme
-- ----------------------------
