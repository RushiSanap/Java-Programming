package com.company;

class Phone
{
    public void call()
    {
        System.out.println("Phone Calling");
    }

    public void sms()
    {
        System.out.println("Phone Sending SMS");
    }
}

interface ICamera
{
    void click();

    void record();
}

interface IMusicPlayer
{
    void playing();

    void pause();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{

    @Override
    public void click()
    {
        System.out.println("Smart Phone Clicking Photo");
    }

    @Override
    public void record()
    {
        System.out.println("Smart Phone Recording Video");
    }

    @Override
    public void playing()
    {
        System.out.println("Smart Phone Playing Music");
    }

    @Override
    public void pause()
    {
        System.out.println("Smart Phone Stopped Playing Music");
    }


    void videoCalling()
    {
        System.out.println("Smart Phone Video Calling");
    }
}

public class Main {

    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.pause();
        s.videoCalling();


        Phone p = s;
        //same as the statement Phone p = new SmartPhone();
        //reference p of phone holding the object of smartphone
        //reverse is not possible
        //methods of only phones are available with respect to SmartPhone
        p.call();
        p.sms();

        ICamera c = s;//same as the statement ICamera c = new SmartPhone();
        c.click();
        c.record();

        IMusicPlayer m = s;//same as the statement IMusicPlayer m = new SmartPhone();
        m.playing();
        m.pause();
    }
}
