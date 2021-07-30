package com.xgj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgj.common.utils.PageUtils;
import com.xgj.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:26:42
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

