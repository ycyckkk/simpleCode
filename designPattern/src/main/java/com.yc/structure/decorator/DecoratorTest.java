package com.yc.structure.decorator;

import java.io.*;

/**
 *
 * 做青菜
 * 炒青椒，炒胡萝卜
 *
 * 做荤菜
 * 炒肉，炒火腿
 *
 *
 * @Author yucheng
 * @Date 2020/12/1 20:29
 */
public class DecoratorTest {
    public static void main(String[] args) throws FileNotFoundException {

        //接口和实现类
        CookVegetables cookCarrot = new CookCarrot();
        CookVegetables cookGreenPepper = new CookGreenPepper();

        //抽象类和子类
        CookMeat cookMeat1 = new CookBeefMeat(cookCarrot);
        System.out.println(cookMeat1.cookMeat());
        CookMeat cookMeat2 = new CookBeefMeat(cookGreenPepper);
        System.out.println(cookMeat2.cookMeat());


        try {
            File file = new File("");
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
