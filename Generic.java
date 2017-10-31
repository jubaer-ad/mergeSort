package com.jb;

public class Generic<baal, chaal> {
    private baal obj;
    private chaal obj2;
    public Generic(baal obj, chaal obj2){
        this.obj = obj;
        this.obj2 = obj2;
    }
    public baal getObj(){
        return obj;
    }
    public chaal getObj2(){
        return obj2;
    }
    public void showTypeObj(){
        System.out.println("Type of baal is: "+obj.getClass().getName());
    }
    public void showTypeObj2(){
        System.out.println("Type of chaal is: "+obj2.getClass().getName());
    }

}
