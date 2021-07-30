package com.xgj.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgj.common.utils.PageUtils;
import com.xgj.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:30:33
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

