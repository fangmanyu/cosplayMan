package xin.stxkfzx.cosplayman.mapper;

import org.springframework.stereotype.Repository;
import xin.stxkfzx.cosplayman.domain.Post;

@Repository
public interface PostMapper {
    int deleteByPrimaryKey(Integer postId);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer postId);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}