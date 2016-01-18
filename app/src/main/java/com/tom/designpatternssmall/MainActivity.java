package com.tom.designpatternssmall;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.tom.designpatternssmall.Builder.ApplePCBuilder;
import com.tom.designpatternssmall.Builder.Builder;
import com.tom.designpatternssmall.Builder.Director;
import com.tom.designpatternssmall.abstractfactory.AppFactory;
import com.tom.designpatternssmall.abstractfactory.ImageEditor;
import com.tom.designpatternssmall.abstractfactory.MacAppFactory;
import com.tom.designpatternssmall.abstractfactory.TextEditor;
import com.tom.designpatternssmall.abstractfactory.WindowsAppFactory;
import com.tom.designpatternssmall.factory.MacWindThemeFactory;
import com.tom.designpatternssmall.factory.ThemeFactory;
import com.tom.designpatternssmall.factory.UbuntuWindThemeFactory;
import com.tom.designpatternssmall.factory.WindowStyle;
import com.tom.designpatternssmall.listview_adapter.ClassAdapter;
import com.tom.designpatternssmall.listview_observer.AndroidWeekly;
import com.tom.designpatternssmall.listview_observer.Coder;
import com.tom.designpatternssmall.prototype.WordDocument;
import com.tom.designpatternssmall.simplefactory.Iphone;
import com.tom.designpatternssmall.simplefactory.IphoneFactory;
import com.tom.designpatternssmall.template.AbstractComputer;
import com.tom.designpatternssmall.template.CoderComputer;
import com.tom.designpatternssmall.template.MilitaryComputer;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppBaseActivity {

    private static final String TAG ="MainActivity" ;
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

    @OnClick({R.id.simplefactory_text,R.id.listview_observer_text,R.id.Builder_text,
            R.id.abstractfactory_text,R.id.factory_text,R.id.prototype_text,
            R.id.template_text,R.id.listview_adapter_text})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.simplefactory_text:
                creatIphone();
                break;
            case R.id.listview_observer_text:
                createObserver();
                break;
            case R.id.Builder_text:
                builderComputer();
                break;
            case R.id.abstractfactory_text:
                absFactory();
                break;
            case R.id.factory_text:
                factory();
                break;
            case R.id.prototype_text:
                prototype();
                break;
            case R.id.template_text:
                template();
                break;
            case R.id.listview_adapter_text:
                ClassAdapter adapter=new ClassAdapter();
                Log.d(TAG,"输出电压："+adapter.getVolt5());
                break;
        }
    }

    private void template() {
        AbstractComputer computer=new CoderComputer();
        computer.startUp();
        computer=new MilitaryComputer();
        computer.startUp();
    }

    private void prototype()   {
//        WordDocument wordDocument=new WordDocument();
//        wordDocument.setText("这是一遍文章的标题");
//        wordDocument.addImge("图片1");
//        wordDocument.addImge("图片2");
//        wordDocument.addImge("图片3");
//        wordDocument.addImge("图片4");
//        wordDocument.addImge("图片5");
//        wordDocument.showDocument();
//        WordDocument wordDocument2=new WordDocument();
//        wordDocument2.showDocument();
//        wordDocument2.setText("修改过后的文章标题");
//        wordDocument2.showDocument();
//        wordDocument.showDocument();

        WordDocument wordDocument=new WordDocument();
        wordDocument.setText("这是一遍文章的标题");
        wordDocument.addImge("图片1");
        wordDocument.addImge("图片2");
        wordDocument.addImge("图片3");
        wordDocument.addImge("图片4");
        wordDocument.addImge("图片5");
        wordDocument.showDocument();
        WordDocument wordDocument2=wordDocument.clone();
        wordDocument2.showDocument();
        wordDocument2.setText("修改过后的文章标题");
        wordDocument2.addImge("hahahah.jpg");
        wordDocument2.showDocument();

        wordDocument.showDocument();
    }

    private void factory() {
        ThemeFactory macFactory=new MacWindThemeFactory();
        WindowStyle macWindStyle= macFactory.createWindowStyle();
        macWindStyle.useStyle("mac--------------> window style write");

        ThemeFactory ubuntuFactory=new UbuntuWindThemeFactory();
        WindowStyle ubuntuWindStyle= ubuntuFactory.createWindowStyle();
        ubuntuWindStyle.useStyle("ubuntu-----------> window style black");
    }

    /**
     * 抽象工厂
     */
    private void absFactory() {
        AppFactory  macFactory=new MacAppFactory();
        TextEditor textEditor=macFactory.createTextEditor();
        textEditor.edit("Mac  textEditor  111111111111111111111111");
        textEditor.save();
        ImageEditor imageEditor= macFactory.createImageEditor();
        imageEditor.edit("Mac  imageEditor 00000000000000000000000");
        imageEditor.save();

        AppFactory  windFactory=new WindowsAppFactory();
        TextEditor textEditorW=windFactory.createTextEditor();
        textEditor.edit("Windows  textEditor  33333333333333333333333333");
        textEditor.save();
        ImageEditor imageEditorW= windFactory.createImageEditor();
        imageEditor.edit("Windows  imageEditor 2222222222222222222222222");
        imageEditor.save();
    }

    private void builderComputer() {
        //构造器
        Builder builder=new ApplePCBuilder();
        //Director
        Director director=new Director(builder);
        // 封装构建过程, 4核, 内存2GB, Mac系统
        director.construct(4,2,"Mac");
        //构造电脑，输出相关信息
        Log.d(TAG,"computer info:" +builder.create().toString());
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
