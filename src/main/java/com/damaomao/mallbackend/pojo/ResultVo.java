package com.damaomao.mallbackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *统一响应类
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo {
    // 状态码
    private Integer code;
    // 提示信息
    private String msg;
    // 数据集
    private Object data;

    // 成功
    public static ResultVo success() {
        return  new ResultVo(200, "success",null);
    }

    public static ResultVo success(String msg) {
        return  new ResultVo(200, msg,null);
    }

    public static ResultVo success(Object data) {
        return  new ResultVo(200, "success",data);
    }

    public static ResultVo error() {
        return  new ResultVo(500, "error",null);
    }


    public static ResultVo error(String msg) {
        return  new ResultVo(500, msg,null);
    }


    public static ResultVo error(Object data) {
        return  new ResultVo(500, "error",data);
    }
}
