package test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import store.demoqa.*;

@RunWith(Suite.class)
@SuiteClasses({
	HomeFlikTest.class, 
	SearchProductsTest.class, 
	AddToCartTest.class, 
	CheckOutFinalTest.class, 
	CheckOutTest.class, 
	ProductCategoryTest.class,
	ProduktSidaTest.class
	})
public class TestSuite {

}
