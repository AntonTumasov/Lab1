package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RandomNameGenerator rnd = new RandomNameGenerator(2);

        for (int i=0;i<15;i=i+1) {
            String name = rnd.next();
            System.out.println("Hello," + name);
        }
        }


    }

