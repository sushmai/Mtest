
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MTest
{
    private M m1; 
    
    public MTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        m1 = new M();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        m1 = null;
    }

    @Test
    public void test1()
	    {
	        m1.do_e1();
	        assertEquals("S1",m1.getCurrentState());
	        System.out.println("Test 1 Success");
	    }
	    @Test
	    public void test2()
	    { 
	        m1.do_e2();
	        assertEquals("S2",m1.getCurrentState());
	        System.out.println("Test 2 Success");
	    } 
	   @Test
	    public void test3()
	    { 
	        m1.do_e3();
	        assertEquals("S1",m1.getCurrentState());
	        System.out.println("Test 3 Success");
	    } 
	   @Test
	    public void test4()
	    { 
		   m1.do_e2(); 
		   m1.do_e1();
	        assertEquals("S0",m1.getCurrentState());
	        System.out.println("Test 4 Success");
	    } 
	    
	   @Test
	    public void test5()
	    { 
		   m1.do_e1(); 
		   m1.do_e1();
	        assertEquals("S1",m1.getCurrentState());
	        System.out.println("Test 5 Success");
	    } 
	   @Test
	    public void test6()
	    { 
		   m1.do_e2(); 
		   m1.do_e2();
		   m1.do_e2();
	        assertEquals("S2",m1.getCurrentState());
	        System.out.println("Test 6 Success");
	    } 
	   @Test
	    public void test7()
	    { 
		   m1.do_e2(); 
		   m1.do_e2();
		   m1.do_e2();
		   m1.do_e3();
	        assertEquals("S2",m1.getCurrentState());
	        System.out.println("Test 7 Success");
	    } 
	   
	   @Test
	    public void test8()
	    { 
		   m1.do_e2();
		   m1.do_e2();
		   m1.do_e2();
		   m1.do_e3();
		   m1.do_e2();
	        assertEquals("S3",m1.getCurrentState());
	        System.out.println("Test 8 Success");
	    } 
	   @Test
	    public void test9()
	    { 
		   m1.do_e2();
		   m1.do_e2();
		   m1.do_e2();
		   m1.do_e3();
		   m1.do_e2();
		   m1.do_e2();
	        assertEquals("S1",m1.getCurrentState());
	        System.out.println("Test 9 Success");
	    } 
	   @Test
	    public void test10()
	    { 
		   m1.do_e3(); 
		   m1.do_e3(); 
		   m1.do_e3(); 
		   m1.do_e2(); 
		   m1.do_e2();
	        assertEquals("S1",m1.getCurrentState());
	        System.out.println("Test 10 Success");
	    } 	   	   
}
