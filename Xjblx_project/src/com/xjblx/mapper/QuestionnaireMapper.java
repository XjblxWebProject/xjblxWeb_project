package com.xjblx.mapper;
/**
 * 
 * <p>Title: CustomDateConverter</p>
 * <p>Description:Questionnaire的mapper类 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	张子阳
 * @date	2018-4-18
 * @version 1.0
 */
import com.xjblx.po.Questionnaire;
import com.xjblx.po.QuestionnaireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireMapper {
    int countByExample(QuestionnaireExample example);

    int deleteByExample(QuestionnaireExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    List<Questionnaire> selectByExample(QuestionnaireExample example);

    Questionnaire selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByExample(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByPrimaryKeySelective(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);
}