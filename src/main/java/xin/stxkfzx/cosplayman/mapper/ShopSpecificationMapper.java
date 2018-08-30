package xin.stxkfzx.cosplayman.mapper;

import org.springframework.stereotype.Repository;
import xin.stxkfzx.cosplayman.domain.ShopSpecification;

@Repository
public interface ShopSpecificationMapper {
    int deleteByPrimaryKey(Integer specificationId);

    int insert(ShopSpecification record);

    int insertSelective(ShopSpecification record);

    ShopSpecification selectByPrimaryKey(Integer specificationId);

    int updateByPrimaryKeySelective(ShopSpecification record);

    int updateByPrimaryKey(ShopSpecification record);
}