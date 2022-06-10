package com.company;

class TV
{
    public void switchON()
    {
        System.out.println("TV is switched ON");
    }

    public void changeChannel()
    {
        System.out.println("TV channel is changed");
    }
}

class SmartTV extends TV
{
    @Override
    public void switchON()
    {
        System.out.println("SmartTV is switched ON");
    }

    @Override
    public void changeChannel()
    {
        System.out.println("SmartTV channel is changed");
    }

    public void browse()
    {
        System.out.println("SmartTV is browsing");
    }
}

public class Main {

    public static void main(String[] args) {
        TV t = new TV();
        t.switchON();
        t.changeChannel();

        SmartTV st = new SmartTV();
        st.switchON();
        st.switchON();
        st.browse();

        TV t1 = new SmartTV();
        //reference of TV holding the objects of SMartTV
        //all the public methods of the super class can be called
        //in case of override methods, methods of the subclass will be called
        t1.changeChannel();
        t1.switchON();
    }
}
