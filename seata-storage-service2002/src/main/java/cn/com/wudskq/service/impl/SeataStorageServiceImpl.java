package cn.com.wudskq.service.impl;

import cn.com.wudskq.mapper.SeataStorageMapper;
import cn.com.wudskq.service.SeataStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenfangchao
 * @title: SeataStorageService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 5:08 PM
 */
@Service
public class SeataStorageServiceImpl implements SeataStorageService {

    @Autowired
    private SeataStorageMapper seataStorageMapper;


    @Override
    public void decreaseStorage(Long productId, Integer count) {
        seataStorageMapper.decreaseStorageByProductId(productId,count);
    }
}
