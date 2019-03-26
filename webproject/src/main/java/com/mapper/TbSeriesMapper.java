package com.mapper;

import cn.itcast.ssm.po.TbSeries;
import cn.itcast.ssm.po.TbSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeriesMapper {
    int countByExample(TbSeriesExample example);

    int deleteByExample(TbSeriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSeries record);

    int insertSelective(TbSeries record);

    List<TbSeries> selectByExample(TbSeriesExample example);

    TbSeries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSeries record, @Param("example") TbSeriesExample example);

    int updateByExample(@Param("record") TbSeries record, @Param("example") TbSeriesExample example);

    int updateByPrimaryKeySelective(TbSeries record);

    int updateByPrimaryKey(TbSeries record);
}