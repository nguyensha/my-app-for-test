package me.loda.spring.customconditional;
/*******************************************************
 * For Vietnamese readers:
 *    Các bạn thân mến, mình rất vui nếu project này giúp 
 * ích được cho các bạn trong việc học tập và công việc. Nếu 
 * bạn sử dụng lại toàn bộ hoặc một phần source code xin để 
 * lại dường dẫn tới github hoặc tên tác giá.
 *    Xin cảm ơn!
 *******************************************************/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import me.loda.spring.customconditional.AppConfiguration.SomeBean;

/**
 * Copyright 2019 {@author Loda} (https://loda.me).
 * This project is licensed under the MIT license.
 *
 * @since 6/3/2019
 * Github: https://github.com/loda-kun
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        try {
            SomeBean someBean = context.getBean(SomeBean.class);
            System.out.println("SomeBean tồn tại!");
        }catch (Exception e){
            System.out.println("SomeBean chỉ được tạo nếu chạy trên Window");
        }

    }
}
