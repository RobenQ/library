/*
 Navicat Premium Data Transfer

 Source Server         : StuSys
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 24/06/2019 08:28:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `uuid` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '唯一标识符',
  `account` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '姓名',
  `sex` varchar(4) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '性别',
  `id_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '身份证号码',
  `tel` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '联系方式',
  PRIMARY KEY (`uuid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('b95e260566404c2890ac8afda18012a3', 'zq', '491469932371400202444851501080347635418811269436', '周庆', '男', '2455356757', '1232453646');
INSERT INTO `admin` VALUES ('cfa7276a5ff842338b3210a750dbd238', '123', '369590257452814774925548805240102185537183137519', '周庆', '男', '214565475687', '13425346');

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment`  (
  `uuid` varbinary(50) NOT NULL COMMENT '唯一标识符',
  `read_id` varbinary(255) NOT NULL COMMENT '借阅证id',
  `book_uuid` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `appointment_time` date NOT NULL COMMENT '预约时间',
  PRIMARY KEY (`uuid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bollow
-- ----------------------------
DROP TABLE IF EXISTS `bollow`;
CREATE TABLE `bollow`  (
  `uuid` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '唯一标识符',
  `reader_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '借阅者id',
  `book_uuid` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `out_time` date NOT NULL COMMENT '借出时间',
  `should_time` date NOT NULL COMMENT '应该归还时间',
  `fact_time` date NULL DEFAULT NULL COMMENT '实际归还时间',
  `returned` tinyint(1) NOT NULL COMMENT '是否归还',
  PRIMARY KEY (`uuid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bollow
-- ----------------------------
INSERT INTO `bollow` VALUES ('51c5158ccfbf495c8a947d200fd86090', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-19', '2019-05-22', NULL, 1);
INSERT INTO `bollow` VALUES ('79b36c3dc78848fa9b7aa9afff040f86', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-17', '2019-05-20', '2019-05-20', 1);
INSERT INTO `bollow` VALUES ('7f770a59a33c49e091133502021420ca', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-19', '2019-05-22', NULL, 1);
INSERT INTO `bollow` VALUES ('af07bd6fd2544a57b21d1c6a80eb046a', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-19', '2019-05-22', NULL, 1);
INSERT INTO `bollow` VALUES ('b41d28f77c244812b6dd9d52c4bef68c', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-19', '2019-05-22', NULL, 1);
INSERT INTO `bollow` VALUES ('cb2daea740fe416f99c58bbb27fa1a7d', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-19', '2019-05-22', NULL, 1);
INSERT INTO `bollow` VALUES ('cb41f83b66934e6887ed72481c61f03a', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-19', '2019-05-22', NULL, 1);
INSERT INTO `bollow` VALUES ('d6065b413af7400c9f4620076357e5ca', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-19', '2019-05-22', NULL, 0);
INSERT INTO `bollow` VALUES ('e07224c081b34703b9c6e164f54d0633', '172055133', 'df9ef26a6f0346748d62fad324a05809', '2019-05-17', '2019-05-20', '0000-00-00', 1);

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `uuid` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '唯一标识',
  `book_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `book_name` varchar(70) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '书名',
  `author` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '作者',
  `translator` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '译者',
  `publish` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `isbn` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT 'ISBN',
  `price` float(8, 2) NOT NULL COMMENT '价格',
  `book_case` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '所处书架',
  `in_time` date NOT NULL COMMENT '入库时间',
  `page` int(10) NOT NULL COMMENT '总页码',
  `num` int(20) NOT NULL COMMENT '库存',
  PRIMARY KEY (`uuid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('df9ef26a6f0346748d62fad324a05809', '计算机', 'java', '张山', '李四', '无名出版社', '13434536', 69.90, 'B2_3', '2019-05-10', 20, 0);

-- ----------------------------
-- Table structure for book_type
-- ----------------------------
DROP TABLE IF EXISTS `book_type`;
CREATE TABLE `book_type`  (
  `uuid` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '唯一标识符',
  `type_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '类型名称',
  `days` int(10) NOT NULL COMMENT '可借阅天数',
  PRIMARY KEY (`uuid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book_type
-- ----------------------------
INSERT INTO `book_type` VALUES ('343254566', '计算机', 3);
INSERT INTO `book_type` VALUES ('de2e5e5f082e4379be3504909fd087ae', '英语', 3);

-- ----------------------------
-- Table structure for library_msg
-- ----------------------------
DROP TABLE IF EXISTS `library_msg`;
CREATE TABLE `library_msg`  (
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '图书馆名称',
  `tel` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '电话',
  `adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '地址',
  `build_tine` date NOT NULL COMMENT '建立时间',
  `msg` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '简介'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of library_msg
-- ----------------------------
INSERT INTO `library_msg` VALUES ('太原工业学院图书馆', '1454573545', '山西省太原市太原工业学院', '2007-03-15', '你好！');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '唯一标识符',
  `account` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '姓名',
  `sex` varchar(4) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '性别',
  `barcode` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '借阅证编号',
  `read_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '读者类型',
  `tel` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '电话',
  `paper_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证件类型',
  `paper_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '证件号码',
  `in_time` date NOT NULL COMMENT '登记时间',
  `operator` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '操作员',
  `num` int(1) NOT NULL COMMENT '可借阅本数',
  `bollowed` int(1) NOT NULL COMMENT '已借阅本数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('172055133', 'qz', '-122091100080775212138036781670754026774145054599', '张三', '男', '633964f60c704b71b5dcce39b2b7b4a8', '学生', '17362894783', '身份证', '324364757868', '2019-05-12', '赵婉婷', 3, 1);

-- ----------------------------
-- Table structure for user_type
-- ----------------------------
DROP TABLE IF EXISTS `user_type`;
CREATE TABLE `user_type`  (
  `uuid` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '唯一标识符',
  `type_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '类型名称',
  `num` int(1) NOT NULL COMMENT '可借阅本书',
  PRIMARY KEY (`uuid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_type
-- ----------------------------
INSERT INTO `user_type` VALUES ('05e3957e4841483aa9e64d738cde6563', '教师', 5);
INSERT INTO `user_type` VALUES ('465475676', '学生', 3);

SET FOREIGN_KEY_CHECKS = 1;
