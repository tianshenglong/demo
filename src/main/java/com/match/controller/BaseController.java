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

    @ApiOperation(value = "根据id查询挂单", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "根据id查询挂单")
    @PostMapping
    public void matchDetail(@RequestBody MatchBase matchBase){

    }

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

    @ApiOperation(value = "匹配（卖家匹配、买家匹配）", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "匹配（卖家匹配、买家匹配）")
    @PutMapping
    public void matchMain(@RequestBody MatchBase matchBase){

    }

    @ApiOperation(value = "摘单匹配", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "摘单匹配")
    @PutMapping
    public void selectMatch(@RequestBody MatchBase matchBase){

    }


    @ApiOperation(value = "查询挂单列表，撮合员只看自己管辖的企业，根据状态查询", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "查询挂单列表，撮合员只看自己管辖的企业")
    @PutMapping
    public void baseList(@RequestBody MatchBase matchBase){

    }

    @ApiOperation(value = "撤销、延长、重新发布挂单", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "撤销、延长挂单")
    @PutMapping
    public void cancelOrExtend(@RequestBody MatchBase matchBase){

    }

    @ApiOperation(value = "查询最新挂单", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "查询最新挂单")
    @PutMapping
    public void newMatch(@RequestBody MatchBase matchBase){

    }

    @ApiOperation(value = "行情展示", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "行情展示")
    @PutMapping
    public void showMatchMarket(@RequestBody MatchBase matchBase){

    }


    @ApiOperation(value = "客户名称自动完成功能", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "客户名称自动完成功能")
    @PutMapping
    public void autoEnterpriseName(@RequestBody MatchBase matchBase){

    }



}
