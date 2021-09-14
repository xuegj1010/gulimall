package com.xgj.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xgj.gulimall.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 *
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:26:43
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCategory(@Param("catId") Long catId, @Param("name") String name);
}
