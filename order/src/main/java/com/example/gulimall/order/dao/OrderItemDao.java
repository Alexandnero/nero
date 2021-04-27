package com.example.gulimall.order.dao;

import com.example.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author nero
 * @email alexandnero0320@gmail.com
 * @date 2021-04-23 10:15:51
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
