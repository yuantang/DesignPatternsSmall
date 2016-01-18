package com.tom.designpatternssmall.prototype;

import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by tom on 2016/1/18
 * 文档类型, 扮演的是ConcretePrototype角色，而cloneable是代表prototype角色
 */
public class WordDocument implements Cloneable {

    private static final String TAG ="WordDocument";
    /**
     * 文本
     */
    private String mText;
    /**
     * 图片名列表
     */
    private ArrayList<String>   mImages=new ArrayList<String>();
    public WordDocument(){
        Log.d(TAG,"------------------WordDocument构造函数----------------------");
    }

    @Override
    public WordDocument clone()  {
        WordDocument doc= null;
        try {
            doc = (WordDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        doc.mText=this.mText;
//        如上代码所示，将doc.mImages指向this.mImages的一份拷贝， 而不是this.mImages本身，这样在doc2添加图片时并不会影响originDoc，
//        doc.mImages=this.mImages;
        doc.mImages= (ArrayList<String>) this.mImages.clone();
        return doc;
    }

    public void setText(String mText){
        this.mText=mText;
        Intent intent=new Intent();
        intent.clone();
    }
    public String getText(){
        return mText;
    }

    public void addImge(String img){
        this.mImages.add(img);
    }
    /**
     * 打印文档
     */
    public void showDocument(){
        System.out.println("----------- Word Content Start -----------");
        System.out.println("Text : " + mText);
        System.out.println("Images List: ");
        for (String imgName : mImages) {
            System.out.println("image name : " + imgName);
        }
        System.out.println("----------- Word Content End -----------");
    }

}
