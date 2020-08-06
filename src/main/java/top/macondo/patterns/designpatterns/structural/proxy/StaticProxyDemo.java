package top.macondo.patterns.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/10 22:10
 **/
public class StaticProxyDemo {
	@Test
	public void staticProxy() {
		BuyHouse buyHouse = new BuyHouseImpl();
		buyHouse.buyHouse();

		BuyHouseProxy proxy = new BuyHouseProxy(buyHouse);
		proxy.buyHouse();
	}

	interface BuyHouse {
		void buyHouse();
	}

	class BuyHouseImpl implements BuyHouse {

		@Override
		public void buyHouse() {
			System.out.println("面朝大海，春暖花开");
		}
	}

	class BuyHouseProxy implements BuyHouse {

		private BuyHouse buyHouse;

		public BuyHouseProxy(final BuyHouse buyHouse) {
			this.buyHouse = buyHouse;
		}

		@Override
		public void buyHouse() {
			System.out.println("存钱买房");
			buyHouse.buyHouse();
			System.out.println("吃土");
		}
	}

}
