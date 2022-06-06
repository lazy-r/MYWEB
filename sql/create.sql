-- ----------------------------
-- Database structure for myweb
-- ----------------------------
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP DATABASE IF EXISTS `myweb`;
CREATE DATABASE `myweb`;
USE myweb;

-- ----------------------------
-- Table structure for related_words
-- ----------------------------
DROP TABLE IF EXISTS `related_words`;
CREATE TABLE `related_words` (
                                 `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                 `words` varbinary(255) NOT NULL,
                                 `search_count` int(10) unsigned DEFAULT '0',
                                 `is_user_defined` tinyint(4) NOT NULL DEFAULT '0',
                                 `is_deleted` tinyint(4) NOT NULL DEFAULT '0',
                                 PRIMARY KEY (`id`) USING BTREE,
                                 UNIQUE KEY `words` (`words`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1174 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;



-- ----------------------------
-- Table structure for word
-- ----------------------------
DROP TABLE IF EXISTS `word`;
CREATE TABLE `word` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `word` varbinary(255) NOT NULL,
                        `translation` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                        `search_count` int(11) DEFAULT '0',
                        `recent_time_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                        PRIMARY KEY (`id`) USING BTREE,
                        UNIQUE KEY `word` (`word`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2606 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
