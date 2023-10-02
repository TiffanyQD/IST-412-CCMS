package Controller.CivilianCntl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CivilianTest {

    CivilianStub civilianStub;

    @BeforeEach
    public void setUp() {
        civilianStub = new CivilianStub("testUser", "testPass");
    }

    @Test
    public void testSearchSpecificCase() {
        boolean result = civilianStub.searchSpecificCase();
        assertTrue(result);
    }

    // ... similar tests for other methods
}
