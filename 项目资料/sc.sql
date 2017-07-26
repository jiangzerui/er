/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50715
 Source Host           : localhost
 Source Database       : sc

 Target Server Type    : MySQL
 Target Server Version : 50715
 File Encoding         : utf-8

 Date: 07/26/2017 14:34:05 PM
*/



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


drop database sc;
create database sc DEFAULT CHARSET utf8;
use sc;

-- ----------------------------
--  Table structure for `fund_project`
-- ----------------------------
DROP TABLE IF EXISTS `fund_project`;
CREATE TABLE `fund_project` (
  `fund_project_id` int(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`fund_project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `fund_project_news`
-- ----------------------------
DROP TABLE IF EXISTS `fund_project_news`;
CREATE TABLE `fund_project_news` (
  `new_id` int(50) NOT NULL AUTO_INCREMENT,
  `fund_project_id` int(20) NOT NULL,
  `content` blob NOT NULL,
  `title` varchar(20) NOT NULL,
  `date` time NOT NULL,
  `writter` varchar(20) NOT NULL,
  PRIMARY KEY (`new_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `guide`
-- ----------------------------
DROP TABLE IF EXISTS `guide`;
CREATE TABLE `guide` (
  `guide_id` int(20) NOT NULL AUTO_INCREMENT,
  `guide_name` varchar(20) NOT NULL,
  `guide_url` varchar(20) NOT NULL,
  `guide_code` varchar(20) NOT NULL,
  PRIMARY KEY (`guide_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` int(50) NOT NULL,
  `menu_name` int(50) NOT NULL,
  `menu_code` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `orgnaization`
-- ----------------------------
DROP TABLE IF EXISTS `orgnaization`;
CREATE TABLE `orgnaization` (
  `orgnaization_id` int(20) NOT NULL AUTO_INCREMENT,
  `orgnaization_name` varchar(20) NOT NULL,
  `orgnaization_code` varchar(20) NOT NULL,
  `orgnaization_type` int(10) NOT NULL,
  PRIMARY KEY (`orgnaization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `project_id` int(50) NOT NULL AUTO_INCREMENT,
  `project_name` varchar(50) NOT NULL,
  `project_code` varchar(50) NOT NULL,
  `description` varchar(100) NOT NULL,
  `project_type` int(10) NOT NULL,
  `guide_code` varchar(20) NOT NULL,
  `project_logo_url` varchar(20) NOT NULL,
  `user_id` int(20) NOT NULL,
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `project_orgnaization`
-- ----------------------------
DROP TABLE IF EXISTS `project_orgnaization`;
CREATE TABLE `project_orgnaization` (
  `project_orgnaization_id` int(20) NOT NULL AUTO_INCREMENT,
  `project_id` int(20) NOT NULL,
  `organization_id` int(20) NOT NULL,
  PRIMARY KEY (`project_orgnaization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(50) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) NOT NULL,
  `role_code` varchar(50) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `role`
-- ----------------------------
BEGIN;
INSERT INTO `role` VALUES ('1', '个人用户', '10001'), ('2', '机构用户', '10002'), ('3', '项目经理', '10003'), ('4', '专家', '10004'), ('5', '管理员', '10005');
COMMIT;

-- ----------------------------
--  Table structure for `role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `role_menu_id` int(50) NOT NULL AUTO_INCREMENT,
  `role_id` int(50) NOT NULL,
  `menu_id` int(50) NOT NULL,
  PRIMARY KEY (`role_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `subject`
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `subject_id` int(50) NOT NULL AUTO_INCREMENT,
  `subject_code` varchar(50) NOT NULL,
  `subject_name` varchar(50) NOT NULL,
  `description` varchar(100) NOT NULL,
  `user_id` int(50) NOT NULL,
  `project_id` int(50) NOT NULL,
  `subject_status_id` int(50) NOT NULL,
  `subject_result_id` int(50) NOT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `subject_professional`
-- ----------------------------
DROP TABLE IF EXISTS `subject_professional`;
CREATE TABLE `subject_professional` (
  `subject_professional_id` int(50) NOT NULL AUTO_INCREMENT,
  `subject_id` int(50) NOT NULL,
  `user_professional_id` int(50) NOT NULL,
  PRIMARY KEY (`subject_professional_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `subject_result`
-- ----------------------------
DROP TABLE IF EXISTS `subject_result`;
CREATE TABLE `subject_result` (
  `subject_result_id` int(50) NOT NULL AUTO_INCREMENT,
  `subject_result_name` varchar(20) NOT NULL,
  `subject-result_url` varchar(20) NOT NULL,
  `subject_result_note` varchar(50) NOT NULL,
  `subject_result_code` varchar(20) NOT NULL,
  PRIMARY KEY (`subject_result_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `subject_status`
-- ----------------------------
DROP TABLE IF EXISTS `subject_status`;
CREATE TABLE `subject_status` (
  `subject_status_id` int(50) NOT NULL AUTO_INCREMENT,
  `subject_status_name` varchar(50) NOT NULL,
  `subject_status_code` varchar(20) NOT NULL,
  PRIMARY KEY (`subject_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(20) NOT NULL,
  `password` varchar(40) NOT NULL,
  `user_code` varchar(50) NOT NULL,
  `email` varchar(40) NOT NULL,
  `name` varchar(20) NOT NULL,
  `ID` varchar(50) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('2', 'geren', '4297f44b13955235245b2497399d7a93', '150104434257992', 'geren@qq.com', '个人测试用户', '412701199010181123');
COMMIT;

-- ----------------------------
--  Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_role_id` int(50) NOT NULL AUTO_INCREMENT,
  `user_code` varchar(50) NOT NULL,
  `role_code` varchar(50) NOT NULL,
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user_role`
-- ----------------------------
BEGIN;
INSERT INTO `user_role` VALUES ('1', '150104434257992', '10001');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
