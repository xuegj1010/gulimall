package com.xgj.gulimall.coupon.dao;

import com.xgj.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:20:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
