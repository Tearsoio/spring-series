package com.boost.springmvcone.vo;

import lombok.Builder;
import lombok.Getter;

/**
 * @author: xiao yiju
 * @date: 2026-01-06 16:12
 * @description: 类的描述
 */

@Getter
@Builder
public class UserVo {

    private String name;

    private Integer age;

    private String address;
}
