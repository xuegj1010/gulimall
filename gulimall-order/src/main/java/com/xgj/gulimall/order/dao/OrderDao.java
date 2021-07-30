package com.xgj.gulimall.order.dao;

import com.xgj.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:51:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
