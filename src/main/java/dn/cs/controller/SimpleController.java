/**
 * 	@版权所有 聚光科技（杭州）股份有限公司
 * 
 */
package dn.cs.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date: 2014-10-8
 * 
 * @author hewen_deng
 * @version 1.0
 */
@Controller
@RequestMapping("view")
public class SimpleController {
	
	private static Logger _log = Logger.getLogger(SimpleController.class);
	
	@Autowired
	SqlMapClientFactoryBean sqlMapClient;
	
	@RequestMapping("view")
	public String getSimpleView() {
		System.out.println(sqlMapClient);
		return "simple";
	}
	
}