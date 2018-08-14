package com.match.dao;

import com.sinochem.model.MatchBase;

public interface MatchBaseMapper {
    /**
     *  根据主键删除数据库的记录,match_base
     *
     * @param matchId
     */
    int deleteByPrimaryKey(byte[] matchId);

    /**
     *  新写入数据库记录,match_base
     *
     * @param record
     */
    int insert(MatchBase record);

    /**
     *  动态字段,写入数据库记录,match_base
     *
     * @param record
     */
    int insertSelective(MatchBase record);

    /**
     *  根据指定主键获取一条数据库记录,match_base
     *
     * @param matchId
     */
    MatchBase selectByPrimaryKey(byte[] matchId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,match_base
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MatchBase record);

    /**
     *  根据主键来更新符合条件的数据库记录,match_base
     *
     * @param record
     */
    int updateByPrimaryKey(MatchBase record);
}