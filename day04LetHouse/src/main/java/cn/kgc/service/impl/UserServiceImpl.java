package cn.kgc.service.impl;

import cn.kgc.domain.Users;
import cn.kgc.domain.UsersExample;
import cn.kgc.mapper.UsersMapper;
import cn.kgc.service.UserService;
import cn.kgc.utils.UserCondition;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2019/12/24 10:38
 * @Created by Administrator
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public PageInfo<Users> getUserByPage(UserCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getRows());
        //查询所有用户
        UsersExample usersExample = new UsersExample();
        //封装条件
        UsersExample.Criteria criteria = usersExample.createCriteria();
        //动态sql:一个属性一个判断
        if (condition.getName() != null)
            criteria.andNameLike("%" + condition.getName() + "%");
        if (condition.getTel() != null)
            criteria.andTelephoneLike("%" + condition.getTel() + "%");
        List<Users> list = usersMapper.selectByExample(usersExample);
        return new PageInfo<>(list);
    }

    @Override
    public boolean checkUname(String name) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andIsadminEqualTo(new Integer("0"));
        criteria.andNameEqualTo(name);
        List<Users> list = usersMapper.selectByExample(usersExample);
        if (list != null && list.size() != 0) {
            return false;
        }else
        return true;
    }
}
