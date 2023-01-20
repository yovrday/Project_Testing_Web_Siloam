package com.juaracoding.ProjectSiloam.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/01.LoginAdmin.feature",
        		   // "src/main/resources/features/02.View&Export.feature",
        		   //	"src/main/resources/features/03.LoginSales.feature",
        		   // "src/main/resources/features/04.UploadDocument.feature",
        		 //   "src/main/resources/features/05.Return.feature"
        			},
        glue = "com.juaracoding.ta.ProjectSiloam.step_definitions" ,
        		//"src/test/java/com/juaracoding/ta/ProjectSiloam/step_definitions"
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
