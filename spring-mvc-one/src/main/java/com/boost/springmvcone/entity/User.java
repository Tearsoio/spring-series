package com.boost.springmvcone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: xiao yiju
 * @date: 2026-01-06 16:14
 * @description: 用户实体
 */
@Data
@AllArgsConstructor
public class User {

    private String name;

    private Integer age;

    private String address;
}
