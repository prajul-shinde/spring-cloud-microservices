package com.csi.user.service.valueobjects;

import com.csi.user.service.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
    private User user;
    private Department department;
}
