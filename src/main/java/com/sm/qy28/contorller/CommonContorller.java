package com.sm.qy28.contorller;

import com.sm.qy28.common.EmailUtils;
import com.sm.qy28.common.SpringDataRedis;
import com.sm.qy28.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("common")
public class CommonContorller {

   @Autowired
    private EmailUtils emailUtils;
   @Autowired
   private SpringDataRedis redis;
   @Autowired
   private EmployeeService employeeService;

   @GetMapping("{email}")
   public void senemail(@PathVariable String email){

       if(employeeService.selectByemail(email)){
           String s = emailUtils.sendEmail(email);
           System.out.println(s);
           redis.toredis(email,s);
       }else {
           System.out.println("不存在用户");
       }

   }


}
