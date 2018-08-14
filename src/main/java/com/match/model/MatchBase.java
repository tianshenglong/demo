package com.match.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="",description="数据库表：match_base")
public class MatchBase {

    @ApiModelProperty(value="主键",name="matchId", required=true)
    @NotEmpty
    private byte[] matchId;

    @ApiModelProperty(value="资源id对应壹化网的资源",name="resourceId")
    private String resourceId;

    @ApiModelProperty(value="客户id",name="enterpriseId")
    private String enterpriseId;

    @ApiModelProperty(value="udb客户id",name="entUdbId")
    private String entUdbId;

    @ApiModelProperty(value="挂单方式：1买单2卖单",name="matchType")
    private String matchType;

    @ApiModelProperty(value="支付方式：1线下2线上",name="dealType")
    private String dealType;

    @ApiModelProperty(value="关联产品表match_goods",name="matchGoodId")
    private Integer matchGoodId;

    @ApiModelProperty(value="质量标准关联产品表match_goods",name="matchGoodStandard")
    private Integer matchGoodStandard;

    @ApiModelProperty(value="源产地关联1进口2国产",name="matchOriginId")
    private String matchOriginId;

    @ApiModelProperty(value="交货期",name="dateDelivery")
    private String dateDelivery;

    @ApiModelProperty(value="交货地关联match_place",name="placeId")
    private Integer placeId;

    @ApiModelProperty(value="1 主流库2非主流库",name="warehouse")
    private String warehouse;

    @ApiModelProperty(value="单价",name="price")
    private BigDecimal price;

    @ApiModelProperty(value="数量",name="quantity")
    private BigDecimal quantity;

    @ApiModelProperty(value="单位key",name="uomKey")
    private String uomKey;

    @ApiModelProperty(value="单位name",name="uomName")
    private String uomName;

    @ApiModelProperty(value="保证金",name="deposit")
    private Integer deposit;

    @ApiModelProperty(value="佣金",name="commission")
    private BigDecimal commission;

    @ApiModelProperty(value="挂单时间",name="createTime")
    private Date createTime;

    @ApiModelProperty(value="挂单截至时间",name="endTime")
    private Date endTime;

    @ApiModelProperty(value="挂单状态：1已发布2已成交3已撤销4已失效",name="state")
    private String state;

    @ApiModelProperty(value="备注",name="remark")
    private String remark;

    @ApiModelProperty(value="修改时间",name="modifyTimie")
    private Date modifyTimie;

    @ApiModelProperty(value="是否启用【1.启用 0.停用】",name="enabled")
    private Short enabled;

    @ApiModelProperty(value="关联撮合人员表",name="creator")
    private String creator;

    @ApiModelProperty(value="1前台录入2oms录入",name="source")
    private String source;

    @ApiModelProperty(value="1是2否",name="standard")
    private String standard;

    /**
     * 获取 主键 字段:match_base.match_id
     *
     * @return match_base.match_id, 主键
     */
    public byte[] getMatchId() {
        return matchId;
    }

    /**
     * 设置 主键 字段:match_base.match_id
     *
     * @param matchId the value for match_base.match_id, 主键
     */
    public void setMatchId(byte[] matchId) {
        this.matchId = matchId;
    }

    /**
     * 获取 资源id对应壹化网的资源 字段:match_base.resource_id
     *
     * @return match_base.resource_id, 资源id对应壹化网的资源
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置 资源id对应壹化网的资源 字段:match_base.resource_id
     *
     * @param resourceId the value for match_base.resource_id, 资源id对应壹化网的资源
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * 获取 客户id 字段:match_base.enterprise_id
     *
     * @return match_base.enterprise_id, 客户id
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置 客户id 字段:match_base.enterprise_id
     *
     * @param enterpriseId the value for match_base.enterprise_id, 客户id
     */
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    /**
     * 获取 udb客户id 字段:match_base.ent_udb_id
     *
     * @return match_base.ent_udb_id, udb客户id
     */
    public String getEntUdbId() {
        return entUdbId;
    }

    /**
     * 设置 udb客户id 字段:match_base.ent_udb_id
     *
     * @param entUdbId the value for match_base.ent_udb_id, udb客户id
     */
    public void setEntUdbId(String entUdbId) {
        this.entUdbId = entUdbId == null ? null : entUdbId.trim();
    }

    /**
     * 获取 挂单方式：1买单2卖单 字段:match_base.match_type
     *
     * @return match_base.match_type, 挂单方式：1买单2卖单
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * 设置 挂单方式：1买单2卖单 字段:match_base.match_type
     *
     * @param matchType the value for match_base.match_type, 挂单方式：1买单2卖单
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType == null ? null : matchType.trim();
    }

    /**
     * 获取 支付方式：1线下2线上 字段:match_base.deal_type
     *
     * @return match_base.deal_type, 支付方式：1线下2线上
     */
    public String getDealType() {
        return dealType;
    }

    /**
     * 设置 支付方式：1线下2线上 字段:match_base.deal_type
     *
     * @param dealType the value for match_base.deal_type, 支付方式：1线下2线上
     */
    public void setDealType(String dealType) {
        this.dealType = dealType == null ? null : dealType.trim();
    }

    /**
     * 获取 关联产品表match_goods 字段:match_base.match_good_id
     *
     * @return match_base.match_good_id, 关联产品表match_goods
     */
    public Integer getMatchGoodId() {
        return matchGoodId;
    }

    /**
     * 设置 关联产品表match_goods 字段:match_base.match_good_id
     *
     * @param matchGoodId the value for match_base.match_good_id, 关联产品表match_goods
     */
    public void setMatchGoodId(Integer matchGoodId) {
        this.matchGoodId = matchGoodId;
    }

    /**
     * 获取 质量标准关联产品表match_goods 字段:match_base.match_good_standard
     *
     * @return match_base.match_good_standard, 质量标准关联产品表match_goods
     */
    public Integer getMatchGoodStandard() {
        return matchGoodStandard;
    }

    /**
     * 设置 质量标准关联产品表match_goods 字段:match_base.match_good_standard
     *
     * @param matchGoodStandard the value for match_base.match_good_standard, 质量标准关联产品表match_goods
     */
    public void setMatchGoodStandard(Integer matchGoodStandard) {
        this.matchGoodStandard = matchGoodStandard;
    }

    /**
     * 获取 源产地关联1进口2国产 字段:match_base.match_origin_id
     *
     * @return match_base.match_origin_id, 源产地关联1进口2国产
     */
    public String getMatchOriginId() {
        return matchOriginId;
    }

    /**
     * 设置 源产地关联1进口2国产 字段:match_base.match_origin_id
     *
     * @param matchOriginId the value for match_base.match_origin_id, 源产地关联1进口2国产
     */
    public void setMatchOriginId(String matchOriginId) {
        this.matchOriginId = matchOriginId == null ? null : matchOriginId.trim();
    }

    /**
     * 获取 交货期 字段:match_base.date_delivery
     *
     * @return match_base.date_delivery, 交货期
     */
    public String getDateDelivery() {
        return dateDelivery;
    }

    /**
     * 设置 交货期 字段:match_base.date_delivery
     *
     * @param dateDelivery the value for match_base.date_delivery, 交货期
     */
    public void setDateDelivery(String dateDelivery) {
        this.dateDelivery = dateDelivery == null ? null : dateDelivery.trim();
    }

    /**
     * 获取 交货地关联match_place 字段:match_base.place_id
     *
     * @return match_base.place_id, 交货地关联match_place
     */
    public Integer getPlaceId() {
        return placeId;
    }

    /**
     * 设置 交货地关联match_place 字段:match_base.place_id
     *
     * @param placeId the value for match_base.place_id, 交货地关联match_place
     */
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    /**
     * 获取 1 主流库2非主流库 字段:match_base.warehouse
     *
     * @return match_base.warehouse, 1 主流库2非主流库
     */
    public String getWarehouse() {
        return warehouse;
    }

    /**
     * 设置 1 主流库2非主流库 字段:match_base.warehouse
     *
     * @param warehouse the value for match_base.warehouse, 1 主流库2非主流库
     */
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    /**
     * 获取 单价 字段:match_base.price
     *
     * @return match_base.price, 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置 单价 字段:match_base.price
     *
     * @param price the value for match_base.price, 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取 数量 字段:match_base.quantity
     *
     * @return match_base.quantity, 数量
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置 数量 字段:match_base.quantity
     *
     * @param quantity the value for match_base.quantity, 数量
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取 单位key 字段:match_base.uom_key
     *
     * @return match_base.uom_key, 单位key
     */
    public String getUomKey() {
        return uomKey;
    }

    /**
     * 设置 单位key 字段:match_base.uom_key
     *
     * @param uomKey the value for match_base.uom_key, 单位key
     */
    public void setUomKey(String uomKey) {
        this.uomKey = uomKey == null ? null : uomKey.trim();
    }

    /**
     * 获取 单位name 字段:match_base.uom_name
     *
     * @return match_base.uom_name, 单位name
     */
    public String getUomName() {
        return uomName;
    }

    /**
     * 设置 单位name 字段:match_base.uom_name
     *
     * @param uomName the value for match_base.uom_name, 单位name
     */
    public void setUomName(String uomName) {
        this.uomName = uomName == null ? null : uomName.trim();
    }

    /**
     * 获取 保证金 字段:match_base.deposit
     *
     * @return match_base.deposit, 保证金
     */
    public Integer getDeposit() {
        return deposit;
    }

    /**
     * 设置 保证金 字段:match_base.deposit
     *
     * @param deposit the value for match_base.deposit, 保证金
     */
    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    /**
     * 获取 佣金 字段:match_base.commission
     *
     * @return match_base.commission, 佣金
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * 设置 佣金 字段:match_base.commission
     *
     * @param commission the value for match_base.commission, 佣金
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * 获取 挂单时间 字段:match_base.create_time
     *
     * @return match_base.create_time, 挂单时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 挂单时间 字段:match_base.create_time
     *
     * @param createTime the value for match_base.create_time, 挂单时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 挂单截至时间 字段:match_base.end_time
     *
     * @return match_base.end_time, 挂单截至时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置 挂单截至时间 字段:match_base.end_time
     *
     * @param endTime the value for match_base.end_time, 挂单截至时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取 挂单状态：1已发布2已成交3已撤销4已失效 字段:match_base.state
     *
     * @return match_base.state, 挂单状态：1已发布2已成交3已撤销4已失效
     */
    public String getState() {
        return state;
    }

    /**
     * 设置 挂单状态：1已发布2已成交3已撤销4已失效 字段:match_base.state
     *
     * @param state the value for match_base.state, 挂单状态：1已发布2已成交3已撤销4已失效
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取 备注 字段:match_base.remark
     *
     * @return match_base.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:match_base.remark
     *
     * @param remark the value for match_base.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取 修改时间 字段:match_base.modify_timie
     *
     * @return match_base.modify_timie, 修改时间
     */
    public Date getModifyTimie() {
        return modifyTimie;
    }

    /**
     * 设置 修改时间 字段:match_base.modify_timie
     *
     * @param modifyTimie the value for match_base.modify_timie, 修改时间
     */
    public void setModifyTimie(Date modifyTimie) {
        this.modifyTimie = modifyTimie;
    }

    /**
     * 获取 是否启用【1.启用 0.停用】 字段:match_base.enabled
     *
     * @return match_base.enabled, 是否启用【1.启用 0.停用】
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 设置 是否启用【1.启用 0.停用】 字段:match_base.enabled
     *
     * @param enabled the value for match_base.enabled, 是否启用【1.启用 0.停用】
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取 关联撮合人员表 字段:match_base.creator
     *
     * @return match_base.creator, 关联撮合人员表
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置 关联撮合人员表 字段:match_base.creator
     *
     * @param creator the value for match_base.creator, 关联撮合人员表
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取 1前台录入2oms录入 字段:match_base.source
     *
     * @return match_base.source, 1前台录入2oms录入
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置 1前台录入2oms录入 字段:match_base.source
     *
     * @param source the value for match_base.source, 1前台录入2oms录入
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取 1是2否 字段:match_base.standard
     *
     * @return match_base.standard, 1是2否
     */
    public String getStandard() {
        return standard;
    }

    /**
     * 设置 1是2否 字段:match_base.standard
     *
     * @param standard the value for match_base.standard, 1是2否
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }
}