package com.match.controller;

import com.match.model.MatchMarket;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tianshenglong
 * @Date: 2018/8/14 11:12
 */

@RestController
@Api("客户管理")
@RequestMapping("/v1/customs")
public class CustomController {

    @ApiOperation(value = "撮合员客户管理", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "客户管理")
    @PutMapping
    public void customList(@RequestBody MatchMarket matchMarket){

    }

    @ApiOperation(value = "添加客户", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "添加客户")
    @PutMapping
    public void customInsert(@RequestBody MatchMarket matchMarket){

    }

    @ApiOperation(value = "修改客户", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "修改客户")
    @PutMapping
    public void customModify(@RequestBody MatchMarket matchMarket){

    }

    @ApiOperation(value = "撮合管理员客户管理", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "撮合管理员客户管理")
    @PutMapping
    public void customAdminList(@RequestBody MatchMarket matchMarket){

    }

    @ApiOperation(value = "给企业制定撮合员", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "给企业制定撮合员")
    @PutMapping
    public void settingMatcherForEnterprise(@RequestBody MatchMarket matchMarket){

    }

    @ApiOperation(value = "给企业解绑撮合员", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "给企业解绑撮合员")
    @PutMapping
    public void cancelMatcherForEnterprise(@RequestBody MatchMarket matchMarket){

    }

}
