package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDef.BaseClass;


@CucumberOptions(features="src/test/java/features",glue="stepDef"
,monochrome=true,publish=true,
//tags="@Smoke" -->only one category
//tags="@Regression and @Funtionality"
//tags="@Smoke or @Regression") //Execute any one condition is true
//tags="not @Smoke")//to exclude one particular scenario
tags="@Login")//feature level 
public class RunnerClass extends BaseClass{

}
//Hirerachy
//AbstratcTestNGCucumberTest
//BaseClass
//LoginTC