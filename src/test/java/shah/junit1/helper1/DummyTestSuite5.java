package shah.junit1.helper1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
Test suite is used to bundle a few unit test cases and run them together. In JUnit, both @RunWith and @Suite annotations are used to run the suite test
*/

@RunWith(Suite.class)
@SuiteClasses({ StringHelperTest1.class, QuickBeforeAfterTest2.class, ArraysCompareTest3.class,
                StringHelperParameterizedTest4.class })
public class DummyTestSuite5 {

}
