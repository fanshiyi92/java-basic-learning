package basic.learning.jvm.classlife.example3;

/**
 * @author ：ex-xugaoxiang001
 * @description ：
 * @copyright ：	Copyright 2019 yowits Corporation. All rights reserved.
 * @create ：2019/1/2 14:51
 */
public class Parent {
    public static int A = 1;

    static {
        A = 2;
    }
}
