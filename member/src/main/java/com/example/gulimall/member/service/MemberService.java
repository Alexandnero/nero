package com.example.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author nero
 * @email alexandnero0320@gmail.com
 * @date 2021-04-21 18:38:05
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

