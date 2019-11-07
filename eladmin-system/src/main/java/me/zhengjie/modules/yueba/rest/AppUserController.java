package me.zhengjie.modules.yueba.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import me.zhengjie.modules.monitor.service.RedisService;
import me.zhengjie.modules.yueba.service.UserService;
import me.zhengjie.modules.yueba.utils.sms.XUSmsUtils;
import me.zhengjie.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private  RedisService redisService;

    @ApiOperation("查询用户")
    @PostMapping(value = "/findUserById")
    public ResponseEntity findUserById(@RequestParam @ApiParam(name = "id", value = "手机号") Long id,
                                   HttpServletRequest request){
        return new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    }


    @ApiOperation("获取手机验证码")
    @PostMapping(value = "/getCode")
    public ResponseEntity getCode(@RequestParam @ApiParam(name = "phone", value = "手机号") String phone,
                                    HttpServletRequest request){
        return new ResponseEntity<>(XUSmsUtils.getSms(phone, "",redisService),HttpStatus.OK);
    }

    @ApiOperation("app登录")
    @PostMapping(value = "/appLogin")
    public ResponseEntity appLogin(@RequestParam @ApiParam(name = "phone", value = "手机号") String phone,
                                   @RequestParam @ApiParam(name = "code", value = "验证码") String code,
                                  HttpServletRequest request){
        String redisCode = redisService.getCodeVal(code);
        if (StringUtils.isBlank(redisCode)) {
            return new ResponseEntity<>("验证码已过期",HttpStatus.UNAUTHORIZED);
        }
        if (StringUtils.isBlank(code) || !code.equalsIgnoreCase(redisCode)) {
            return new ResponseEntity<>("验证码错误",HttpStatus.UNAUTHORIZED);
        }
        if(!"".equals(redisCode)&&code.equals(redisCode)&&null!=redisCode){
            //查询用户，1,有返回当前用户 2,没有就创建用户
            return new ResponseEntity<>("",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("未知错误",HttpStatus.UNAUTHORIZED);
        }
    }

}