package cn.kgc.service;

import cn.kgc.domain.Users;
import cn.kgc.utils.UserCondition;
import com.github.pagehelper.PageInfo;


/**
 * @author 王建兵
 * @Classname DistritctService
 * @Description TODO
 * @Date 2019/12/20 16:42
 * @Created by Administrator
 */
public interface UserService {
     /**
      * 查询区域带分页
      * @param condition
      *   包含查询的条件
      *   page属性接收页码，rows接收页大小
      * @return
      */
     public PageInfo<Users> getUserByPage(UserCondition condition);


     public boolean checkUname(String name);

}
