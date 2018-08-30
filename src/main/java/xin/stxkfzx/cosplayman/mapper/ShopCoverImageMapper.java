package xin.stxkfzx.cosplayman.mapper;

import org.springframework.stereotype.Repository;
import xin.stxkfzx.cosplayman.domain.ShopCoverImage;

@Repository
public interface ShopCoverImageMapper {
    int deleteByPrimaryKey(Integer coverImageId);

    int insert(ShopCoverImage record);

    int insertSelective(ShopCoverImage record);

    ShopCoverImage selectByPrimaryKey(Integer coverImageId);

    int updateByPrimaryKeySelective(ShopCoverImage record);

    int updateByPrimaryKey(ShopCoverImage record);
}