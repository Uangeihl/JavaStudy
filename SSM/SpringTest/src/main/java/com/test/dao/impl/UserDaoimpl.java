package com.test.dao.impl;

import com.test.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoimpl implements UserDao {
//    @Value("${name}")
//    private String name;
    public int printime(int id) {
        System.out.println("printime"+id);
        return (int) System.currentTimeMillis();
    }
    public void print() {
        System.out.println("UserDaoimpl");
    }
    /*private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void print() {
        System.out.println("UserDaoimpl");
        System.out.println("arrsy"+ Arrays.toString(array));
        System.out.println("list"+list);
        System.out.println("set"+set);
        System.out.println("map"+map);
        System.out.println("properties"+properties);
    }*/
    /*public void init(){
        System.out.println("init...");
    }
    public void destroy(){
        System.out.println("destroy...");
    }*/
}
