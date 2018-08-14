package com.match.dao;

import com.sinochem.model.MatchRecord;

public interface MatchRecordMapper {
    /**
     *  根据主键删除数据库的记录,match_record
     *
     * @param recordId
     */
    int deleteByPrimaryKey(String recordId);

    /**
     *  新写入数据库记录,match_record
     *
     * @param record
     */
    int insert(MatchRecord record);

    /**
     *  动态字段,写入数据库记录,match_record
     *
     * @param record
     */
    int insertSelective(MatchRecord record);

    /**
     *  根据指定主键获取一条数据库记录,match_record
     *
     * @param recordId
     */
    MatchRecord selectByPrimaryKey(String recordId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,match_record
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MatchRecord record);

    /**
     *  根据主键来更新符合条件的数据库记录,match_record
     *
     * @param record
     */
    int updateByPrimaryKey(MatchRecord record);
}