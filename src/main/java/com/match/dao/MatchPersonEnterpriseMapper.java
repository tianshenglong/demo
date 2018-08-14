package com.match.dao;

import com.sinochem.model.MatchPersonEnterprise;
import com.sinochem.model.MatchPersonEnterpriseWithBLOBs;

public interface MatchPersonEnterpriseMapper {
    /**
     *  根据主键删除数据库的记录,match_person_enterprise
     *
     * @param id
     */
    int deleteByPrimaryKey(byte[] id);

    /**
     *  新写入数据库记录,match_person_enterprise
     *
     * @param record
     */
    int insert(MatchPersonEnterpriseWithBLOBs record);

    /**
     *  动态字段,写入数据库记录,match_person_enterprise
     *
     * @param record
     */
    int insertSelective(MatchPersonEnterpriseWithBLOBs record);

    /**
     *  根据指定主键获取一条数据库记录,match_person_enterprise
     *
     * @param id
     */
    MatchPersonEnterpriseWithBLOBs selectByPrimaryKey(byte[] id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,match_person_enterprise
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MatchPersonEnterpriseWithBLOBs record);

    /**
     * ,match_person_enterprise
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MatchPersonEnterpriseWithBLOBs record);

    /**
     *  根据主键来更新符合条件的数据库记录,match_person_enterprise
     *
     * @param record
     */
    int updateByPrimaryKey(MatchPersonEnterprise record);
}