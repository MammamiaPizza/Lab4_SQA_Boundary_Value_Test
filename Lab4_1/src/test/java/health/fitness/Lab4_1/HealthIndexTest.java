package health.fitness.Lab4_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class HealthIndexTest {
    

  
  @ParameterizedTest
  @CsvFileSource(files = "src/test/java/resourseTest/HealthData.csv")
  public void HealthTotalScoreTest(int Vo2Max, int RHR, int HRR, int expected) {
	  HealthIndexScore Object = new HealthIndexScore(Vo2Max, RHR, HRR);
	  assertEquals(expected, Object.getTotalScore());
  }
  
  
}
