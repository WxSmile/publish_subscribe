package com.weixiao.publish_subscribe;

/**
 * Created by wangssmf on 2016/5/25.
 * email： wangssmf@hehenian.com
 * 功能：
 */
public class ObserverPatternDemo {

    public static void main(String[] args){

        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}