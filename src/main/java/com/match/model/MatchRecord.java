package com.match.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="",description="数据库表：match_record")
public class MatchRecord {

    @ApiModelProperty(value="主键",name="recordId", required=true)
    @NotEmpty
    private String recordId;

    @ApiModelProperty(value="挂单id买",name="matchBuyerId")
    private String matchBuyerId;

    @ApiModelProperty(value="挂单id卖",name="matchSellerId")
    private String matchSellerId;

    @ApiModelProperty(value="买方id",name="buyerEntId")
    private String buyerEntId;

    @ApiModelProperty(value="",name="buyerUdbId")
    private String buyerUdbId;

    @ApiModelProperty(value="卖方id",name="sellerEntId")
    private String sellerEntId;

    @ApiModelProperty(value="卖方udbid",name="sellerUdbId")
    private String sellerUdbId;

    @ApiModelProperty(value="订单Id",name="orderId")
    private String orderId;

    @ApiModelProperty(value="订单编号",name="orderCode")
    private String orderCode;

    @ApiModelProperty(value="支付方式：1线下2线上",name="dealType")
    private String dealType;

    @ApiModelProperty(value="关联产品表match_goods",name="matchGoodId")
    private Integer matchGoodId;

    @ApiModelProperty(value="质量标准关联产品表match_goods",name="matchGoodStandard")
    private Integer matchGoodStandard;

    @ApiModelProperty(value="源产地关联match_origin",name="matchOriginId")
    private Integer matchOriginId;

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

    @ApiModelProperty(value="总价",name="totalPrice")
    private BigDecimal totalPrice;

    @ApiModelProperty(value="买方佣金",name="buyerCommission")
    private BigDecimal buyerCommission;

    @ApiModelProperty(value="卖方佣金",name="sellerCommission")
    private BigDecimal sellerCommission;

    @ApiModelProperty(value="匹配方式：1摘单2买单匹配3卖单匹配",name="matchWay")
    private String matchWay;

    @ApiModelProperty(value="浮动保证金(算法)",name="floatDeposit")
    private BigDecimal floatDeposit;

    @ApiModelProperty(value="备注",name="remark")
    private String remark;

    @ApiModelProperty(value="修改时间",name="modifyTimie")
    private Date modifyTimie;

    @ApiModelProperty(value="是否启用【1.启用 0.停用】",name="enabled")
    private Short enabled;

    @ApiModelProperty(value="买方撮合人员关联撮合人员表",name="buyerCreator")
    private String buyerCreator;

    @ApiModelProperty(value="卖方撮合人员关联撮合人员表",name="sellerCreator")
    private String sellerCreator;

    @ApiModelProperty(value="1匹配成功2匹配失败",name="state")
    private String state;

    @ApiModelProperty(value="成交时间",name="dealTime")
    private Date dealTime;

    /**
     * 获取 主键 字段:match_record.record_id
     *
     * @return match_record.record_id, 主键
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * 设置 主键 字段:match_record.record_id
     *
     * @param recordId the value for match_record.record_id, 主键
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    /**
     * 获取 挂单id买 字段:match_record.match_buyer_id
     *
     * @return match_record.match_buyer_id, 挂单id买
     */
    public String getMatchBuyerId() {
        return matchBuyerId;
    }

    /**
     * 设置 挂单id买 字段:match_record.match_buyer_id
     *
     * @param matchBuyerId the value for match_record.match_buyer_id, 挂单id买
     */
    public void setMatchBuyerId(String matchBuyerId) {
        this.matchBuyerId = matchBuyerId == null ? null : matchBuyerId.trim();
    }

    /**
     * 获取 挂单id卖 字段:match_record.match_seller_id
     *
     * @return match_record.match_seller_id, 挂单id卖
     */
    public String getMatchSellerId() {
        return matchSellerId;
    }

    /**
     * 设置 挂单id卖 字段:match_record.match_seller_id
     *
     * @param matchSellerId the value for match_record.match_seller_id, 挂单id卖
     */
    public void setMatchSellerId(String matchSellerId) {
        this.matchSellerId = matchSellerId == null ? null : matchSellerId.trim();
    }

    /**
     * 获取 买方id 字段:match_record.buyer_ent_id
     *
     * @return match_record.buyer_ent_id, 买方id
     */
    public String getBuyerEntId() {
        return buyerEntId;
    }

    /**
     * 设置 买方id 字段:match_record.buyer_ent_id
     *
     * @param buyerEntId the value for match_record.buyer_ent_id, 买方id
     */
    public void setBuyerEntId(String buyerEntId) {
        this.buyerEntId = buyerEntId == null ? null : buyerEntId.trim();
    }

    /**
     * 获取  字段:match_record.buyer_udb_id
     *
     * @return match_record.buyer_udb_id, 
     */
    public String getBuyerUdbId() {
        return buyerUdbId;
    }

    /**
     * 设置  字段:match_record.buyer_udb_id
     *
     * @param buyerUdbId the value for match_record.buyer_udb_id, 
     */
    public void setBuyerUdbId(String buyerUdbId) {
        this.buyerUdbId = buyerUdbId == null ? null : buyerUdbId.trim();
    }

    /**
     * 获取 卖方id 字段:match_record.seller_ent_id
     *
     * @return match_record.seller_ent_id, 卖方id
     */
    public String getSellerEntId() {
        return sellerEntId;
    }

    /**
     * 设置 卖方id 字段:match_record.seller_ent_id
     *
     * @param sellerEntId the value for match_record.seller_ent_id, 卖方id
     */
    public void setSellerEntId(String sellerEntId) {
        this.sellerEntId = sellerEntId == null ? null : sellerEntId.trim();
    }

    /**
     * 获取 卖方udbid 字段:match_record.seller_udb_id
     *
     * @return match_record.seller_udb_id, 卖方udbid
     */
    public String getSellerUdbId() {
        return sellerUdbId;
    }

    /**
     * 设置 卖方udbid 字段:match_record.seller_udb_id
     *
     * @param sellerUdbId the value for match_record.seller_udb_id, 卖方udbid
     */
    public void setSellerUdbId(String sellerUdbId) {
        this.sellerUdbId = sellerUdbId == null ? null : sellerUdbId.trim();
    }

    /**
     * 获取 订单Id 字段:match_record.order_id
     *
     * @return match_record.order_id, 订单Id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置 订单Id 字段:match_record.order_id
     *
     * @param orderId the value for match_record.order_id, 订单Id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取 订单编号 字段:match_record.order_code
     *
     * @return match_record.order_code, 订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 设置 订单编号 字段:match_record.order_code
     *
     * @param orderCode the value for match_record.order_code, 订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * 获取 支付方式：1线下2线上 字段:match_record.deal_type
     *
     * @return match_record.deal_type, 支付方式：1线下2线上
     */
    public String getDealType() {
        return dealType;
    }

    /**
     * 设置 支付方式：1线下2线上 字段:match_record.deal_type
     *
     * @param dealType the value for match_record.deal_type, 支付方式：1线下2线上
     */
    public void setDealType(String dealType) {
        this.dealType = dealType == null ? null : dealType.trim();
    }

    /**
     * 获取 关联产品表match_goods 字段:match_record.match_good_id
     *
     * @return match_record.match_good_id, 关联产品表match_goods
     */
    public Integer getMatchGoodId() {
        return matchGoodId;
    }

    /**
     * 设置 关联产品表match_goods 字段:match_record.match_good_id
     *
     * @param matchGoodId the value for match_record.match_good_id, 关联产品表match_goods
     */
    public void setMatchGoodId(Integer matchGoodId) {
        this.matchGoodId = matchGoodId;
    }

    /**
     * 获取 质量标准关联产品表match_goods 字段:match_record.match_good_standard
     *
     * @return match_record.match_good_standard, 质量标准关联产品表match_goods
     */
    public Integer getMatchGoodStandard() {
        return matchGoodStandard;
    }

    /**
     * 设置 质量标准关联产品表match_goods 字段:match_record.match_good_standard
     *
     * @param matchGoodStandard the value for match_record.match_good_standard, 质量标准关联产品表match_goods
     */
    public void setMatchGoodStandard(Integer matchGoodStandard) {
        this.matchGoodStandard = matchGoodStandard;
    }

    /**
     * 获取 源产地关联match_origin 字段:match_record.match_origin_id
     *
     * @return match_record.match_origin_id, 源产地关联match_origin
     */
    public Integer getMatchOriginId() {
        return matchOriginId;
    }

    /**
     * 设置 源产地关联match_origin 字段:match_record.match_origin_id
     *
     * @param matchOriginId the value for match_record.match_origin_id, 源产地关联match_origin
     */
    public void setMatchOriginId(Integer matchOriginId) {
        this.matchOriginId = matchOriginId;
    }

    /**
     * 获取 交货期 字段:match_record.date_delivery
     *
     * @return match_record.date_delivery, 交货期
     */
    public String getDateDelivery() {
        return dateDelivery;
    }

    /**
     * 设置 交货期 字段:match_record.date_delivery
     *
     * @param dateDelivery the value for match_record.date_delivery, 交货期
     */
    public void setDateDelivery(String dateDelivery) {
        this.dateDelivery = dateDelivery == null ? null : dateDelivery.trim();
    }

    /**
     * 获取 交货地关联match_place 字段:match_record.place_id
     *
     * @return match_record.place_id, 交货地关联match_place
     */
    public Integer getPlaceId() {
        return placeId;
    }

    /**
     * 设置 交货地关联match_place 字段:match_record.place_id
     *
     * @param placeId the value for match_record.place_id, 交货地关联match_place
     */
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    /**
     * 获取 1 主流库2非主流库 字段:match_record.warehouse
     *
     * @return match_record.warehouse, 1 主流库2非主流库
     */
    public String getWarehouse() {
        return warehouse;
    }

    /**
     * 设置 1 主流库2非主流库 字段:match_record.warehouse
     *
     * @param warehouse the value for match_record.warehouse, 1 主流库2非主流库
     */
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    /**
     * 获取 单价 字段:match_record.price
     *
     * @return match_record.price, 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置 单价 字段:match_record.price
     *
     * @param price the value for match_record.price, 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取 数量 字段:match_record.quantity
     *
     * @return match_record.quantity, 数量
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置 数量 字段:match_record.quantity
     *
     * @param quantity the value for match_record.quantity, 数量
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取 单位key 字段:match_record.uom_key
     *
     * @return match_record.uom_key, 单位key
     */
    public String getUomKey() {
        return uomKey;
    }

    /**
     * 设置 单位key 字段:match_record.uom_key
     *
     * @param uomKey the value for match_record.uom_key, 单位key
     */
    public void setUomKey(String uomKey) {
        this.uomKey = uomKey == null ? null : uomKey.trim();
    }

    /**
     * 获取 单位name 字段:match_record.uom_name
     *
     * @return match_record.uom_name, 单位name
     */
    public String getUomName() {
        return uomName;
    }

    /**
     * 设置 单位name 字段:match_record.uom_name
     *
     * @param uomName the value for match_record.uom_name, 单位name
     */
    public void setUomName(String uomName) {
        this.uomName = uomName == null ? null : uomName.trim();
    }

    /**
     * 获取 保证金 字段:match_record.deposit
     *
     * @return match_record.deposit, 保证金
     */
    public Integer getDeposit() {
        return deposit;
    }

    /**
     * 设置 保证金 字段:match_record.deposit
     *
     * @param deposit the value for match_record.deposit, 保证金
     */
    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    /**
     * 获取 总价 字段:match_record.total_price
     *
     * @return match_record.total_price, 总价
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置 总价 字段:match_record.total_price
     *
     * @param totalPrice the value for match_record.total_price, 总价
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 获取 买方佣金 字段:match_record.buyer_commission
     *
     * @return match_record.buyer_commission, 买方佣金
     */
    public BigDecimal getBuyerCommission() {
        return buyerCommission;
    }

    /**
     * 设置 买方佣金 字段:match_record.buyer_commission
     *
     * @param buyerCommission the value for match_record.buyer_commission, 买方佣金
     */
    public void setBuyerCommission(BigDecimal buyerCommission) {
        this.buyerCommission = buyerCommission;
    }

    /**
     * 获取 卖方佣金 字段:match_record.seller_commission
     *
     * @return match_record.seller_commission, 卖方佣金
     */
    public BigDecimal getSellerCommission() {
        return sellerCommission;
    }

    /**
     * 设置 卖方佣金 字段:match_record.seller_commission
     *
     * @param sellerCommission the value for match_record.seller_commission, 卖方佣金
     */
    public void setSellerCommission(BigDecimal sellerCommission) {
        this.sellerCommission = sellerCommission;
    }

    /**
     * 获取 匹配方式：1摘单2买单匹配3卖单匹配 字段:match_record.match_way
     *
     * @return match_record.match_way, 匹配方式：1摘单2买单匹配3卖单匹配
     */
    public String getMatchWay() {
        return matchWay;
    }

    /**
     * 设置 匹配方式：1摘单2买单匹配3卖单匹配 字段:match_record.match_way
     *
     * @param matchWay the value for match_record.match_way, 匹配方式：1摘单2买单匹配3卖单匹配
     */
    public void setMatchWay(String matchWay) {
        this.matchWay = matchWay == null ? null : matchWay.trim();
    }

    /**
     * 获取 浮动保证金(算法) 字段:match_record.float_deposit
     *
     * @return match_record.float_deposit, 浮动保证金(算法)
     */
    public BigDecimal getFloatDeposit() {
        return floatDeposit;
    }

    /**
     * 设置 浮动保证金(算法) 字段:match_record.float_deposit
     *
     * @param floatDeposit the value for match_record.float_deposit, 浮动保证金(算法)
     */
    public void setFloatDeposit(BigDecimal floatDeposit) {
        this.floatDeposit = floatDeposit;
    }

    /**
     * 获取 备注 字段:match_record.remark
     *
     * @return match_record.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:match_record.remark
     *
     * @param remark the value for match_record.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取 修改时间 字段:match_record.modify_timie
     *
     * @return match_record.modify_timie, 修改时间
     */
    public Date getModifyTimie() {
        return modifyTimie;
    }

    /**
     * 设置 修改时间 字段:match_record.modify_timie
     *
     * @param modifyTimie the value for match_record.modify_timie, 修改时间
     */
    public void setModifyTimie(Date modifyTimie) {
        this.modifyTimie = modifyTimie;
    }

    /**
     * 获取 是否启用【1.启用 0.停用】 字段:match_record.enabled
     *
     * @return match_record.enabled, 是否启用【1.启用 0.停用】
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 设置 是否启用【1.启用 0.停用】 字段:match_record.enabled
     *
     * @param enabled the value for match_record.enabled, 是否启用【1.启用 0.停用】
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取 买方撮合人员关联撮合人员表 字段:match_record.buyer_creator
     *
     * @return match_record.buyer_creator, 买方撮合人员关联撮合人员表
     */
    public String getBuyerCreator() {
        return buyerCreator;
    }

    /**
     * 设置 买方撮合人员关联撮合人员表 字段:match_record.buyer_creator
     *
     * @param buyerCreator the value for match_record.buyer_creator, 买方撮合人员关联撮合人员表
     */
    public void setBuyerCreator(String buyerCreator) {
        this.buyerCreator = buyerCreator == null ? null : buyerCreator.trim();
    }

    /**
     * 获取 卖方撮合人员关联撮合人员表 字段:match_record.seller_creator
     *
     * @return match_record.seller_creator, 卖方撮合人员关联撮合人员表
     */
    public String getSellerCreator() {
        return sellerCreator;
    }

    /**
     * 设置 卖方撮合人员关联撮合人员表 字段:match_record.seller_creator
     *
     * @param sellerCreator the value for match_record.seller_creator, 卖方撮合人员关联撮合人员表
     */
    public void setSellerCreator(String sellerCreator) {
        this.sellerCreator = sellerCreator == null ? null : sellerCreator.trim();
    }

    /**
     * 获取 1匹配成功2匹配失败 字段:match_record.state
     *
     * @return match_record.state, 1匹配成功2匹配失败
     */
    public String getState() {
        return state;
    }

    /**
     * 设置 1匹配成功2匹配失败 字段:match_record.state
     *
     * @param state the value for match_record.state, 1匹配成功2匹配失败
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取 成交时间 字段:match_record.deal_time
     *
     * @return match_record.deal_time, 成交时间
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * 设置 成交时间 字段:match_record.deal_time
     *
     * @param dealTime the value for match_record.deal_time, 成交时间
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
}