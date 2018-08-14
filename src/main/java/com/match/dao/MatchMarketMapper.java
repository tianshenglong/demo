package com.match.dao;

import com.sinochem.model.MatchMarket;

public interface MatchMarketMapper {
    /**
     *  根据主键删除数据库的记录,match_market
     *
     * @param marketId
     */
    int deleteByPrimaryKey(Integer marketId);

    /**
     *  新写入数据库记录,match_market
     *
     * @param record
     */
    int insert(MatchMarket record);

    /**
     *  动态字段,写入数据库记录,match_market
     *
     * @param record
     */
    int insertSelective(MatchMarket record);

    /**
     *  根据指定主键获取一条数据库记录,match_market
     *
     * @param marketId
     */
    MatchMarket selectByPrimaryKey(Integer marketId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,match_market
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MatchMarket record);

    /**
     *  根据主键来更新符合条件的数据库记录,match_market
     *
     * @param record
     */
    int updateByPrimaryKey(MatchMarket record);
}