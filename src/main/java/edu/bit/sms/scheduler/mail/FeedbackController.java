package edu.bit.sms.scheduler.mail;
/*
 *Date : 9/8/2019
 *Time : 12:21 PM
 * For What :
 * Autor :  Uvindu Mohotti
 */


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;

@CrossOrigin
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private EmailConfig emailConfig;

    public FeedbackController(EmailConfig emailConfig) {
        this.emailConfig = emailConfig;
    }

    @PostMapping(value = "/mail")
    public  void  sendFeedBack(@RequestBody Feedback feedback , BindingResult bindingResult) throws ValidationException {
//        if (bindingResult.hasErrors()){
//            throw new ValidationException("Feedback is not Valid");
//        }

        JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPassword("1234@abc");
        mailSender.setPort(587);
        mailSender.setUsername("mpink3950@gmail.com");

        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom(feedback.getEmail());
        mailMessage.setTo("mpink3950@gmail.com");
//        mailMessage.setSubject("new Feedback from"+feedback.getName());
//        mailMessage.setText(feedback.getFeedback());

        mailSender.send(mailMessage);

    }
}
