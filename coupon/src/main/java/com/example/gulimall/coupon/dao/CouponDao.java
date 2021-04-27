package com.example.gulimall.coupon.dao;

import com.example.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author nero
 * @email alexandnero0320@gmail.com
 * @date 2021-04-21 18:17:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
