package com.xgj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgj.common.utils.PageUtils;
import com.xgj.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:20:09
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

