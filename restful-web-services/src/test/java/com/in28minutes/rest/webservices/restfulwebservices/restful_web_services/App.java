package com.in28minutes.rest.webservices.restfulwebservices.restful_web_services;

import com.in28minutes.rest.webservices.restfulwebservices.RestfulWebServicesApplication;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class App 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RestfulWebServicesApplication.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
