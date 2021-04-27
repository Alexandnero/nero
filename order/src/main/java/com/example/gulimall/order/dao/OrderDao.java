package com.example.gulimall.order.dao;

import com.example.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author nero
 * @email alexandnero0320@gmail.com
 * @date 2021-04-23 10:15:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
