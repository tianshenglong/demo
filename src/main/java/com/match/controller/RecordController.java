package com.match.controller;

import com.match.model.MatchBase;
import com.match.model.MatchRecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: tianshenglong
 * @Date: 2018/8/13 21:14
 */
@Api("挂单基本信息")
@RestController
@RequestMapping("/v1/records")
public class RecordController {


    @ApiOperation(value = "查询企业历史订单", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, notes = "查询企业历史订单")
    @PutMapping
    public void baseBuyer(@RequestBody MatchRecord matchRecord){

    }
}
