package cn.kgc.controller;

import cn.kgc.domain.District;
import cn.kgc.service.DistrictService;
import cn.kgc.utils.PageUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //controller+ResponseBody
@RequestMapping("/admin/")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping("getDistrictData")
    public Map<String,Object> getDistrictData(PageUtil pageUtil){
        PageInfo<District> pageInfo = districtService.getDistrictByPage(pageUtil);
        Map<String,Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }

    @RequestMapping("getDistrict")
    public District getDistrict(Integer id){
        District district = districtService.getDistrict(id);
        return district;
    }

    @RequestMapping("addDistrict")
    public String addDistrict(District district){
        int result = districtService.addDistrict(district);
        return "{\"result\":"+result+"}";
    }

    @RequestMapping("updateDistrict")
    public String updateDistrict(District district){
        int result = districtService.updateDistrict(district);
        return "{\"result\":"+result+"}";
    }

    @RequestMapping("delDistrict")
    public String delDistrict(Integer id){
        districtService.deleteDistrict(id);
        return "{\"result\":1}";
    }

    @RequestMapping("delMoreDistrict")
    public String delMoreDistrict(String ids){
        try{String [] strList = ids.split(",");
            Integer [] idList = new Integer[strList.length];
            for (int i = 0; i <strList.length ; i++) {
                idList[i]=new Integer(strList[i]);
            }
            int i = districtService.deleteMoreDistrict(idList);
            return "{\"result\":"+i+"}";
        }catch (Exception e){
            e.printStackTrace();//使用日志记录工具
            return "{\"result\":-1}";
        }
//        将字符串转换成数组


    }
//    public static void main(String[] args) {
//        //创建spring容器
//        //创建spring容器
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        //找对象调有
//        DistrictService streetService=(districtService)ctx.getBean("streetServiceImpl2");
//        System.out.println("街道个数是:"+streetService.getStreetByDistrict(1002).size());
//    }


}
