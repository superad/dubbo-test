package com.normal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Random;

@RunWith(JUnit4.class)
public class NormalTest {

    public  static int sRandom=(int)(Math.random()*10);

    public final int fRandom=(int)(Math.random()*10);

    @Test
    public void test(){
        NormalTest nt1=new NormalTest();
        NormalTest nt2=new NormalTest();
        System.out.println(nt1.fRandom);
        System.out.println(NormalTest.sRandom);
        System.out.println(nt2.fRandom);
        System.out.println(NormalTest.sRandom);


    }

    @Test
    public void testFX(){
        Parent<String,Date> parent=new Parent<String, Date>("parent",new Date());
        Child<String,Date,String> child=new Child<String, Date, String>();
        System.out.println(parent.getFoo1()+","+parent.getFoo2());


    }
    @Test
    public void testSoftRef(){
        System.out.println("start");
        String []a=new String[100000000];
        String []b=new String[100];
        Parent<String,String[]> p=new Parent<String,String[]>("Hello",a);

        SoftReference<Parent> softReference=new SoftReference<Parent>(p);
        p=null;
        if(softReference!=null){
            p=softReference.get();
        }else{
            p=new Parent("Hi",b);
            softReference=new SoftReference<Parent>(p);
        }
         p=softReference.get();
         System.out.println(p.getFoo1()+","+p.getFoo2().length);


        System.out.println("end");


    }

    @Test
    public void testWeakRef(){
        System.out.println("start");
        String []a=new String[100000000];
        String []b=new String[100];
        Parent<String,String[]> p=new Parent<String,String[]>("Hello",a);
        WeakReference<Parent> weakReference=new WeakReference<Parent>(p);
        p=null;
        if(weakReference!=null){
            p=weakReference.get();
        }else{
            p=new Parent<String, String[]>("Hi",b);
            weakReference=new WeakReference<Parent>(p);
        }
        p=weakReference.get();
        System.out.println(p.getFoo1()+","+p.getFoo2().length);

        System.out.println("end");

    }


}
