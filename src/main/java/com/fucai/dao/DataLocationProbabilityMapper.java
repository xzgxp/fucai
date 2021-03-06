package com.fucai.dao;

import com.fucai.model.DataLocationProbability;
import com.fucai.model.DataLocationProbabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataLocationProbabilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int countByExample(DataLocationProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int deleteByExample(DataLocationProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer dataLocationProbabilityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int insert(DataLocationProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int insertSelective(DataLocationProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    List<DataLocationProbability> selectByExample(DataLocationProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    DataLocationProbability selectByPrimaryKey(Integer dataLocationProbabilityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DataLocationProbability record, @Param("example") DataLocationProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DataLocationProbability record, @Param("example") DataLocationProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DataLocationProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DataLocationProbability record);
}