package com.example.gulimall.product.dao;

import com.example.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author nero
 * @email alexandnero0320@gmail.com
 * @date 2021-04-21 15:16:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
