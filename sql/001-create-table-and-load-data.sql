DROP TABLE IF EXISTS boxers;

CREATE TABLE boxers (
  id INT unsigned AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL,
  age INT NOT NULL,
  gym_name VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO boxers (name, age, gym_name) VALUES ("幕之内一歩", 25, "鴨川ボクシングジム");
INSERT INTO boxers (name, age, gym_name) VALUES ("宮田一郎", 25, "河原ボクシングジム");
INSERT INTO boxers (name, age, gym_name) VALUES ("千堂武士", 26, "なにわ拳闘会");
INSERT INTO boxers (name, age, gym_name) VALUES ("鷹村守", 29, "鴨川ボクシングジム");
