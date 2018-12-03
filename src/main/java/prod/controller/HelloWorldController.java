package prod.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prod.domain.User;
import prod.properties.NeoProperties;

/**
 * @author changbingbing
 * 2018年11月29日
 */
//@RestController 的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!!!";
	}
	
	@Cacheable(value="user-key")
	@RequestMapping("/hi")
	public List<User> hi() {
		ArrayList<User> list = new ArrayList<User>();
		User user = User.builder().name("张三").age(20).password("123456").build();
		User user2 = User.builder().name("李四").age(21).password("765432").build();
		list.add(user);
		list.add(user2);
		System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
		return list;
	}
	
	@Autowired
	private NeoProperties neoProperties;
	
	@RequestMapping("/studay")
	public String studay() {
		return neoProperties.toString();
	}
	
	@RequestMapping("/uid")
	public String uid(HttpSession session) {
		UUID attribute = (UUID) session.getAttribute("uid");
		if(null == attribute) {
			attribute = UUID.randomUUID();
			session.setAttribute("uid", attribute);
		}
		return session.getId();
	}
}
