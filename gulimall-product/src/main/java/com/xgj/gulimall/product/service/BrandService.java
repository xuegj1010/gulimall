package com.xgj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgj.common.utils.PageUtils;
import com.xgj.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:26:43
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

