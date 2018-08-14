package com.match.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="",description="数据库表：match_market")
public class MatchMarket {

    @ApiModelProperty(value="",name="marketId", required=true)
    @NotEmpty
    private Integer marketId;

    @ApiModelProperty(value="统计日期",name="statisticsDate")
    private Date statisticsDate;

    @ApiModelProperty(value="商品id",name="goodId")
    private String goodId;

    @ApiModelProperty(value="最新成交价(可手动输入，只要有成交既替换该字段)",name="newPrice")
    private String newPrice;

    @ApiModelProperty(value="当日均价",name="averagePlace")
    private String averagePlace;

    @ApiModelProperty(value="当日成交量",name="vol")
    private String vol;

    @ApiModelProperty(value="当日买方佣金",name="buyerCommission")
    private BigDecimal buyerCommission;

    @ApiModelProperty(value="当日卖方佣金",name="sellerCommission")
    private BigDecimal sellerCommission;

    @ApiModelProperty(value="创建者(撮合人员id)",name="creator")
    private String creator;

    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;

    @ApiModelProperty(value="修改者(撮合人员id)",name="modifyor")
    private String modifyor;

    @ApiModelProperty(value="修改时间",name="modifyTime")
    private Date modifyTime;

    @ApiModelProperty(value="是否启用【1.启用 0.停用】",name="enabled")
    private Short enabled;

    /**
     * 获取  字段:match_market.market_id
     *
     * @return match_market.market_id, 
     */
    public Integer getMarketId() {
        return marketId;
    }

    /**
     * 设置  字段:match_market.market_id
     *
     * @param marketId the value for match_market.market_id, 
     */
    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    /**
     * 获取 统计日期 字段:match_market.statistics_date
     *
     * @return match_market.statistics_date, 统计日期
     */
    public Date getStatisticsDate() {
        return statisticsDate;
    }

    /**
     * 设置 统计日期 字段:match_market.statistics_date
     *
     * @param statisticsDate the value for match_market.statistics_date, 统计日期
     */
    public void setStatisticsDate(Date statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    /**
     * 获取 商品id 字段:match_market.good_id
     *
     * @return match_market.good_id, 商品id
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * 设置 商品id 字段:match_market.good_id
     *
     * @param goodId the value for match_market.good_id, 商品id
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    /**
     * 获取 最新成交价(可手动输入，只要有成交既替换该字段) 字段:match_market.new_price
     *
     * @return match_market.new_price, 最新成交价(可手动输入，只要有成交既替换该字段)
     */
    public String getNewPrice() {
        return newPrice;
    }

    /**
     * 设置 最新成交价(可手动输入，只要有成交既替换该字段) 字段:match_market.new_price
     *
     * @param newPrice the value for match_market.new_price, 最新成交价(可手动输入，只要有成交既替换该字段)
     */
    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice == null ? null : newPrice.trim();
    }

    /**
     * 获取 当日均价 字段:match_market.average_place
     *
     * @return match_market.average_place, 当日均价
     */
    public String getAveragePlace() {
        return averagePlace;
    }

    /**
     * 设置 当日均价 字段:match_market.average_place
     *
     * @param averagePlace the value for match_market.average_place, 当日均价
     */
    public void setAveragePlace(String averagePlace) {
        this.averagePlace = averagePlace == null ? null : averagePlace.trim();
    }

    /**
     * 获取 当日成交量 字段:match_market.vol
     *
     * @return match_market.vol, 当日成交量
     */
    public String getVol() {
        return vol;
    }

    /**
     * 设置 当日成交量 字段:match_market.vol
     *
     * @param vol the value for match_market.vol, 当日成交量
     */
    public void setVol(String vol) {
        this.vol = vol == null ? null : vol.trim();
    }

    /**
     * 获取 当日买方佣金 字段:match_market.buyer_commission
     *
     * @return match_market.buyer_commission, 当日买方佣金
     */
    public BigDecimal getBuyerCommission() {
        return buyerCommission;
    }

    /**
     * 设置 当日买方佣金 字段:match_market.buyer_commission
     *
     * @param buyerCommission the value for match_market.buyer_commission, 当日买方佣金
     */
    public void setBuyerCommission(BigDecimal buyerCommission) {
        this.buyerCommission = buyerCommission;
    }

    /**
     * 获取 当日卖方佣金 字段:match_market.seller_commission
     *
     * @return match_market.seller_commission, 当日卖方佣金
     */
    public BigDecimal getSellerCommission() {
        return sellerCommission;
    }

    /**
     * 设置 当日卖方佣金 字段:match_market.seller_commission
     *
     * @param sellerCommission the value for match_market.seller_commission, 当日卖方佣金
     */
    public void setSellerCommission(BigDecimal sellerCommission) {
        this.sellerCommission = sellerCommission;
    }

    /**
     * 获取 创建者(撮合人员id) 字段:match_market.creator
     *
     * @return match_market.creator, 创建者(撮合人员id)
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置 创建者(撮合人员id) 字段:match_market.creator
     *
     * @param creator the value for match_market.creator, 创建者(撮合人员id)
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取 创建时间 字段:match_market.create_time
     *
     * @return match_market.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:match_market.create_time
     *
     * @param createTime the value for match_market.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 修改者(撮合人员id) 字段:match_market.modifyor
     *
     * @return match_market.modifyor, 修改者(撮合人员id)
     */
    public String getModifyor() {
        return modifyor;
    }

    /**
     * 设置 修改者(撮合人员id) 字段:match_market.modifyor
     *
     * @param modifyor the value for match_market.modifyor, 修改者(撮合人员id)
     */
    public void setModifyor(String modifyor) {
        this.modifyor = modifyor == null ? null : modifyor.trim();
    }

    /**
     * 获取 修改时间 字段:match_market.modify_time
     *
     * @return match_market.modify_time, 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置 修改时间 字段:match_market.modify_time
     *
     * @param modifyTime the value for match_market.modify_time, 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取 是否启用【1.启用 0.停用】 字段:match_market.enabled
     *
     * @return match_market.enabled, 是否启用【1.启用 0.停用】
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * 设置 是否启用【1.启用 0.停用】 字段:match_market.enabled
     *
     * @param enabled the value for match_market.enabled, 是否启用【1.启用 0.停用】
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }
}