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

 Date: 10/18/2015 11:12:30 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `visitorTheme`
-- ----------------------------
DROP TABLE IF EXISTS `visitorTheme`;
CREATE TABLE `visitorTheme` (
  `id` char(32) NOT NULL COMMENT '主键',
  `visitorId` char(32) NOT NULL COMMENT '游客的ID。关联visitor表。',
  `themeId` char(255) NOT NULL COMMENT '主题的ID。关联theme表。',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='游客（表：vistor）和主题（表：theme）关联表。用于记录游客在游客中心设置的感兴趣的主题。一个游客可能有多个感兴趣的主题。';

SET FOREIGN_KEY_CHECKS = 1;
