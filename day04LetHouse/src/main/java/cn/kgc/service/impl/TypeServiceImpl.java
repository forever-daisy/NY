package cn.kgc.service.impl;

import cn.kgc.domain.Type;
import cn.kgc.domain.TypeExample;
import cn.kgc.mapper.TypeMapper;
import cn.kgc.service.TypeService;
import cn.kgc.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 王建兵
 * @Classname TypeServiceImpl
 * @Description TODO
 * @Date 2019/12/20 16:43
 * @Created by Administrator
 */
@Service
@Transactional
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;


    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)  //支持事务  都成功，都不成功
    public PageInfo<Type> getTypeByPage(PageUtil pageUtil) {
        PageHelper.startPage(pageUtil.getPage(),pageUtil.getRows());
        //查询
        TypeExample TypeExample=new TypeExample();
        List<Type> list= typeMapper.selectByExample(TypeExample);
        return new PageInfo<>(list);
    }

    @Override
    public int addType(Type Type) {
        return typeMapper.insertSelective(Type);
    }

    @Override
    public Type getType(Integer id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateType(Type type) {
        return typeMapper.updateByPrimaryKeySelective(type);
    }

    @Override
    @Transactional  //支持事务  都成功，都不成功
    //如果方法不报错则事务管理器会提交，报错时，事务管理器会回滚
    public void deleteType(Integer id) {
        //第二步:删除区域
        typeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteMoreType(Integer[] ids) {
        return typeMapper.deleteMoreType(ids);
    }
}
