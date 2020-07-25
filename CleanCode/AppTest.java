package com.mavdemo.cleancode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public void test()
    {
    	SIandCI sici=new SIandCI();
        int si=sici.calculateSI(10000,3, 5);
        assertEquals(1500,si);
        int ci=sici.calculateCI(10000,0.04,6,4);
        assertEquals(20000,ci);
    }
    public AppTest( String testName )
    {
        super( testName );
    }
    
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}
