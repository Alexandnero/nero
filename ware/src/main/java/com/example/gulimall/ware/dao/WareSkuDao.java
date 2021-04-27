package com.example.gulimall.ware.dao;

import com.example.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author nero
 * @email alexandnero0320@gmail.com
 * @date 2021-04-23 10:50:24
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
