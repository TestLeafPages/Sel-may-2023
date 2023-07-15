package testcase;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/TC01_Login.feature", glue="pages",monochrome=true)
public class RunnerClass extends ProjectSpecificMethod {

}
