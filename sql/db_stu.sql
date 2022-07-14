/*
 Navicat Premium Data Transfer

 Source Server         : Ansen
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           :
 Source Database       : project

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : utf-8

 Date: 07/14/2022 22:22:16 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `db_stu`
-- ----------------------------
DROP TABLE IF EXISTS `db_stu`;
CREATE TABLE `db_stu` (
  `id` varchar(100) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Records of `db_stu`
-- ----------------------------
BEGIN;
INSERT INTO `db_stu` VALUES ('07f433e7-3bd3-406b-a599-f49fddabbf2a', 'Ansen', null), ('08c58537-5dbb-4402-afe7-fde4c6686bcd', 'Ansen', null), ('1001', 'Ansen', '1'), ('505842a1-434e-4c6b-b689-86d17016d637', 'Ansengfdgfd', '1'), ('556079af-98a5-492b-8b6c-6adf75f5bbae', 'imooc1111', '1'), ('615747b0-b7a2-4c56-b059-1a893c2c001b', 'imooc', '1'), ('8d5259db-800a-4891-bed7-19f66adea2c5', 'Ansengfdgfd', '1'), ('c4783ad4-a4af-49d7-b613-835ac1fc0def', 'imooc1111', '1'), ('d1608b16-fd70-4620-ac82-e5d6369329d2', 'Ansen', null), ('dd6628b2-6259-42f5-864b-7ee42cdee3ec', 'Ansen', '1'), ('ec63f40f-c438-4f5f-9cfc-37715fa933ec', 'Ansen', null), ('f1474cb6-1049-4458-951f-b05cb7edcaa9', 'Ansen', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
