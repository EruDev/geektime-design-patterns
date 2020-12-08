package com.erudev.design.behavioral.template.run;


import com.erudev.design.behavioral.template.EmailSender;
import com.erudev.design.behavioral.template.SmsSender;

/**
 * <p>
 * 模板模式，测试类
 * </p>
 *
 */
public class PatternTest {
    public static void main(String[] args) {
        // 邮件发送
        EmailSender emailSender = new EmailSender();
        emailSender.send("测试内容");

        // 短信发送
        SmsSender smsSender = new SmsSender();
        smsSender.send("17312341234");
    }
}
