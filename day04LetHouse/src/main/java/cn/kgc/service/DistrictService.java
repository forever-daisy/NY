package cn.kgc.service;

import cn.kgc.domain.District;
import cn.kgc.utils.PageUtil;
import com.github.pagehelper.PageInfo;

public interface DistrictService {
    public PageInfo<District> getDistrictByPage(PageUtil pageUtil);

    /*
    * 通过主键查询单条信息
    * 参数 ：id 主键编号
    * 返回值：单条实体对象
    *
    * */
    public District getDistrict(Integer id);

    /*
    *添加区域
    * 参数 district 区域实体信息
    * return 影响行数
    * */
    public int addDistrict(District district);

    public int updateDistrict(District district);

    public void deleteDistrict(Integer id);

//    批量删除
    public int deleteMoreDistrict(Integer[] ids);
}