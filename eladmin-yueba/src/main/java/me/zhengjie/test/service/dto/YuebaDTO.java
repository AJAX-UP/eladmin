package me.zhengjie.test.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.io.Serializable;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;


/**
* @author cgj
* @date 2019-11-05
*/
@Data
public class YuebaDTO implements Serializable {

    // 处理精度丢失问题
    @JsonSerialize(using= ToStringSerializer.class)
    private Long id;

    private String name;

    private Boolean enabled;

    private Long sort;

    private Long deptId;

    private Timestamp createTime;
}