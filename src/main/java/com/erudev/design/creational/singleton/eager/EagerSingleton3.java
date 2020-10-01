package com.erudev.design.creational.singleton.eager;

import java.io.*;

/**
 * 饿汉式单例, 测试反序列化被破坏的情况
 *
 * @author pengfei.zhao
 * @date 2020/10/1 15:07
 */
public class EagerSingleton3 implements Serializable{
    public static EagerSingleton3 INSTANCE = new EagerSingleton3();

    private EagerSingleton3() {
    }

    public static EagerSingleton3 getInstance() {
        return INSTANCE;
    }

    /**
     * see {@code ObjectInputStream#readOrdinaryObject}
     * @return obj
     */
    public Object readResolve(){
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        EagerSingleton3 instance = EagerSingleton3.getInstance();

        EagerSingleton3 instance2 = null;

        FileOutputStream fos = new FileOutputStream("EagerSingleton3.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("EagerSingleton3.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        instance2 = (EagerSingleton3) ois.readObject();
        ois.close();

        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
