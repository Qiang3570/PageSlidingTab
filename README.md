# PageSlidingTab

类似新闻客户端，应用市场，购物等应用基本架构。

界面等待加载状态，子类实现相应方法返回数据即可。

具体三种状态：加载中，加载失败，加载为空

  * 自定义view，PageSlidingTab，封装了ViewPageIndicator控制ViewPage，且保留了预加载特性。
  
  * 使用fragment与该view进行关联，方便界面之间通信。
  
  * 使用了DrawerLayout增加侧滑菜单，actionbar点击动画弹出（滑动）关闭效果。
  
  * 逻辑操作都在base与自定义view里面，子类只需实现初始化view与访问网络并返回相关数据即可。
  
  * 如果indicator数目过多你只需删除values与FragmentFactory中对应的framgnet即可！！！

* 以下是动态示例图

![](https://github.com/Qiang3570/PageSlidingTab/blob/master/sample.gif)
