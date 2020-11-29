### 背景
主要总结面试经常遇到的问题，方便复习，代码都很简单，很适合速食，突击面试，加油！
#### 设计模式
##### 创建型
###### 单例模式
- 场景：spring创建对象
- 优点：单例保证资源复用
- 缺点：修改对象的属性值，例如接口调用
- 设置：通过注解可设置为多例scope="prototype"
- 创建方式：双重锁检查，静态内部类，枚举形式创建

###### 工厂模式
- 描述：创建不同对象时，不用new直接创建，而交给一个工厂进行统一创建
- 场景：spring创建对象
- 优点：降低系统耦合性
- 工厂类型：简单工厂，抽象工厂，工厂方法
- 使用：通常结合自定义注解（@Interface）和枚举类，自定义工厂类实现ApplicationContextAware（可以顺带复习下生命周期），在spring启动时根据映射关系自动创建相应的工厂类

##### 行为型
###### 模板方法模式
- 描述：父类定义方法，并在前后设置before和after抽象方法。子类继承父类，重写before和after方法。
- 场景：spring的ioc流程，注册并解析beanDefinitions前后
- 优点：方便不影响原逻辑基础上进行扩展
- 使用：比如给用户进行授权，授权前发送短信，授权后通知其他服务



###### 责任链



##### 结构型
###### 装饰器模式
- 举例：抽象类A，两个实现类A1，A2；装饰器类A3，实现类A4；A4类的构造器派生父类A，A4 a4(A)，可将A1和A2传入A4。
- 场景：InputStream抽象类，FilterInputStream装饰类，BufferedInputStream和GZIPInputStream子类
- 优点：动态的给子类添加部分功能
- TODO

###### 代理模式
- 优点：通过代理对原有的类进行加强
- 场景：RPC框架的服务调用层、Spring AOP的通知增强
- 类型：
  - 静态代理：
    - 方式：接口A，实现类B，代理类C实现接口A，并且依赖实现类C
  - 缺点：不够灵活
  - 动态代理：
    - Jdk动态代理（基于接口，实现InvocationHandler，覆盖invoke方法）
    - CgLib动态代理（基于具体的类)

- 被final修饰无法代理