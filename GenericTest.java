package com.jb;



public class GenericTest {
    public static void main(String arg[]){
        Generic<Integer, String> intobj;
        intobj = new Generic<>(100, "JB");
        intobj.showTypeObj();
        System.out.println("Value: "+intobj.getObj());
        intobj.showTypeObj2();
        System.out.println("Value: "+intobj.getObj2());
        Generic<String, Generic<Float, Double>> tuple = new Generic<>("norm", new Generic<Float, Double>((float) .8,.9));
        tuple.showTypeObj();
        tuple.showTypeObj2();
        System.out.println("Value: "+tuple.getObj());
        System.out.println("Value: "+tuple.getObj2());
    }

}
