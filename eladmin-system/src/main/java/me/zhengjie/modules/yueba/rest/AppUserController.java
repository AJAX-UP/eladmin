package me.zhengjie.modules.yueba.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import me.zhengjie.aop.log.Log;
import me.zhengjie.modules.yueba.domain.User;
import me.zhengjie.modules.yueba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
* @author cgj
* @date 2019-11-05
*/
@Api(tags = "app:用户管理")
@RestController
@RequestMapping("/app/user")
public class AppUserController {

    @Autowired
    private  UserService userService;

    @Log("查询Yueba")
    @ApiOperation("查询Yueba")
    @PostMapping(value = "/list")
    //@PreAuthorize("@el.check('yueba:list')")
    public ResponseEntity getYuebas(@RequestParam @ApiParam(name = "phone", value = "手机号") String phone,
                                    @RequestParam @ApiParam(name = "key", value = "key值") String key,
                                    @RequestParam @ApiParam(name = "sign", value = "sign值") String sign,
                                    HttpServletRequest request){
        User u=userService.findById(1l);
        return new ResponseEntity<>(userService.findById(1l),HttpStatus.OK);
    }

}