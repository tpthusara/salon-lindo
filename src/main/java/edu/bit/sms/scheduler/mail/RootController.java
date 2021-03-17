package edu.bit.sms.scheduler.mail;

import edu.bit.sms.scheduler.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RootController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/send-mail")
    public void sendMail(@RequestBody Feedback feedback) {

        emailService.sendSimpleMessage(feedback);

    }

    @RequestMapping("/sendpassword")
    public void sendPassword(@RequestBody Feedback feedback) {
		feedback.setSubject("About Your Serendib Web Account Privacy Details");
        feedback.setText("Thank you for Join with us ! here is your username and password for your account serendib web account . Here we go");
        emailService.sendPasswordTOCLient(feedback);

    }

	@RequestMapping("/sendmsg")
	public void sendmsg(@RequestBody Feedback feedback) {
		emailService.sendMsg(feedback);
	}

}
