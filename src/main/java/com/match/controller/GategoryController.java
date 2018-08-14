package com.match.controller;

import com.match.model.MatchBase;
import com.match.model.MatchCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tianshenglong
 * @Date: 2018/8/13 21:14
 */
@Api("挂单产品信息")
@RestController
@RequestMapping("/v1/gategories")
public class GategoryController {

    @ApiOperation(value = "添加挂单产品", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "添加挂单产品")
    @PostMapping
    public void auctionInsert(@RequestBody MatchCategory matchBase){

    }

    @ApiOperation(value = "修改挂单产品", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "修改挂单产品")
    @PutMapping
    public void auctionModify(@RequestBody MatchCategory matchBase){

    }

    @ApiOperation(value = "查看所有挂单产品", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "查看所有挂单产品")
    @PutMapping
    public void auctionSelect(@RequestBody MatchCategory matchBase){

    }

    @ApiOperation(value = "查看所有挂单产品的质量标准", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "查看所有挂单产品的质量标准")
    @PutMapping
    public void auctionSelectStandard(@RequestBody MatchCategory matchBase){

    }
}
