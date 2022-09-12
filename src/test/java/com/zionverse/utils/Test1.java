package com.zionverse.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Session;
import javax.mail.Store;

import org.openqa.selenium.devtools.Message;

public class Test1 {
	public static void main(String[] args) {
		
        ReceiveMail("Inbox","SubjectContent","One Time Password (OTP):",6);

    }

        public static String ReceiveMail(String FolderName,String SubjectContent, String emailContent, int lengthOfOTP){


            String hostName = "imap.gmail.com";//change it according to your mail

            String username = "testerauto1406@gmail.com";//username 

            String password = "Avinash@123"; //password

            int messageCount;

            int unreadMsgCount;

            String emailSubject;

            javax.mail.Message emailMessage;

            String searchText=null ;

            Properties sysProps = System.getProperties();

            sysProps.setProperty("mail.store.protocol", "imaps");

            try {

                Session session = Session.getInstance(sysProps, null);

                Store store = session.getStore();

                store.connect(hostName, username, password);

                Folder emailBox = store.getFolder(FolderName);

                emailBox.open(Folder.READ_ONLY);

                messageCount = emailBox.getMessageCount();

                System.out.println("Total Message Count: " + messageCount);

                unreadMsgCount = emailBox.getNewMessageCount();

                System.out.println("Unread Emails count:" + unreadMsgCount);

                for(int i=messageCount; i>(messageCount-unreadMsgCount); i--)

                {

                    emailMessage = emailBox.getMessage(i);

                    emailSubject = emailMessage.getSubject();

                    if(emailSubject.contains(SubjectContent))

                    {

                        System.out.println("OTP mail found");

                        String line;

                        StringBuffer buffer = new StringBuffer();

                        BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));

                        while ((line = reader.readLine()) != null) {

                            buffer.append(line);

                        }

                        String messageContent=emailContent;

                        String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));

                        searchText = result.substring(messageContent.length(), messageContent.length()+lengthOfOTP);

                        System.out.println("Text found : "+ searchText);

                        emailMessage.setFlag(Flags.Flag.SEEN, true);

                        break;

                    }

                    emailMessage.setFlag(Flags.Flag.SEEN, true);

                }

                emailBox.close(true);

                store.close();


            } catch (Exception mex) {

                mex.printStackTrace();

                System.out.println("OTP Not found ");

            }

            return searchText ;

        }




        
    
}
