package xin.stxkfzx.cosplayman.mapper;

import org.springframework.stereotype.Repository;
import xin.stxkfzx.cosplayman.domain.ShopInformation;

@Repository
public interface ShopInformationMapper {
    int deleteByPrimaryKey(Integer informationId);

    int insert(ShopInformation record);

    int insertSelective(ShopInformation record);

    ShopInformation selectByPrimaryKey(Integer informationId);

    int updateByPrimaryKeySelective(ShopInformation record);

    int updateByPrimaryKey(ShopInformation record);
}