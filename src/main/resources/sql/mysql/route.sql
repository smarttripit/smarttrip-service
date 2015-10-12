/*
Navicat MySQL Data Transfer

Source Server         : 本机3306-root
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : smarttrip

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2015-10-12 11:22:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `route`
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
  `detailRecommondation` text COMMENT '详细的推荐理由（放在线路详情页上部的图片上）',
  `commentCount` int(11) NOT NULL DEFAULT '0' COMMENT '评论数（冗余设计，其实在评论表中可得）',
  `commetRatio` float NOT NULL DEFAULT '1' COMMENT '好评率（冗余设计，其实在评论表中可得）',
  `purchaseCount` int(11) NOT NULL DEFAULT '0' COMMENT '购买数（冗余设计：在订单表中可得）',
  `regionId` char(32) NOT NULL COMMENT '所属地区（关联地区表：region），比如：北京怀柔',
  PRIMARY KEY (`routeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='经典线路表';

-- ----------------------------
-- Records of route
-- ----------------------------
