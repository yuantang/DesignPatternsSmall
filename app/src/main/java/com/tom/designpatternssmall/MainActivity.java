package com.tom.designpatternssmall;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.tom.designpatternssmall.listview_observer.AndroidWeekly;
import com.tom.designpatternssmall.listview_observer.Coder;
import com.tom.designpatternssmall.simplefactory.Iphone;
import com.tom.designpatternssmall.simplefactory.IphoneFactory;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppBaseActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.simplefactory_text)
    TextView simplefactoryText;
    @Bind(R.id.factory_text)
    TextView factoryText;
    @Bind(R.id.abstractfactory_text)
    TextView abstractfactoryText;
    @Bind(R.id.singleton_text)
    TextView singletonText;
    @Bind(R.id.prototype_text)
    TextView prototypeText;
    @Bind(R.id.Builder_text)
    TextView BuilderText;
    @Bind(R.id.template_text)
    TextView templateText;
    @Bind(R.id.listview_adapter_text)
    TextView listviewAdapterText;
    @Bind(R.id.listview_observer_text)
    TextView listviewObserverText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    public void initView() {
        setSupportActionBar(toolbar);
    }

    public void initData() {

    }

    @OnClick({R.id.simplefactory_text,R.id.listview_observer_text})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.simplefactory_text:
                creatIphone();
                break;
            case R.id.listview_observer_text:
                createObserver();
                break;
        }
    }

    private void createObserver() {
        // 被观察的角色
        AndroidWeekly androidWeekly=new AndroidWeekly();
        // 观察者
        Coder coder1=new Coder("jeery");
        Coder coder2=new Coder("Tom");
        Coder coder3=new Coder("rung");
        // 将观察者注册到可观察对象的观察者列表中
        androidWeekly.addObserver(coder1);
        androidWeekly.addObserver(coder2);
        androidWeekly.addObserver(coder3);
        //发布消息
        androidWeekly.postNewPublication("新的一期AndroidWeekly来啦!");
    }

    private void creatIphone() {
        Iphone iphone6 = IphoneFactory.createIphone("iphone6");
        iphone6.call();
        iphone6.sendMessage();
        iphone6.surfTheInternet();
        iphone6.takePicture();

        Iphone iphone6s = IphoneFactory.createIphone("iphone6s");
        iphone6s.call();
        iphone6s.sendMessage();
        iphone6s.surfTheInternet();
        iphone6s.takePicture();

    }

}
