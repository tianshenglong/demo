package com.match.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

public class MatchPersonEnterpriseWithBLOBs extends MatchPersonEnterprise {

    @ApiModelProperty(value="企业id",name="enterpriseId")
    private byte[] enterpriseId;

    @ApiModelProperty(value="udb企业id",name="enterpriseUdbId")
    private byte[] enterpriseUdbId;

    @ApiModelProperty(value="撮合人员id",name="matchMakerId")
    private byte[] matchMakerId;

    @ApiModelProperty(value="管理员id",name="creator")
    private byte[] creator;

    /**
     * 获取 企业id 字段:match_person_enterprise.enterprise_id
     *
     * @return match_person_enterprise.enterprise_id, 企业id
     */
    public byte[] getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置 企业id 字段:match_person_enterprise.enterprise_id
     *
     * @param enterpriseId the value for match_person_enterprise.enterprise_id, 企业id
     */
    public void setEnterpriseId(byte[] enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取 udb企业id 字段:match_person_enterprise.enterprise_udb_id
     *
     * @return match_person_enterprise.enterprise_udb_id, udb企业id
     */
    public byte[] getEnterpriseUdbId() {
        return enterpriseUdbId;
    }

    /**
     * 设置 udb企业id 字段:match_person_enterprise.enterprise_udb_id
     *
     * @param enterpriseUdbId the value for match_person_enterprise.enterprise_udb_id, udb企业id
     */
    public void setEnterpriseUdbId(byte[] enterpriseUdbId) {
        this.enterpriseUdbId = enterpriseUdbId;
    }

    /**
     * 获取 撮合人员id 字段:match_person_enterprise.match_maker_id
     *
     * @return match_person_enterprise.match_maker_id, 撮合人员id
     */
    public byte[] getMatchMakerId() {
        return matchMakerId;
    }

    /**
     * 设置 撮合人员id 字段:match_person_enterprise.match_maker_id
     *
     * @param matchMakerId the value for match_person_enterprise.match_maker_id, 撮合人员id
     */
    public void setMatchMakerId(byte[] matchMakerId) {
        this.matchMakerId = matchMakerId;
    }

    /**
     * 获取 管理员id 字段:match_person_enterprise.creator
     *
     * @return match_person_enterprise.creator, 管理员id
     */
    public byte[] getCreator() {
        return creator;
    }

    /**
     * 设置 管理员id 字段:match_person_enterprise.creator
     *
     * @param creator the value for match_person_enterprise.creator, 管理员id
     */
    public void setCreator(byte[] creator) {
        this.creator = creator;
    }
}