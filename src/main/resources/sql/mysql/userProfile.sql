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

 Date: 10/18/2015 11:12:17 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `userProfile`
-- ----------------------------
DROP TABLE IF EXISTS `userProfile`;
CREATE TABLE `userProfile` (
  `id` varchar(32) NOT NULL DEFAULT '',
  `userId` varchar(32) DEFAULT NULL COMMENT '关联user表的主键',
  `birthday` varchar(19) DEFAULT NULL COMMENT '生日（格式：yyyy:mm:dd HH:mm:ss）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userId_index` (`userId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
