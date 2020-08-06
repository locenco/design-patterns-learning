package top.macondo.patterns.designpatterns.structural.composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/17 20:24
 **/
public class TransparentComposite {

	@Test
	public void testTransparentComposite() {
		//根节点
		Component root = new Composite("root");
		//树枝节点
		Component branchA = new Composite("--branchA");
		Component branchB = new Composite("--branchB");

		// 来一个叶子节点
		Component leafA = new Leaf("------leafA");
		Component leafB = new Leaf("---------leafB");
		Component leafC = new Leaf("---leafC");


		root.addChild(branchA);
		root.addChild(leafA);
		branchA.addChild(leafB);
		branchA.addChild(branchB);
		branchB.addChild(leafC);

		System.out.println(branchA.operation());
	}

	//抽象根节点
	static abstract class Component {
		protected String name;

		public Component(String name) {
			this.name = name;
		}

		public abstract String operation();

		public boolean addChild(Component component) {
			throw new UnsupportedOperationException("addChild not supported!");
		}

		public boolean removeChild(Component component) {
			throw new UnsupportedOperationException("removeChild not supported!");
		}

		public Component getChild(int index) {
			throw new UnsupportedOperationException("getChild not supported!");
		}
	}

	//树枝节点
	static class Composite extends Component {

		private List<Component> components;

		public Composite(String name) {
			super(name);
			this.components = new ArrayList<>();
		}

		@Override
		public String operation() {
			StringBuilder builder = new StringBuilder(this.name);
			for (Component component : this.components) {
				builder.append("\n");
				builder.append(component.operation());
			}
			return builder.toString();
		}

		@Override
		public boolean addChild(Component component) {
			return this.components.add(component);
		}

		@Override
		public boolean removeChild(Component component) {
			return this.components.remove(component);
		}

		@Override
		public Component getChild(int index) {
			return this.components.get(index);
		}
	}

	//叶子节点
	static class Leaf extends Component {

		public Leaf(String name) {
			super(name);
		}

		@Override
		public String operation() {
			return this.name;
		}
	}
}
