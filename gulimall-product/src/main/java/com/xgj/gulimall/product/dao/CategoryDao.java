package com.xgj.gulimall.product.dao;

import com.xgj.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:26:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
