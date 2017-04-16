package com.binhua.decorator.example02;

/**具体构件角色
 * Created by shaobinhua on 2017/4/16.
 */
public class Employe implements DoProjecter {
    @Override
    public void doCoding() {
        System.out.println("代码工人在编写代码，终于编完了！");
    }
}
