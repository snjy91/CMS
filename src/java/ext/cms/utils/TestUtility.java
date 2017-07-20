/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext.cms.utils;

import ext.cms.model.LoginBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ATKARS
 */
public class TestUtility
{

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/applicationContext.xml");

        HibernateManager hibernateManager =context.getBean(HibernateManager.class);

        LoginBean loginBean = new LoginBean();

        loginBean.setUsername("Sanjay");
        loginBean.setPassword("Sanja@123");
        hibernateManager.save(loginBean);
        context.close();

    }

}
