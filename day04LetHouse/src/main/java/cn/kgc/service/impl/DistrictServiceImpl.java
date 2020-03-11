package cn.kgc.service.impl;

import cn.kgc.domain.District;
import cn.kgc.domain.DistrictExample;
import cn.kgc.mapper.DistrictMapper;
import cn.kgc.mapper.StreetMapper;
import cn.kgc.service.DistrictService;
import cn.kgc.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;
    @Autowired
    private StreetMapper streetMapper;

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)  //挂起。不基于事务来执行。
    public PageInfo<District> getDistrictByPage(PageUtil pageUtil) {
        PageHelper.startPage(pageUtil.getPage(),pageUtil.getRows());
        DistrictExample districtExample = new DistrictExample();
        List<District> list = districtMapper.selectByExample(districtExample);
        return new PageInfo<>(list);
    }

    @Override
    public District getDistrict(Integer id) {
        return districtMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addDistrict(District district) {
        return districtMapper.insertSelective(district);
    }

    @Override
    public int updateDistrict(District district) {
        return districtMapper.updateByPrimaryKeySelective(district);
    }

    @Override
    @Transactional  //支持事务  都成功，都不成功
    //如果方法不报错则事务管理器会提交，报错时，事务管理器会回滚

    public void deleteDistrict(Integer id) {
//        第一步先删街道
        streetMapper.delStreetByDistrict(id);
//        int i =1/0;
//        第二步 删除区域
       districtMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteMoreDistrict(Integer[] ids) {
        return districtMapper.deleteMoreDistrict(ids);
    }
}
