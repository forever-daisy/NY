package cn.kgc.utils;

/**
 * @author 王建兵
 * @Classname UserCondition
 * @Description TODO
 * @Date 2019/12/24 10:58
 * @Created by Administrator
 */
//搜索用户的条件实体类
public class UserCondition extends  PageUtil {
    //封装查询条件的
    private String name;
    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
