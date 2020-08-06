package top.macondo.patterns.designpatterns.structural.decorator;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/17 8:47
 **/
public class ConcreteComponent implements Component {
	@Override
	public String login(String username, String password) {
		return "用户：" + username + " 登录成功";
	}
}
