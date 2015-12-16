CREATE TABLE diary (
  id INT(8) NOT NULL auto_increment,
  title VARCHAR(64) NOT NULL DEFAULT 'diary',
  content text NOT NULL,
  authorname VARCHAR(32) NOT NULL DEFAULT '',
  time datetime NOT NULL default '0000-00-00 00:00:00',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=REDUNDANT;