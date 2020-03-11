package cn.kgc.mapper;

import cn.kgc.domain.Type;
import cn.kgc.domain.TypeExample;
import java.util.List;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
    /**
     * 实现区域批量删除
     * @param ids 批量删除的id
     * @return 影响行数
     */
    public int deleteMoreType(Integer [] ids);
//public int deleteMoreDistrict(List<Integer> ids);
}