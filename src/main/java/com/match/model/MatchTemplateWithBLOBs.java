package com.match.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

public class MatchTemplateWithBLOBs extends MatchTemplate {

    @ApiModelProperty(value="产品名称",name="goodName")
    private byte[] goodName;

    @ApiModelProperty(value="原产地",name="originPlace")
    private byte[] originPlace;

    @ApiModelProperty(value="质量标准",name="goodStand")
    private byte[] goodStand;

    @ApiModelProperty(value="交货地",name="place")
    private byte[] place;

    @ApiModelProperty(value="库区",name="warehouse")
    private byte[] warehouse;

    @ApiModelProperty(value="创建者",name="creator")
    private byte[] creator;

    /**
     * 获取 产品名称 字段:match_template.good_name
     *
     * @return match_template.good_name, 产品名称
     */
    public byte[] getGoodName() {
        return goodName;
    }

    /**
     * 设置 产品名称 字段:match_template.good_name
     *
     * @param goodName the value for match_template.good_name, 产品名称
     */
    public void setGoodName(byte[] goodName) {
        this.goodName = goodName;
    }

    /**
     * 获取 原产地 字段:match_template.origin_place
     *
     * @return match_template.origin_place, 原产地
     */
    public byte[] getOriginPlace() {
        return originPlace;
    }

    /**
     * 设置 原产地 字段:match_template.origin_place
     *
     * @param originPlace the value for match_template.origin_place, 原产地
     */
    public void setOriginPlace(byte[] originPlace) {
        this.originPlace = originPlace;
    }

    /**
     * 获取 质量标准 字段:match_template.good_stand
     *
     * @return match_template.good_stand, 质量标准
     */
    public byte[] getGoodStand() {
        return goodStand;
    }

    /**
     * 设置 质量标准 字段:match_template.good_stand
     *
     * @param goodStand the value for match_template.good_stand, 质量标准
     */
    public void setGoodStand(byte[] goodStand) {
        this.goodStand = goodStand;
    }

    /**
     * 获取 交货地 字段:match_template.place
     *
     * @return match_template.place, 交货地
     */
    public byte[] getPlace() {
        return place;
    }

    /**
     * 设置 交货地 字段:match_template.place
     *
     * @param place the value for match_template.place, 交货地
     */
    public void setPlace(byte[] place) {
        this.place = place;
    }

    /**
     * 获取 库区 字段:match_template.warehouse
     *
     * @return match_template.warehouse, 库区
     */
    public byte[] getWarehouse() {
        return warehouse;
    }

    /**
     * 设置 库区 字段:match_template.warehouse
     *
     * @param warehouse the value for match_template.warehouse, 库区
     */
    public void setWarehouse(byte[] warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * 获取 创建者 字段:match_template.creator
     *
     * @return match_template.creator, 创建者
     */
    public byte[] getCreator() {
        return creator;
    }

    /**
     * 设置 创建者 字段:match_template.creator
     *
     * @param creator the value for match_template.creator, 创建者
     */
    public void setCreator(byte[] creator) {
        this.creator = creator;
    }
}