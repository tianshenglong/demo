package com.match.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="",description="数据库表：match_template")
public class MatchTemplate {

    @ApiModelProperty(value="",name="templateId", required=true)
    @NotEmpty
    private Integer templateId;

    @ApiModelProperty(value="保证金",name="deposit")
    private Integer deposit;

    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;

    @ApiModelProperty(value="修改时间",name="modifyTime")
    private Date modifyTime;

    @ApiModelProperty(value="是否启用【1.启用 0.停用】",name="enabled")
    private Short enabled;

    /**
     * 获取  字段:match_template.template_id
     *
     * @return match_template.template_id, 
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * 设置  字段:match_template.template_id
     *
     * @param templateId the value for match_template.template_id, 
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取 保证金 字段:match_template.deposit
     *
     * @return match_template.deposit, 保证金
     */
    public Integer getDeposit() {
        return deposit;
    }

    /**
     * 设置 保证金 字段:match_template.deposit
     *
     * @param deposit the value for match_template.deposit, 保证金
     */
    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    /**
     * 获取 创建时间 字段:match_template.create_time
     *
     * @return match_template.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:match_template.create_time
     *
     * @param createTime the value for match_template.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 修改时间 字段:match_template.modify_time
     *
     * @return match_template.modify_time, 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置 修改时间 字段:match_template.modify_time
     *
     * @param modifyTime the value for match_template.modify_time, 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取 是否启用【1.启用 0.停用】 字段:match_template.enabled
     *
     * @return match_template.enabled, 是否启用【1.启用 0.停用】
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 设置 是否启用【1.启用 0.停用】 字段:match_template.enabled
     *
     * @param enabled the value for match_template.enabled, 是否启用【1.启用 0.停用】
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }
}