package com.match.dao;

import com.sinochem.model.MatchCategory;

public interface MatchCategoryMapper {
    /**
     *  根据主键删除数据库的记录,match_category
     *
     * @param goodId
     */
    int deleteByPrimaryKey(Integer goodId);

    /**
     *  新写入数据库记录,match_category
     *
     * @param record
     */
    int insert(MatchCategory record);

    /**
     *  动态字段,写入数据库记录,match_category
     *
     * @param record
     */
    int insertSelective(MatchCategory record);

    /**
     *  根据指定主键获取一条数据库记录,match_category
     *
     * @param goodId
     */
    MatchCategory selectByPrimaryKey(Integer goodId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,match_category
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MatchCategory record);

    /**
     * ,match_category
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MatchCategory record);

    /**
     *  根据主键来更新符合条件的数据库记录,match_category
     *
     * @param record
     */
    int updateByPrimaryKey(MatchCategory record);
}