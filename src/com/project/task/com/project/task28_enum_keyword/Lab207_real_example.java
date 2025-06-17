package com.project.task28_enum_keyword;

public class Lab207_real_example
{
    public static void main(String[] args)
    {
        System.out.println(colours.RED.getHexcode());
    }
}
enum colours
{
    RED("#FF0000"),

    GREEN("#61FF33");

    private  String hexcode;

    colours(String hexcode)
    {
        this.hexcode = hexcode;
    }
    String getHexcode()
    {
        return this.hexcode;
    }
}