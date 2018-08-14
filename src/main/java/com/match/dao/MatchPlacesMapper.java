package com.match.dao;

import com.sinochem.model.MatchPlaces;

public interface MatchPlacesMapper {
    /**
     *  根据主键删除数据库的记录,match_places
     *
     * @param placeId
     */
    int deleteByPrimaryKey(Integer placeId);

    /**
     *  新写入数据库记录,match_places
     *
     * @param record
     */
    int insert(MatchPlaces record);

    /**
     *  动态字段,写入数据库记录,match_places
     *
     * @param record
     */
    int insertSelective(MatchPlaces record);

    /**
     *  根据指定主键获取一条数据库记录,match_places
     *
     * @param placeId
     */
    MatchPlaces selectByPrimaryKey(Integer placeId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,match_places
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MatchPlaces record);

    /**
     * ,match_places
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MatchPlaces record);

    /**
     *  根据主键来更新符合条件的数据库记录,match_places
     *
     * @param record
     */
    int updateByPrimaryKey(MatchPlaces record);
}