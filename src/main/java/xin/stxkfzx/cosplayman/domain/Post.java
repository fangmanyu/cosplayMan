package xin.stxkfzx.cosplayman.domain;

public class Post {
    private Integer postId;

    private String postTitle;

    private String postContent;

    private String cover;

    private Integer likes;

    private Integer dislikes;

    private Integer userId;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postId=").append(postId);
        sb.append(", postTitle=").append(postTitle);
        sb.append(", postContent=").append(postContent);
        sb.append(", cover=").append(cover);
        sb.append(", likes=").append(likes);
        sb.append(", dislikes=").append(dislikes);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}