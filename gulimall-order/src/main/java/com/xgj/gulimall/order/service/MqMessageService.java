package com.xgj.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgj.common.utils.PageUtils;
import com.xgj.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:51:36
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

