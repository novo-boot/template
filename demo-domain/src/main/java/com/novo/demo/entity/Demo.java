package com.novo.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author fuqf1
 * @since 2022-03-09
 */
@Data
@Accessors(chain = true)
@Schema(description = "Demo对象")
@EqualsAndHashCode(callSuper = false)
public class Demo implements Serializable {

    private static final long serialVersionUID = 2019859925638481536L;

    @Schema(description = "消息名称")
    private Integer demo;

}
