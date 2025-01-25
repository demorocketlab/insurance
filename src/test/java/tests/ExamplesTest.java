package tests;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.RuntimeHook;
import com.intuit.karate.Suite;
import com.intuit.karate.core.*;
import com.intuit.karate.http.HttpRequest;
import com.intuit.karate.http.Response;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExamplesTest {

    @Test
    void testParallel() {
//        Driver driver = Driver.start("playwright");
        Results results = Runner.path("classpath:tests")//. customDrivers(Collections.singletonMap("playwright", driver))
                .hook(new KarateExecutionHook())
                //.outputCucumberJson(true)
                .parallel(2);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}

class KarateExecutionHook implements RuntimeHook {

    @Override
    public boolean beforeScenario(ScenarioRuntime scenarioRuntime) {
        return true;
    }

    @Override
    public void afterScenario(ScenarioRuntime scenarioRuntime) {
    }

    @Override
    public boolean beforeFeature(FeatureRuntime featureRuntime) {
        return true;
    }

    @Override
    public void afterFeature(FeatureRuntime featureRuntime) {
    }

    @Override
    public void beforeSuite(Suite suite) {
    }

    @Override
    public void afterSuite(Suite suite) {
    }

    @Override
    public boolean beforeStep(Step step, ScenarioRuntime sr) {
        return true;
    }

    @Override
    public void afterStep(StepResult result, ScenarioRuntime sr) {
    }

    @Override
    public void beforeHttpCall(HttpRequest request, ScenarioRuntime sr) {
    }

    @Override
    public void afterHttpCall(HttpRequest request, Response response, ScenarioRuntime sr) {
    }
}