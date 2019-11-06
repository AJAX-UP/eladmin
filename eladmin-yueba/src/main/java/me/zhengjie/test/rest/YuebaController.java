package me.zhengjie.test.rest;

import me.zhengjie.aop.log.Log;
import me.zhengjie.test.domain.Yueba;
import me.zhengjie.test.service.YuebaService;
import me.zhengjie.test.service.dto.YuebaQueryCriteria;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @author cgj
* @date 2019-11-05
*/
@Api(tags = "Yueba管理")
@RestController
@RequestMapping("/api/yueba")
public class YuebaController {

    private final YuebaService yuebaService;

    public YuebaController(YuebaService yuebaService) {
        this.yuebaService = yuebaService;
    }

    @Log("导出数据")
    @ApiOperation("导出数据")
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('yueba:list')")
    public void download(HttpServletResponse response, YuebaQueryCriteria criteria) throws IOException {
        yuebaService.download(yuebaService.queryAll(criteria), response);
    }

    @GetMapping
    @Log("查询Yueba")
    @ApiOperation("查询Yueba")
    @PreAuthorize("@el.check('yueba:list')")
    public ResponseEntity getYuebas(YuebaQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(yuebaService.queryAll(criteria,pageable),HttpStatus.OK);
    }

    @PostMapping
    @Log("新增Yueba")
    @ApiOperation("新增Yueba")
    @PreAuthorize("@el.check('yueba:add')")
    public ResponseEntity create(@Validated @RequestBody Yueba resources){
        return new ResponseEntity<>(yuebaService.create(resources),HttpStatus.CREATED);
    }

    @PutMapping
    @Log("修改Yueba")
    @ApiOperation("修改Yueba")
    @PreAuthorize("@el.check('yueba:edit')")
    public ResponseEntity update(@Validated @RequestBody Yueba resources){
        yuebaService.update(resources);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/{id}")
    @Log("删除Yueba")
    @ApiOperation("删除Yueba")
    @PreAuthorize("@el.check('yueba:del')")
    public ResponseEntity delete(@PathVariable Long id){
        yuebaService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}