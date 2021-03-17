package edu.bit.sms.scheduler.mail;
/*
 *Date : 9/8/2019
 *Time : 12:18 PM
 * For What :
 * Autor :  Uvindu Mohotti
 */


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Feedback {


    private String email;

    private String username;

    private String password;

    private String subject;

    private String text;
}
