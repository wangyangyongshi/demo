package com.example.demo.root;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.junit.Test;

/**
 * @author:wangyang
 * @creatDate:2019-12-08
 **/
public class Zookeepertest {

    @Test
    public void createNode() throws Exception{

        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 1);

        //获取客户端对象
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181",
                1000, 1000, retryPolicy);

        //调用start开启客户端操作
        client.start();

        //通过create 来进行创建节点,并且需要指定节点类型
//        client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/hello3/world");
        System.out.println("完成");
//        client.close();




        try {
            client.setData().forPath("/hello3/world", "wangyang".getBytes());
        } catch (Exception e) {
            System.out.println("更新节点数据失败, elog=" + e.getMessage());
        }


    }
}
