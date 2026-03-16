package main;

import org.springframework.stereotype.Service;


@Service("UserService")
public class UserService {
    public static void sayHello() {
        System.out.println("hello");
    }
}
