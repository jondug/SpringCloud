package org.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "user-server")
public interface AdminService {

    @GetMapping("user/userInfo")
    public String listUserInfo();
}
