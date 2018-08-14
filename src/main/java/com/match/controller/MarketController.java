package com.match.controller;

import com.match.model.MatchMarket;
import com.match.model.MatchRecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tianshenglong
 * @Date: 2018/8/13 21:14
 */
@RestController
@Api("挂单基本信息")
@RequestMapping("/v1/markets")
public class MarketController {

    @ApiOperation(value = "佣金统计", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "佣金统计")
    @PutMapping
    public void commission(@RequestBody MatchMarket matchMarket){

    }

    @ApiOperation(value = "佣金导出", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "佣金导出")
    @PutMapping
    public void exportCommission(@RequestBody MatchMarket matchMarket){

    }

    @ApiOperation(value = "设定当日最新成交价", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "设定当日最新成交价")
    @PutMapping
    public void settingNewPrice(@RequestBody MatchMarket matchMarket){

    }
}
