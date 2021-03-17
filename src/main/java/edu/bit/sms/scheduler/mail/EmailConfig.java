package edu.bit.sms.scheduler.mail;
/*
 *Date : 9/8/2019
 *Time : 12:10 PM
 * For What :
 * Autor :  Uvindu Mohotti
 */


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class EmailConfig {

    @Value("${spring.mail.host}")
    private String host;

//    @Value("#{T(java.lang.Integer).parseInt('${spring.mail.port}')}")
    private int port;

    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.password}")
    private String password;

}
