package com.match.dao;

import com.match.model.MatchTemplate;
import com.match.model.MatchTemplateWithBLOBs;

public interface MatchTemplateMapper {
    /**
     *  根据主键删除数据库的记录,match_template
     *
     * @param templateId
     */
    int deleteByPrimaryKey(Integer templateId);

    /**
     *  新写入数据库记录,match_template
     *
     * @param record
     */
    int insert(MatchTemplateWithBLOBs record);

    /**
     *  动态字段,写入数据库记录,match_template
     *
     * @param record
     */
    int insertSelective(MatchTemplateWithBLOBs record);

    /**
     *  根据指定主键获取一条数据库记录,match_template
     *
     * @param templateId
     */
    MatchTemplateWithBLOBs selectByPrimaryKey(Integer templateId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,match_template
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MatchTemplateWithBLOBs record);

    /**
     * ,match_template
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(MatchTemplateWithBLOBs record);

    /**
     *  根据主键来更新符合条件的数据库记录,match_template
     *
     * @param record
     */
    int updateByPrimaryKey(MatchTemplate record);
}