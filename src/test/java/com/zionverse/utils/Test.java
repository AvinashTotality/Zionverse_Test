package com.zionverse.utils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import javax.mail.Store;

import com.testing.framework.EmailUtils;

public class Test {

	public static void main(String[] args) throws Exception {

		EmailUtils email = new EmailUtils();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"/Users/avinash/eclipse-workspace/Project_ZV/Zionverse_Test/Config/GmailConfig.properties");
		prop.load(fis);
		Store connection = email.connectToGmail(prop);

		List<String> emailtext = email.getMessageByFromEmail(connection, "Inbox", "noreply@zionversesupport.com", "Zionverse Account Verification");

		if (emailtext.size() < 1) {
			throw new Exception("No email recieved");

		}
		else {
			String regex="[^\\d]+";
			String [] otp=emailtext.get(0).split(regex);
			System.out.println("OTP is"+ otp);
					
		}
	}

}
