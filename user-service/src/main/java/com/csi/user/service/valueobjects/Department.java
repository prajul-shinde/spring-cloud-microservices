package com.csi.user.service.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department{

    private Long departmentID;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
