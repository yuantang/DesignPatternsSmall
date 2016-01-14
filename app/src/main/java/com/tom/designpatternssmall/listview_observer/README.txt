模式的定义
定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。

模式的使用场景
关联行为场景。需要注意的是，关联行为是可拆分的，而不是“组合”关系；
事件多级触发场景；
跨系统的消息交换场景，如消息队列、事件总线的处理机制。

角色介绍

抽象主题 (Subject) 角色
抽象主题角色把所有观察者对象的引用保存在一个聚集（比如ArrayList对象）里，每个主题都可以有任意数量的观察者。
抽象主题提供一个接口，可以增加和删除观察者对象，抽象主题角色又叫做抽象被观察者(Observable)角色。

具体主题 (ConcreteSubject) 角色
将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知。
具体主题角色又叫做具体被观察者(Concrete Observable)角色。

抽象观察者 (Observer) 角色
为所有的具体观察者定义一个接口，在得到主题的通知时更新自己，这个接口叫做更新接口。

具体观察者 (ConcreteObserver) 角色
存储与主题的状态自恰的状态。具体观察者角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态
像协调。如果需要，具体观察者角色可以保持一个指向具体主题对象的引用。


进去BaseAdapter ListView 源码中查看：

到这里我们就知道了，当ListView的数据发生变化时，调用Adapter的notifyDataSetChanged函数，
这个函数又会调用DataSetObservable的notifyChanged函数，这个函数会调用所有观察者 (AdapterDataSetObserver)
的onChanged方法。这就是一个观察者模式！

最后我们再捋一捋,AdapterView中有一个内部类AdapterDataSetObserver,在ListView设置Adapter时会构建一个
AdapterDataSetObserver，并且注册到Adapter中，这个就是一个观察者。而Adapter中包含一个数据集可观察者
DataSetObservable，在数据数量发生变更时开发者手动调用AdapternotifyDataSetChanged，
而notifyDataSetChanged实际上会调用DataSetObservable的notifyChanged函数，该函数会遍历所有观察者的onChanged函数。
在AdapterDataSetObserver的onChanged函数中会获取Adapter中数据集的新数量，然后调用ListView的requestLayout()方法重
新进行布局，更新用户界面。

优点
观察者和被观察者之间是抽象耦合
缺点
观察者模式需要考虑一下开发效率和运行效率问题，一个被观察者，多个观察者，开发和调试就会比较复杂，
而且在 Java 中消息的通知默认是顺序执行，一个观察者卡壳，会影响整体的执行效率。在这种情况下，
一般考虑采用异步的方式。
