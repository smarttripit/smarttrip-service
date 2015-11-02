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

 Date: 10/18/2015 11:11:29 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `route`
-- ----------------------------
DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `routeId` char(32) NOT NULL DEFAULT '' COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '线路名称',
  `feature` varchar(100) DEFAULT NULL COMMENT '特色（线路详情页上部名称后面的一句话）',
  `period` smallint(6) NOT NULL DEFAULT '1' COMMENT '天数',
  `detail` longtext NOT NULL COMMENT '线路详情',
  `map` char(32) DEFAULT NULL COMMENT '线路地图',
  `feeDescription` longtext COMMENT '费用说明',
  `bookingNotice` longtext COMMENT '预订须知',
  `briefRecommendation` varchar(1000) DEFAULT NULL COMMENT '简短的推荐理由（放在首页麻将牌下面）',
  `detailRecommendation` text COMMENT '详细的推荐理由（放在线路详情页上部的图片上）',
  `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论数（冗余设计，其实在评论表中可得）',
  `commetRatio` float NOT NULL DEFAULT '1' COMMENT '好评率（冗余设计，其实在评论表中可得）',
  `purchaseCount` int(11) NOT NULL DEFAULT '0' COMMENT '购买数（冗余设计：在订单表中可得）',
  `regionId` char(32) NOT NULL COMMENT '所属地区（关联地区表：region），比如：北京怀柔',
  `displayOrder` int(11) DEFAULT '0' COMMENT '推荐的经典线路，数值越大越靠前',
  `backgroundImg` char(32) DEFAULT NULL COMMENT '经典线路的背景图片，用于显示在经典线路详情页的顶部',
  `createTime` char(19) NOT NULL COMMENT '线路的创建时间（格式:yyyy:mm:dd HH:mm:ss）',
  `modifyTime` char(19) DEFAULT NULL COMMENT '线路修改时间（格式:yyyy:mm:dd HH:mm:ss）',
  `status` char(1) NOT NULL DEFAULT '1' COMMENT '线路状态。1:正常；2:停用',
  `bottomPrice` char(6) DEFAULT NULL,
  PRIMARY KEY (`routeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='经典线路表';

SET FOREIGN_KEY_CHECKS = 1;
