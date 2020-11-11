package runner;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import test.MySecondTestNgTest;

import java.util.ArrayList;
import java.util.List;

public class MyCustomRunner {

    public static void main(String[] args) {
        TestNG testSuite = new TestNG();
        testSuite.setTestClasses(new Class[] { MySecondTestNgTest.class });
        testSuite.run();
    }

}
