package xin.stxkfzx.cosplayman.mapper;

import org.springframework.stereotype.Repository;
import xin.stxkfzx.cosplayman.domain.Comment;

@Repository
public interface CommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}