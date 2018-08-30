package xin.stxkfzx.cosplayman.domain;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private String commentContent;

    private Integer pageview;

    private Integer likes;

    private Date createTime;

    /** 0 不可用;1 商品;2 文章*/
    private Integer type;

    private Integer belongId;

    private Integer userId;

    private Integer parentId;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getPageview() {
        return pageview;
    }

    public void setPageview(Integer pageview) {
        this.pageview = pageview;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getBelongId() {
        return belongId;
    }

    public void setBelongId(Integer belongId) {
        this.belongId = belongId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", pageview=").append(pageview);
        sb.append(", likes=").append(likes);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append(", belongId=").append(belongId);
        sb.append(", userId=").append(userId);
        sb.append(", parentId=").append(parentId);
        sb.append("]");
        return sb.toString();
    }
}