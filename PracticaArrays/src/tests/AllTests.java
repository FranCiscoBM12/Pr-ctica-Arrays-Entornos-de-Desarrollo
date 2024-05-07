package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestMaximo.class, testMedia.class, TestMediana.class, TestMinimo.class })
public class AllTests {

}
