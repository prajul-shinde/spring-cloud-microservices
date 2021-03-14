package com.csi.user.service.service;

import com.csi.user.service.entity.User;
import com.csi.user.service.repository.UserRepository;
import com.csi.user.service.valueobjects.Department;
import com.csi.user.service.valueobjects.ResponseTemplateVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {

    private UserRepository repository;

    private RestTemplate restTemplate;


    public User saveUser(User user) {
        log.info("inside saveUser method of userService");
        return repository.save(user);
    }


    public ResponseTemplateVo getUserWithDepartment(Long userId) {
        log.info("inside getUserWithDepartment method of UserService");
        ResponseTemplateVo vo=new ResponseTemplateVo();
        User user=repository.findByUserId(userId);
        Department department=
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;

    }
}
