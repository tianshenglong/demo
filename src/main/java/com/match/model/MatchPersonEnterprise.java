package com.match.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="",description="数据库表：match_person_enterprise")
public class MatchPersonEnterprise {

    @ApiModelProperty(value="",name="id", required=true)
    @NotEmpty
    private byte[] id;

    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;

    @ApiModelProperty(value="是否启用【1.启用 0.解除关联】",name="enabled")
    private Short enabled;

    @ApiModelProperty(value="",name="column8")
    private String column8;

    /**
     * 获取  字段:match_person_enterprise.id
     *
     * @return match_person_enterprise.id, 
     */
    public byte[] getId() {
        return id;
    }

    /**
     * 设置  字段:match_person_enterprise.id
     *
     * @param id the value for match_person_enterprise.id, 
     */
    public void setId(byte[] id) {
        this.id = id;
    }

    /**
     * 获取 创建时间 字段:match_person_enterprise.create_time
     *
     * @return match_person_enterprise.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:match_person_enterprise.create_time
     *
     * @param createTime the value for match_person_enterprise.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 是否启用【1.启用 0.解除关联】 字段:match_person_enterprise.enabled
     *
     * @return match_person_enterprise.enabled, 是否启用【1.启用 0.解除关联】
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 设置 是否启用【1.启用 0.解除关联】 字段:match_person_enterprise.enabled
     *
     * @param enabled the value for match_person_enterprise.enabled, 是否启用【1.启用 0.解除关联】
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取  字段:match_person_enterprise.Column_8
     *
     * @return match_person_enterprise.Column_8, 
     */
    public String getColumn8() {
        return column8;
    }

    /**
     * 设置  字段:match_person_enterprise.Column_8
     *
     * @param column8 the value for match_person_enterprise.Column_8, 
     */
    public void setColumn8(String column8) {
        this.column8 = column8 == null ? null : column8.trim();
    }
}