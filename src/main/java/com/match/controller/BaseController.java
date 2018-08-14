package com.match.controller;

import com.match.model.MatchBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tianshenglong
 * @Date: 2018/8/13 21:12
 */
@Api("挂单基本信息")
@RestController
@RequestMapping("/v1/bases")
public class BaseController {

    @ApiOperation(value = "添加挂单信息", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "添加挂单信息")
    @PostMapping
    public void baseInsert(@RequestBody MatchBase matchBase){

    }

    @ApiOperation(value = "修改挂单信息", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "添加挂单信息")
    @PutMapping
    public void baseModify(@RequestBody MatchBase matchBase){

    }

    @ApiOperation(value = "查询买家挂单，价格倒叙排序", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "添加挂单信息")
    @PutMapping
    public void baseBuyer(@RequestBody MatchBase matchBase){

    }


    @ApiOperation(value = "查询卖家挂单，价格正序排序", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "添加挂单信息")
    @PutMapping
    public void baseSeller(@RequestBody MatchBase matchBase){

    }


    @ApiOperation(value = "查询挂单列表，撮合员只看自己管辖的企业，根据状态查询", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "查询挂单列表，撮合员只看自己管辖的企业")
    @PutMapping
    public void baseList(@RequestBody MatchBase matchBase){

    }



}
