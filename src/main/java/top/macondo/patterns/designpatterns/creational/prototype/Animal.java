package top.macondo.patterns.designpatterns.creational.prototype;

/**
 * @program: designpatterns
 * @description: 动物接口
 * @author: Zhang Chong
 * @create: 2019-01-10 10:31
 **/
public abstract class Animal implements Cloneable {
	private String id;
	protected String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	abstract void infomation();

	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
