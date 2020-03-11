package cn.kgc.pController;

import cn.kgc.domain.Users;
import cn.kgc.service.UserService;
import cn.kgc.utils.UserCondition;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王建兵
 * @Classname DistrictController
 * @Description TODO
 * @Date 2019/12/20 16:52
 * @Created by Administrator
 */

@RestController // @Controller+ @ResponseBody
@RequestMapping("/admin/")  //指定请求前缀
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserData")   //condition 包含:page ,rows 、查询条件
    public Map<String,Object> getUserData(UserCondition condition){
        //调用业务区域数据
        PageInfo<Users> pageInfo=userService.getUserByPage(condition);
        //封装返回数据
        Map<String,Object> map=new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }

}
