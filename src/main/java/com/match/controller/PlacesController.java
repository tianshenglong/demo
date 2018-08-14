package com.match.controller;

import com.match.model.MatchCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tianshenglong
 * @Date: 2018/8/13 21:14
 */
@Api("交货地信息")
@RestController
@RequestMapping("/v1/places")
public class PlacesController {

    @ApiOperation(value = "添加交货地信息", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "添加交货地信息")
    @PostMapping
    public void auctionInsert(@RequestBody MatchCategory matchBase){

    }

    @ApiOperation(value = "修改交货地信息", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "修改交货地信息")
    @PutMapping
    public void auctionModify(@RequestBody MatchCategory matchBase){

    }

    @ApiOperation(value = "查看所有交货地信息", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "查看所有交货地信息")
    @PutMapping
    public void auctionSelect(@RequestBody MatchCategory matchBase){

    }

}
