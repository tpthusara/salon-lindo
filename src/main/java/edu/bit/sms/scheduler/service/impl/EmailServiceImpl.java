/*
 *Time   :- 4:29 AM
 *Author :- Uvindu Mohotti
 *Special Thing :-
 */

package edu.bit.sms.scheduler.service.impl;



import edu.bit.sms.scheduler.mail.Feedback;
import edu.bit.sms.scheduler.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Override
    public void sendSimpleMessage(Feedback feedback) {
        feedback.setText(feedback.getUsername()+"  sir/miss/mis,\n\nThank you for Select us to visit Srilanka . We Offer you good Tours \n Serendib Team");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(feedback.getEmail());
        message.setSubject("Welcome "+feedback.getUsername()+" Serendib Web .");
        message.setText(feedback.getText());

        emailSender.send(message);
    }

    @Override
    public void sendPasswordTOCLient(Feedback feedback) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(feedback.getEmail());
        message.setSubject(feedback.getSubject());
        message.setText(feedback.getText()+"\n  Username  : "+feedback.getUsername() +"\n   Password   :  "+feedback.getPassword() +"\n Thank You \n Serendib Team");

        emailSender.send(message);
    }

    @Override
    public void sendMsg(Feedback feedback) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("travelserendib98@gmail.com");
        message.setFrom(feedback.getEmail());
        message.setSubject("You Have New Message From "+feedback.getUsername());
        message.setText(feedback.getText()+"\n"+feedback.getPassword());

        emailSender.send(message);
    }
}

