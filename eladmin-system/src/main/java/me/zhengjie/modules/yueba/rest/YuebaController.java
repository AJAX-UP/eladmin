package me.zhengjie.modules.yueba.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.zhengjie.aop.log.Log;
import me.zhengjie.modules.yueba.service.YuebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @author cgj
* @date 2019-11-05
*/
@Api(tags = "Yueba管理")
@RestController
@RequestMapping("/api/yueba")
public class YuebaController {

    @Autowired
    private final YuebaService yuebaService;

    public YuebaController(YuebaService yuebaService) {
        this.yuebaService = yuebaService;
    }
    @Log("查询Yueba")
    @ApiOperation("查询Yueba")
    @GetMapping(value = "/list")
    //@PreAuthorize("@el.check('yueba:list')")
    public ResponseEntity getYuebas(){
        return new ResponseEntity<>(yuebaService.findById(1l),HttpStatus.OK);
    }

}