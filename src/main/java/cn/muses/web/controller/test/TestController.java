/**
 * Copyright 2022 All rights reserved.
 */

package cn.muses.web.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.muses.web.controller.BaseController;
import cn.muses.web.model.dto.BaseResponseDTO;
import cn.muses.web.service.test.TestService;

/**
 * @author jervis
 * @date 2022/11/15.
 */
@RestController
@RequestMapping("test")
public class TestController extends BaseController {

    @Autowired
    private TestService testService;

    @GetMapping("get")
    public BaseResponseDTO<String> get() {
        return this.returnWithSuccess(testService.test());
    }
}
