
    package org.springframework.integration_tests;
  
    import com.intuit.karate.Results;
    import com.intuit.karate.Runner;
    // import com.intuit.karate.http.HttpServer;
    // import com.intuit.karate.http.ServerConfig;
    import org.junit.jupiter.api.Test;
  
    import static org.junit.jupiter.api.Assertions.assertEquals;
  
    class FeatureFileGherkinCredentialAllTest {
  
        @Test
        void testAll() {
            String nobel_90593d1e1b_url = System.getenv().getOrDefault("NOBEL_90593D1E1B_URL", "http://127.0.0.1:4010");
String auth_token = System.getenv().getOrDefault("AUTH_TOKEN", "dummy_AUTH_TOKEN");
            Results results = Runner.path("src/test/java/org/springframework/integration_tests/FeatureFileGherkinCredentialAll")
                    .systemProperty("NOBEL_90593D1E1B_URL",nobel_90593d1e1b_url)
.systemProperty("AUTH_TOKEN", auth_token)
                    .reportDir("testReport").parallel(1);
            assertEquals(0, results.getFailCount(), results.getErrorMessages());
        }
  
    }
