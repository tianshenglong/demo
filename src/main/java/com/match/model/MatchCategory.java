package com.match.model;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="",description="数据库表：match_category")
public class MatchCategory {

    @ApiModelProperty(value="",name="goodId", required=true)
    @NotEmpty
    private Integer goodId;

    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;

    @ApiModelProperty(value="是否启用【1.启用 0.停用】",name="enabled")
    private Short enabled;

    @ApiModelProperty(value="名称",name="goodName")
    private byte[] goodName;

    /**
     * 获取  字段:match_category.good_id
     *
     * @return match_category.good_id, 
     */
    public Integer getGoodId() {
        return goodId;
    }

    /**
     * 设置  字段:match_category.good_id
     *
     * @param goodId the value for match_category.good_id, 
     */
    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    /**
     * 获取 创建时间 字段:match_category.create_time
     *
     * @return match_category.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:match_category.create_time
     *
     * @param createTime the value for match_category.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 是否启用【1.启用 0.停用】 字段:match_category.enabled
     *
     * @return match_category.enabled, 是否启用【1.启用 0.停用】
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 设置 是否启用【1.启用 0.停用】 字段:match_category.enabled
     *
     * @param enabled the value for match_category.enabled, 是否启用【1.启用 0.停用】
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取 名称 字段:match_category.good_name
     *
     * @return match_category.good_name, 名称
     */
    public byte[] getGoodName() {
        return goodName;
    }

    /**
     * 设置 名称 字段:match_category.good_name
     *
     * @param goodName the value for match_category.good_name, 名称
     */
    public void setGoodName(byte[] goodName) {
        this.goodName = goodName;
    }
}