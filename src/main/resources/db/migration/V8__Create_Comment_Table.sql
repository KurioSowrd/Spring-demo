CREATE TABLE Comment
(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Articleid INT NOT NULL,
    type INT NOT NULL,
    commentator INT NOT NULL,
    gmt_create BIGINT NOT NULL,
    gmt_modified BIGINT NOT NULL,
    like_count INT DEFAULT 0,
    discreption VARCHAR(2000)
);
COMMENT ON COLUMN Comment.Articleid IS '文章ID';
COMMENT ON COLUMN Comment.type IS '回复类型';
COMMENT ON COLUMN Comment.commentator IS '回复人ID';
COMMENT ON COLUMN Comment.gmt_create IS '回复时间';
COMMENT ON COLUMN Comment.gmt_modified IS '更新时间';