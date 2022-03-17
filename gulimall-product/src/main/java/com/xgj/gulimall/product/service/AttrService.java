package com.xgj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgj.common.utils.PageUtils;
import com.xgj.gulimall.product.entity.AttrEntity;
import com.xgj.gulimall.product.vo.AttrVo;

import java.util.Map;

/**
 * 商品属性
 *
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:26:43
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId);
}

