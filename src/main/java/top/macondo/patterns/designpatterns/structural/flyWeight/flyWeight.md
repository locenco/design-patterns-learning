定义: 使用共享对象可有效的支持大量的细粒度的对象
其中的角色:
Flyweight 抽象享元角色: 简单地说就是一个产品的抽象类,同时定义出对象的外部状态和内部状态的接口或实现
ConcreteFlyweight 具体享元角色: 具体的一个产品类, 实现抽象角色定义的业务. 该角色需要注意的是内部状态处理应该与环境无关,不应该初恋一个操作改变了内部状态,同时修改了外部状态, 这是角色不允许的
FlyweightFactory 享元工厂: 职责非常简单, 就是构造一个池容器,同时提供从池中获得对象的方法

### 享元模式的应用
享元模式的优点和缺点:
享元模式是一个非常简单的模式, 它可以大大减少应用程序创建的对象,减低程序内存的占用,增强程序的性能,但它同时也提高了系统复杂性,需要分离出外部状态和内部状态, 而且外部状态具有固化特性,不应该随内部状态改变而改变,否则导致系统的逻辑混乱
享元模式的使用场景:

系统中存在大量的相似对象
细粒度的对象都具备较接近的外部状态,而且内部状态与环境无关,也就是说对象没有特定身份
需要缓冲池的场景
享元模式的扩展
1.线程安全的问题

当使用享元模式时, 对象池中的角色数量是一定的, 可能在拿的时候不同线程同时拿到同一个对象.这是就出现线程不安全的问题了

我们在使用享元模式时要注意这个问题. 我们在使用享元模式时,对象池中的享元对象尽量多, 多到足够满足业务为止

2.性能平衡

既然是面向对象编程, 我们何不将外部状态抽离出来,定义为一个对象呢?

经过测试, 外部状态使用对象要比使用基本类型效率低. 所以, 外部状态最好以Java的基本类型作为标志, 如stirng、int等, 可以大幅的提升效率

享元模式在Java API中也是随处可见. 如Java的String，Integer就实现了对象池。Apache Commons Pool2

需要说明一下的是,虽然可以使用享元模式实现对象池, 但是这两者还是有比较大的差异, 对象池着重在对象的复用上,池中的每个对象是可替换的,从同一个池中获得的A对象和B对象对客户端来说是完全相同的,它主要解决复用,而享元模式主要解决对象的共享问题,如何建立多个可共享的细粒度对象是其关注的重点.
