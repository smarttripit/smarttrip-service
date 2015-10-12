/*
Navicat MySQL Data Transfer

Source Server         : 本机3306-root
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : smarttrip

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2015-10-12 11:21:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `commentId` char(32) NOT NULL COMMENT '主键',
  `type` char(2) NOT NULL DEFAULT '01' COMMENT '类型。标识评论是针对经典路线、度假民宿还是发现XX。01：经典线路；02：度假民宿；03：发现XX',
  `productId` char(32) NOT NULL COMMENT '根据type的不同，关联的表不同。type为01的时候关联route表。',
  `content` varchar(1000) NOT NULL,
  `score` tinyint(4) NOT NULL DEFAULT '5' COMMENT '评分。5分是满分',
  `commentTime` char(19) NOT NULL COMMENT '评论时间（格式:yyyy:mm:dd HH:mm:ss）',
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('2314', '01', '', '', '5', '');
