package com.xjblx.mapper;

import com.xjblx.po.QuestionnaireCreate;
import com.xjblx.po.QuestionnaireCreateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireCreateMapper {
    int countByExample(QuestionnaireCreateExample example);

    int deleteByExample(QuestionnaireCreateExample example);

    int deleteByPrimaryKey(String username);

    int insert(QuestionnaireCreate record);

    int insertSelective(QuestionnaireCreate record);

    List<QuestionnaireCreate> selectByExample(QuestionnaireCreateExample example);

    QuestionnaireCreate selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") QuestionnaireCreate record, @Param("example") QuestionnaireCreateExample example);

    int updateByExample(@Param("record") QuestionnaireCreate record, @Param("example") QuestionnaireCreateExample example);

    int updateByPrimaryKeySelective(QuestionnaireCreate record);

    int updateByPrimaryKey(QuestionnaireCreate record);
}