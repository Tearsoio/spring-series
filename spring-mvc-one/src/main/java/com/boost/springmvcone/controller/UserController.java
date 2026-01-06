package com.boost.springmvcone.controller;

import com.boost.springmvcone.vo.UserVo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiao yiju
 * @date: 2026-01-06 16:11
 * @description: 用户控制层
 */

@RestController
@RequestMapping("/users")
public class UserController {


    /**
     * 返回用户列表
     *
     * @return
     */
    @GetMapping("/list")
    public List<UserVo> listUser() {
        List<UserVo> userVoList = new ArrayList<>();
        userVoList.add(UserVo.builder().name("jack").age(19).address("shenzhen").build());
        userVoList.add(UserVo.builder().name("tom").age(19).address("beijing").build());
        userVoList.add(UserVo.builder().name("liming").age(19).address("nanchang").build());
        return userVoList;
    }


    /**
     * 查询指定id用户
     * 这里可以换成 @GetMapping("/get/{id}") public UserVo getUser(@PathVariable("id")Long id) {xxx} 但是会影响mvc一定性能
     *
     * @return
     */
    @GetMapping("/get")
    public UserVo getUser(@RequestParam("id") Long id) {
        return UserVo.builder().name("jack").age(19).address("shenzhen").build();
    }


    /**
     * 添加用户
     *
     * @param userVo
     * @return
     */
    @PostMapping("/add")
    public UserVo addUser(@RequestBody UserVo userVo) {
        return userVo;
    }


    /**
     *DeleteMapping方法也可以使用路径参数，但是为了提升性能一般不用
     * @param id
     * @return
     */
    @DeleteMapping("/del")
    public Boolean deleteUser(@RequestParam("id") Long id) {
        return true;
    }
}
