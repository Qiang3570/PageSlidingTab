# PageSlidingTab

类似新闻客户端，应用市场，等基本项目框架，拿过去就能用等代码

自定义view，PageSlidingTab，封装了ViewPageIndicator控制viewpage

并使用fragment与该view进行关联，方便界面之间通信

逻辑操作都在base与自定义view里面，子类只需实现初始化view与访问网络并返回相关数据即可，具体代码里有示例

并使用了DrawerLayout增加侧滑菜单，actionbar点击动画弹出（滑动）关闭，

如果indicator数目过多你只需删除这里与FragmentFactory中对应的framgnet即可！！！

![](https://github.com/Qiang3570/PageSlidingTab/blob/master/img/97254E17-1356-408C-81E2-7284A7EF5995.png)
![](https://github.com/Qiang3570/PageSlidingTab/blob/master/img/BCBC56ED-0DC9-4F5F-972E-D1A572551647.png)

最后附上示例图

![](https://github.com/Qiang3570/PageSlidingTab/blob/master/sample.gif)
