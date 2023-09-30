package com.aurora.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "登录")
public class UserLogin {
//    @NotBlank(message = "username不能为空")
    private String username;
//    @NotBlank(message = "password不能为空")
    private String password;
}
