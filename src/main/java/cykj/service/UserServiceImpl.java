package cykj.service;


/**
 * @version 1.0
 * @author: Malin
 * @date: 2021/6/18 14:39
 * @desc:
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add(String name,String password) {
        System. out.println("增加方法进来了=======");
    }

    @Override
    public void update() {
        System.out.println("修改方法进来了=======");
    }

    @Override
    public void delete() {
        System.out.println("删除方法进来了=======");
    }

    @Override
    public void select() {
        System.out.println("查询方法进来了=======");
    }
}
