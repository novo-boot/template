package com.novo.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author fuqf1 此model是webservice接口返回格式的model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Schema(description = "DemoVO")
public class DemoVO implements Serializable {

    private static final long serialVersionUID = -7155224832435283462L;

    /**
     * name
     */
    private String name;

}
