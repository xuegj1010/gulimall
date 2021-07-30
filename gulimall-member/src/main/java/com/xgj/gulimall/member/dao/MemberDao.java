package com.xgj.gulimall.member.dao;

import com.xgj.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xgj
 * @email xuegj@gmail.com
 * @date 2021-07-30 22:30:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
