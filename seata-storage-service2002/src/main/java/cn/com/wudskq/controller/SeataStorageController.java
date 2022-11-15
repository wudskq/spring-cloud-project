package cn.com.wudskq.controller;

import cn.com.wudskq.service.SeataStorageService;
import cn.com.wudskq.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenfangchao
 * @title: SeataStorageController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:15 PM
 */
@RestController
public class SeataStorageController {

    @Autowired
    private SeataStorageService seataOrderService;


    @PostMapping("/storage/decrease")
    public CommonResult decreaseStorage(@RequestParam("productId")Long productId, @RequestParam("count")Integer count){
        seataOrderService.decreaseStorage(productId,count);
        return new CommonResult(200,"请求成功!");
    }



}
