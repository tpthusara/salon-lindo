package edu.bit.sms.scheduler.service;
/*
 *Date : 9/8/2019
 *Time : 6:54 PM
 * For What :
 * Autor :  Uvindu Mohotti
 */


import edu.bit.sms.scheduler.mail.Feedback;

public interface EmailService {

     void sendSimpleMessage(Feedback feedback);

     void sendPasswordTOCLient(Feedback feedback);

    void sendMsg(Feedback feedback);
}
