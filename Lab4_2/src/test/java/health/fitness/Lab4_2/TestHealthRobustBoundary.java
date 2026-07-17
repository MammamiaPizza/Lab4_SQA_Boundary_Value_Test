package health.fitness.Lab4_2;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import health.fitness.Lab4_2.HealthIndexScore;
import static org.junit.jupiter.api.Assertions.*;

public class TestHealthRobustBoundary {
    
	@ParameterizedTest
	@CsvFileSource(files = "src/test/java/resourse/dataTest.csv")
	public void HealthTotalScoreTest(int Vo2Max, int RHR, int HRR, int expected) {
		HealthIndexScore Object = new HealthIndexScore(Vo2Max, RHR, HRR);
		assertEquals(expected, Object.getTotalScore());
	}
}
