package com.learning.java.functional;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class PrintLearning  {

    public static void main(String[] args) {
        SayHello sayHello = str -> System.out.println("Hello " + str);

        sayHello.ShowMessage("Pearl");
    }

    private interface SayHello{
        void ShowMessage(String str);
    }
}
