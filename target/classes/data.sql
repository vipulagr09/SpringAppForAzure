DROP TABLE IF EXISTS user_info;

CREATE TABLE user_info (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  city VARCHAR(250) DEFAULT NULL
);

INSERT INTO user_info (name, city) VALUES
  ('Vipul',  'Pune'),
  ('Agr',  'Mumbai'),
  ('Rohit', 'JaiPur');