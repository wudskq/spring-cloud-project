package cn.com.wudskq.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author chenfangchao
 * @title: LoadBalancer
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/24 9:51 PM
 */
public interface LoadBalancer {

    /**
     * 初始化时获取注册的服务列表
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances (List<ServiceInstance> serviceInstances);
}
