package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tool tool1 = new Tool(50);
        Tool tool2 = new Tool(60);

        Gift gift1 = new Gift(10);
        Gift gift2 = new Gift(30);

        BoxContainer boxContainer1 = new BoxContainer();
        BoxContainer boxContainer2 = new BoxContainer();
        BoxContainer boxContainer3 = new BoxContainer();

        boxContainer1.addPackage(tool1);
        boxContainer1.addPackage(gift1);

        boxContainer2.addPackage(tool2);
        boxContainer2.addPackage(gift2);

        boxContainer3.addPackage(boxContainer1);
        boxContainer3.addPackage(boxContainer2);

        System.out.println(boxContainer1.cost());
        System.out.println(boxContainer2.cost());
        System.out.println(boxContainer3.cost());


    }
}