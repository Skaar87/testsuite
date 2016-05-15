package store.demoqa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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
public class Test_Suite {

}
