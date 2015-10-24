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

 Date: 10/18/2015 11:08:21 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `commentId` char(32) NOT NULL COMMENT '主键',
  `productType` char(2) NOT NULL DEFAULT '01' COMMENT '类型。标识评论是针对经典路线、度假民宿还是发现XX。01：经典线路；02：度假民宿；03：发现XX',
  `productId` char(32) NOT NULL COMMENT '根据type的不同，关联的表不同。type为01的时候关联route表。',
  `content` varchar(1000) NOT NULL,
  `score` tinyint(4) NOT NULL DEFAULT '5' COMMENT '评分。5分是满分',
  `commentTime` char(19) NOT NULL COMMENT '评论时间（格式:yyyy:mm:dd HH:mm:ss）',
  `visitorId` char(32) NOT NULL COMMENT '游客的id。关联visitor表。',
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
