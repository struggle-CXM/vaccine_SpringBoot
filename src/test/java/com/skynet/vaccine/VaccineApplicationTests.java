package com.skynet.vaccine;

import com.skynet.vaccine.entity.user;
import com.skynet.vaccine.mapper.usermapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Scanner;

@SpringBootTest
class VaccineApplicationTests {

    @Autowired
    private usermapper usermapper;
    @Test
    void contextLoads() {
    }

    @Test
    public void testFindAll(){
//        Scanner sc = new Scanner(System.in);
//        String username = sc.nextLine();
//        String password = sc.nextLine();
        user user = usermapper.checkuserLogin("123","123");
        System.out.println(user);

    }

}
