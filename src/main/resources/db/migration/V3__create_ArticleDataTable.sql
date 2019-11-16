CREATE TABLE Article
(
     ID  INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    tittle VARCHAR(50),
    discription TEXT,
    gmt_create BIGINT,
    gmt_modified BIGINT,
    creator INT,
    comment_count INT,
    view_count INT,
    like_count INT,
    tag TEXT
);