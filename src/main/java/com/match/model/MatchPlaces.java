package com.match.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="",description="数据库表：match_places")
public class MatchPlaces {

    @ApiModelProperty(value="",name="placeId", required=true)
    @NotEmpty
    private Integer placeId;

    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;

    @ApiModelProperty(value="是否启用【1.启用 0.停用】",name="enabled")
    private Short enabled;

    @ApiModelProperty(value="名称",name="placeName")
    private byte[] placeName;

    /**
     * 获取  字段:match_places.place_id
     *
     * @return match_places.place_id, 
     */
    public Integer getPlaceId() {
        return placeId;
    }

    /**
     * 设置  字段:match_places.place_id
     *
     * @param placeId the value for match_places.place_id, 
     */
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    /**
     * 获取 创建时间 字段:match_places.create_time
     *
     * @return match_places.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:match_places.create_time
     *
     * @param createTime the value for match_places.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 是否启用【1.启用 0.停用】 字段:match_places.enabled
     *
     * @return match_places.enabled, 是否启用【1.启用 0.停用】
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 设置 是否启用【1.启用 0.停用】 字段:match_places.enabled
     *
     * @param enabled the value for match_places.enabled, 是否启用【1.启用 0.停用】
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取 名称 字段:match_places.place_name
     *
     * @return match_places.place_name, 名称
     */
    public byte[] getPlaceName() {
        return placeName;
    }

    /**
     * 设置 名称 字段:match_places.place_name
     *
     * @param placeName the value for match_places.place_name, 名称
     */
    public void setPlaceName(byte[] placeName) {
        this.placeName = placeName;
    }
}