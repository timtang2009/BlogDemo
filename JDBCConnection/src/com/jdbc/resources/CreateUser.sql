CREATE TABLE users (
  id INT(8) NOT NULL auto_increment,
  username VARCHAR(32) NOT NULL,
  password VARCHAR(32) character set utf8 DEFAULT NULL,
  real_name VARCHAR(32) character set utf8 DEFAULT NULL,
  gender VARCHAR(2) character set utf8 DEFAULT NULL,
  age INT(8) DEFAULT NULL,
  Personal_signature VARCHAR(1024) character set utf8 DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;