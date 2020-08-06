package top.macondo.patterns.designpatterns.structural.decorator;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/17 8:48
 **/
public class Decorator implements Component {

	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public String login(String username, String password) {
		return component.login(username, password);
	}

	public String loginForWx(String username, String password) {
		return "微信用户：" + username + " 登录成功";
	}
}
