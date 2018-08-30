package xin.stxkfzx.cosplayman.mapper;

import xin.stxkfzx.cosplayman.domain.ShopInformationImage;

public interface ShopInformationImageMapper {
    int deleteByPrimaryKey(Integer informationImageId);

    int insert(ShopInformationImage record);

    int insertSelective(ShopInformationImage record);

    ShopInformationImage selectByPrimaryKey(Integer informationImageId);

    int updateByPrimaryKeySelective(ShopInformationImage record);

    int updateByPrimaryKey(ShopInformationImage record);
}