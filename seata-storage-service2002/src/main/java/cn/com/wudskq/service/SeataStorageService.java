package cn.com.wudskq.service;

/**
 * @author chenfangchao
 * @title: SeataStorageService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 5:08 PM
 */
public interface SeataStorageService {

    /**
     * 根据商品ID减少库存
     * @param productId
     * @param count
     */
    void decreaseStorage(Long productId,Integer count);
}
