模式的定义
	定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

使用场景
1、多个子类有公有的方法，并且逻辑基本相同时。
2、重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
3、重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。

简单示例
	模板方法实际上是封装一个算法框架，就像是一套模板一样。而子类可以有不同的算法实现，在框架不被修改的情况下实现算法的替换。下面我们以开电脑这个动作来简单演示一下模板方法。开电脑的整个过程都是相对稳定的，首先打开电脑电源，电脑检测自身状态没有问题时将进入操作系统，对用户进行验证之后即可登录电脑，下面我们使用模板方法来模拟一下这个过程。

Android 源码中AsyncTask使用的就是模板模式，可以进入源码查看究竟。
优点与缺点
优点：
	1、封装不变部分，扩展可变部分
	2、提取公共部分代码，便于维护

缺点:
	模板方法会带来代码阅读的难度，会让心觉得难以理解。