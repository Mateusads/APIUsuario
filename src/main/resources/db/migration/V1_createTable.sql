CREATE TABLE user_management(
id BIGINT  GENERATED BY DEFAULT AS IDENTITY,
NAME VARCHAR(255),
EMAIL VARCHAR(255),
AGE INTEGER,
PRIMARY KEY (id)
);