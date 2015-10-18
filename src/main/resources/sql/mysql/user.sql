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

 Date: 10/18/2015 11:12:05 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL COMMENT '用户ID',
  `name` varchar(40) NOT NULL COMMENT '用户名（登录使用）',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `salt` varchar(32) NOT NULL COMMENT '密码的加盐',
  `realName` varchar(48) DEFAULT NULL COMMENT '真实姓名（可以重复）',
  `nickName` varchar(48) DEFAULT NULL COMMENT '昵称（可以重复）',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `mobileNo` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `registerTime` varchar(19) NOT NULL COMMENT '注册时间（格式:yyyy:mm:dd HH:mm:ss）',
  `status` varchar(1) NOT NULL DEFAULT '1' COMMENT '账号状态（0：未激活；1：已激活；2：锁定）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_index` (`name`) USING BTREE,
  KEY `mobileNo_index` (`mobileNo`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='此表主要用于记录用户的登录注册信息。其他一些信息，比如：生日、学历、家庭住址等在另外的表中记录。';

SET FOREIGN_KEY_CHECKS = 1;
