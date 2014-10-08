package dn.cs.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 	@版权所有 聚光科技（杭州）股份有限公司
 * 
 */
/**
 * Date: 2014-10-8
 * 
 * @author hewen_deng
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml", "/dispatcherServlet.xml"})
public class SimpleControllerTest {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private SimpleController simpleController;
	
	@Test
	public void doSmallTest() {
		System.out.println(jdbcTemplate);
	}
	
	@Test
	public void getSimpleViewTest() {
		String view = simpleController.getSimpleView();
		System.out.println(view);
	}
	
}