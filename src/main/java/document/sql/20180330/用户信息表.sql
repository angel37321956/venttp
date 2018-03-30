/*
 Navicat Premium Data Transfer

 Source Server         : MySql57
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : venttp

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 30/03/2018 17:56:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for venttp_user_info
-- ----------------------------
DROP TABLE IF EXISTS `venttp_user_info`;
CREATE TABLE `venttp_user_info`  (
  `ID_USER_INFO` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `CREATE_DATE` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `CREATE_BY` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `UPDATE_DATE` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `UPDATE_BY` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '更新人',
  `USER_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `USER_LEVEL` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户等级',
  `USER_IP` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户IP',
  `USER_ACCOUNT` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `USER_PASS_WORD` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `USER_NAME` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `USER_AGE` int(11) NULL DEFAULT NULL COMMENT '用户年龄',
  `PHONE_NUM` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户手机号码',
  `NICK_NAME` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `E_MAIN` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `CHINESE_NAME` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户中文名',
  `ENGLISH_NAME` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户英文名',
  `USER_ADDRESS` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户地址',
  `USER_POSTAL_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户邮编',
  `BIRTHDAY` date NULL DEFAULT NULL COMMENT '出生日期',
  `USER_ID` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户聊天注册服务标记',
  PRIMARY KEY (`ID_USER_INFO`) USING BTREE,
  UNIQUE INDEX `VENTTP_USER_INFO_USER_ACCOUNT_uindex`(`USER_ACCOUNT`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of venttp_user_info
-- ----------------------------
INSERT INTO `venttp_user_info` VALUES (2, '2018-03-30 17:18:04', 'angel373216956', '2018-03-30 17:18:04', 'angel373216956', NULL, NULL, NULL, 'angel373216956', 'angel201314', '奈何桥桥', 99, '110', '桥公子', NULL, '桥公子', 'bridge_Qiao', 'earth', '518000', '1999-09-09', NULL);
INSERT INTO `venttp_user_info` VALUES (8, '2018-03-30 17:22:16', 'Asdasd', '2018-03-30 17:22:16', 'Asdasd', NULL, NULL, NULL, 'Asdasd', '阿萨德撒大撒多付所', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (11, '2018-03-30 17:24:56', 'wrwrwer', '2018-03-30 17:24:56', 'wrwrwer', NULL, NULL, NULL, 'wrwrwer', 'wrwer', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (13, '2018-03-30 17:26:44', 'sfsdfsdsdf', '2018-03-30 17:26:44', 'sfsdfsdsdf', NULL, NULL, NULL, 'sfsdfsdsdf', 'wrwer', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (16, '2018-03-30 17:28:29', 'angel232313535', '2018-03-30 17:28:29', 'angel232313535', NULL, NULL, NULL, 'angel232313535', 'asdasda', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (17, '2018-03-30 17:28:47', 'dsfsdfdsf', '2018-03-30 17:28:47', 'dsfsdfdsf', NULL, NULL, NULL, 'dsfsdfdsf', '312313', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (18, '2018-03-30 17:29:00', 'xcvxcvxv', '2018-03-30 17:29:00', 'xcvxcvxv', NULL, NULL, NULL, 'xcvxcvxv', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (19, '2018-03-30 17:33:42', 'fewfewf', '2018-03-30 17:33:42', 'fewfewf', NULL, NULL, NULL, 'fewfewf', 'wer', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (22, '2018-03-30 17:33:47', 'wewrwr', '2018-03-30 17:33:47', 'wewrwr', NULL, NULL, NULL, 'wewrwr', 'wer', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (23, '2018-03-30 17:33:50', 'sdfdsfdssf', '2018-03-30 17:33:50', 'sdfdsfdssf', NULL, NULL, NULL, 'sdfdsfdssf', 'wer', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (25, '2018-03-30 17:33:56', 'sdfdsfdssfds', '2018-03-30 17:33:56', 'sdfdsfdssfds', NULL, NULL, NULL, 'sdfdsfdssfds', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (26, '2018-03-30 17:34:55', 'dasdasdasdfef', '2018-03-30 17:34:55', 'dasdasdasdfef', NULL, NULL, NULL, 'dasdasdasdfef', 'werwr', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (29, '2018-03-30 17:35:52', 'qewwqe', '2018-03-30 17:35:52', 'qewwqe', NULL, NULL, NULL, 'qewwqe', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (30, '2018-03-30 17:49:10', 'xczxcxvxcv', '2018-03-30 17:49:10', 'xczxcxvxcv', NULL, NULL, NULL, 'xczxcxvxcv', 'nfgnfgnfgn', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (31, '2018-03-30 17:49:24', 'xczxcxvxcvs', '2018-03-30 17:49:24', 'xczxcxvxcvs', NULL, NULL, NULL, 'xczxcxvxcvs', 'nfgnfgnfgn', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `venttp_user_info` VALUES (32, '2018-03-30 17:51:43', '非官方的股份', '2018-03-30 17:51:43', '非官方的股份', NULL, NULL, NULL, '非官方的股份', 'weqwe', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
