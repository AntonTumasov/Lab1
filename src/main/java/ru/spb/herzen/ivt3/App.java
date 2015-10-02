package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

public class App 
{
    public static void main( String[] args )
    {
        System.out.printLn("It's me, Anton!")
        RandomNameGenerator rnd = new RandomNameGenerator(2);
        for (int i=0;i<15;i=i+1) {
            String name = rnd.next();
            System.out.println("Hello," + name);
        }
        }


    }

