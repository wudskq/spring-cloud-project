package cn.com.wudskq.service.impl;

import cn.com.wudskq.dto.SeataStorage;
import cn.com.wudskq.mapper.SeataStorageMapper;
import cn.com.wudskq.service.SeataStorageService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
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
        QueryWrapper<SeataStorage> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("product_id",productId);
        SeataStorage seataStorage = seataStorageMapper.selectOne(queryWrapper);
        //已使用库存增加
        seataStorage.setUsed(seataStorage.getUsed()+count);
        //剩余库存减少
        seataStorage.setResidue(seataStorage.getResidue()-count);
        //更新
        UpdateWrapper<SeataStorage> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("product_id",productId);
        seataStorageMapper.update(seataStorage,updateWrapper);
    }
}
