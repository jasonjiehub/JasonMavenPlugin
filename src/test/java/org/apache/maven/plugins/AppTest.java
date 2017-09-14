package org.apache.maven.plugins;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
<<<<<<< HEAD
 * Unit test for simple HelloMojo.
=======
 * Unit test for simple App.
>>>>>>> 5d5efa6ce1f6f6c01ad3741b7f3c74e77105facc
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
