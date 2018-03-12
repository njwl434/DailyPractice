package com.wl.dailypractice.staticproxy;

/**
 * @describe: DailyPractice
 * @author: 武梁
 * @date: 2018/3/12 11:46
 * @mailbox: 1034905058@qq.com
 */

public class UserProxy implements UserPort {
    private User user;
    public UserProxy(User user){
        this.user=user;
    }

    @Override
    public String getName() {
        String name=user.getName();
        return name+"代理";
    }

    @Override
    public int getAge() {
        int age=user.getAge();
        return age+1;
    }

    @Override
    public String getSix() {
        String six=user.getSix();
        return six+"代理";
    }
}
