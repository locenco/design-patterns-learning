装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构

模式包含角色 :
抽象构件类（Component）：给出一个抽象的接口，用以规范准备接收附加责任的对象
具体构件类（ConcreteComponent）：定义一个具体的准备接受附加责任的类，其必须实现Component接口。
装饰者类（Decorator）：持有一个构件（Conponent）对象的实例，并定义一个和抽象构件一致的接口。
具体装饰者类（ConcreteDecoratator）：定义给构件对象“贴上”附加责任。
