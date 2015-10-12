/*
Navicat MySQL Data Transfer

Source Server         : 本机3306-root
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : smarttrip

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2015-10-12 11:23:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `vistor`
-- ----------------------------
DROP TABLE IF EXISTS `vistor`;
CREATE TABLE `vistor` (
  `vistorId` char(32) NOT NULL,
  `name` varchar(40) NOT NULL COMMENT '用户名（登录使用）',
  `password` char(32) NOT NULL COMMENT '密码',
  `salt` char(32) NOT NULL COMMENT '密码的加盐',
  `realName` varchar(48) DEFAULT NULL COMMENT '真实姓名（可以重复）',
  `realNameSecret` char(1) DEFAULT '0' COMMENT '真实姓名是否保密。0：不保密；1：保密',
  `nickName` varchar(48) DEFAULT NULL COMMENT '昵称（可以重复）',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `emailActivated` char(1) NOT NULL DEFAULT '0' COMMENT '邮箱是否激活。0：未激活；1：激活',
  `mobileNo` char(11) DEFAULT NULL COMMENT '手机号码',
  `registerTime` char(19) NOT NULL COMMENT '注册时间（格式:yyyy:mm:dd HH:mm:ss）',
  `status` char(1) NOT NULL DEFAULT '1' COMMENT '账号状态（0：未激活；1：已激活；2：锁定）',
  `headerLarge` char(32) DEFAULT NULL COMMENT '大头像',
  `headerSmall` char(32) DEFAULT NULL COMMENT '小头像',
  `birthday` char(19) DEFAULT NULL COMMENT '生日（格式:yyyy:mm:dd HH:mm:ss）',
  `birthdaySecret` char(1) NOT NULL DEFAULT '0' COMMENT '生日是否保密。0：不保密；1：保密',
  `gender` char(1) DEFAULT NULL COMMENT '性别。0：女；1：男',
  `profession` varchar(100) DEFAULT NULL COMMENT '工作/职业',
  `education` varchar(30) DEFAULT NULL COMMENT '教育',
  `introduction` varchar(1000) DEFAULT NULL COMMENT '个人简介',
  `website` varchar(200) DEFAULT NULL COMMENT '个人网站',
  PRIMARY KEY (`vistorId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='游客表。用于记录游客的信息。';

-- ----------------------------
-- Records of vistor
-- ----------------------------
