CREATE TABLE information (
  id INT(8) NOT NULL auto_increment,
  title VARCHAR(64) DEFAULT NULL,
  CONTENT varchar(1024) default NULL,
  publish_time timestamp NULL DEFAULT NULL,
  publis_user VARCHAR(32) DEFAULT NULL,
  Type VARCHAR(8) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;