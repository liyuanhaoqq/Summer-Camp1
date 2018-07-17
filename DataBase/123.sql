/*
Navicat MySQL Data Transfer

Source Server         : 234
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : 123

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2018-07-17 16:54:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `data`
-- ----------------------------
DROP TABLE IF EXISTS `data`;
CREATE TABLE `data` (
  `id` int(10) NOT NULL,
  `question` varchar(256) NOT NULL,
  `opt1` varchar(256) NOT NULL,
  `opt2` varchar(256) NOT NULL,
  `opt3` varchar(256) NOT NULL,
  `opt4` varchar(256) NOT NULL,
  `answer` varchar(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of data
-- ----------------------------
INSERT INTO `data` VALUES ('1', '—Hey， look where you are going! —Oh，I\'m terribly sorry.______.（1999全国卷）', 'A.I\'m not noticing ', 'B.I wasn\'t noticing ', 'C.I haven\'t noticed ', 'D.I don\'t notice', 'B');
INSERT INTO `data` VALUES ('2', ' What _____ your grandfather _____ this time yesterday?', 'A. is ... doing', 'B. was ... doing', 'C.have ... doing', 'D. had ... done ', 'B');
INSERT INTO `data` VALUES ('3', ' ____ you ______ a meeting at four yesterday afternoon? ', 'A. Were ... having ', 'B. Was ... having ', 'C. Did ... have ', 'D. Do ... have ', 'A');
INSERT INTO `data` VALUES ('4', ' A: I called you at about half past eight last night , but nobody answered. B: Oh , I ______ in my office at that time', 'A. will work', 'B. was working ', 'C. worked ', 'D. had worked', 'B');
INSERT INTO `data` VALUES ('5', ' His family _____ TV from ten to twelve last night.', 'A. watched ', 'B. were watching ', 'C. had watched ', 'D. was watching ', 'B');
INSERT INTO `data` VALUES ('6', 'Li Lei ______ a letter to his friend last night.', 'A. was writing ', 'B. was written ', 'C. will write ', 'D. writes', 'A');
INSERT INTO `data` VALUES ('7', 'A: Hi , Lin Tao . I didn\'t see you at the party. B: Oh, I ________ ready for the maths exam. ', 'A. am getting ', 'B. was getting ', 'C. got ', 'D. have got ', 'B');
INSERT INTO `data` VALUES ('8', 'A: I called you yesterday evening ,but there was no answer. B: Oh ,I am sorry I dinner at my friend’s home.', 'A．have ', 'B．had', 'C．was having', 'D．have had ', 'C');
INSERT INTO `data` VALUES ('9', ' What _____ your grandfather _____ this time yesterday? ', 'A. is ... doing', 'B. was ... doing ', 'C. did .. do ', 'D. had ... done ', 'B');
INSERT INTO `data` VALUES ('10', '____ you ______ a meeting at four yesterday afternoon? ', 'A. Were ... having ', 'B. Was ... having ', 'C. Did ... have ', 'D. Do ... have', 'A');
INSERT INTO `data` VALUES ('11', ' A: I called you at about half past eight last night , but nobody answered. B: Oh , I ______ in my office at that time. ', 'A. will work ', 'B. was working ', 'C. worked ', 'D. had worked ', 'B');
INSERT INTO `data` VALUES ('12', ' His family _____ TV from ten to twelve last night. ', 'A. watched ', 'B. were watching ', 'C. had watched', 'D. was watching ', 'B');
INSERT INTO `data` VALUES ('13', ' Li Lei ______ a letter to his friend last night.', 'A. was writing ', 'B. was written ', 'C. written ', 'D. writes ', 'A');
INSERT INTO `data` VALUES ('14', 'A: Hi , Lin Tao . I didn\'t see you at the party. B: Oh, I ________ ready for the maths exam. ', 'A. am getting ', 'B. was getting ', 'C. got ', 'D. have got ', 'B');
INSERT INTO `data` VALUES ('15', ' A: I called you yesterday evening ,but there was no answer. B: Oh ,I am sorry I dinner at my friend\'s home.', 'A．have', 'B．had ', 'C．was having ', 'D．have had ', 'C');
INSERT INTO `data` VALUES ('16', '-----He must be busy doing his homework right now. ----I imagine____. ', 'A. that ', 'B. to', 'C. so ', 'D. it ', 'C');
INSERT INTO `data` VALUES ('17', ' Mary had promised to give me a ticket for tomorrow. She failed, ____. ', 'A. either ', 'B. though ', 'C. but', 'D. too', 'B');
INSERT INTO `data` VALUES ('18', 'When I got to the cinema, the film _____ for five minutes.', 'A. had begun', 'B. has been on', 'C. has begun ', 'D. had been on ', 'D');

-- ----------------------------
-- Table structure for `person_rank`
-- ----------------------------
DROP TABLE IF EXISTS `person_rank`;
CREATE TABLE `person_rank` (
  `name` varchar(256) DEFAULT NULL,
  `score` int(3) DEFAULT NULL,
  `rank` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person_rank
-- ----------------------------
INSERT INTO `person_rank` VALUES ('sfdfsd', '1', '2');
INSERT INTO `person_rank` VALUES ('sfdfsd', '1', '2');

-- ----------------------------
-- Table structure for `st`
-- ----------------------------
DROP TABLE IF EXISTS `st`;
CREATE TABLE `st` (
  `c` varchar(255) DEFAULT NULL,
  `b` varchar(255) DEFAULT NULL,
  `a` varchar(211) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st
-- ----------------------------
INSERT INTO `st` VALUES ('ewed', 'wedsxz', 'wdsxz');
INSERT INTO `st` VALUES ('wdcsx', 'wfdscx', 'fdwscx');
INSERT INTO `st` VALUES ('efdvc', 'rfvdc', 'rgfevc');
INSERT INTO `st` VALUES ('dsfeds', 'wdsxc', 'wr3wefsdxc');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `dept` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('23', 'reds', '23', '*****', '******');
INSERT INTO `student` VALUES ('233', 'qwsa', '12', '*****', '*****');
INSERT INTO `student` VALUES ('234534', '3443', '34', '******', '*******');
INSERT INTO `student` VALUES ('1123445', 'sxc', '23', '*******', '*******');
INSERT INTO `student` VALUES ('1705050101', '张三', '23', '*****', '*****');
INSERT INTO `student` VALUES ('1705050102', '李四', '35', '*******', '******');
INSERT INTO `student` VALUES ('1705050103', '王五', '24', '*******', '*****');
INSERT INTO `student` VALUES ('1705050104', '赵六', '33', '**********', '*******');
