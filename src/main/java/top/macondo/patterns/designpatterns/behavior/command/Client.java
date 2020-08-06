package top.macondo.patterns.designpatterns.behavior.command;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/27 10:27
 **/

/**
 * 调用者
 */
class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void action() {
		this.command.execute();
	}
}

/**
 * 声明命令
 */
abstract class Command {
	public abstract void execute();
}

/**
 * command 实现类
 */
class ConcreteCommand extends Command {
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.doSomething();
	}
}

/**
 * 接收者
 */
class Receiver {
	public void doSomething() {
		System.out.println("接受者-业务逻辑处理");
	}
}

public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		//客户端直接执行具体命令方式（此方式与类图相符）
		command.execute();

		//客户端通过调用者来执行命令
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.action();
	}
}
