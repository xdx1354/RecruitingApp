import Class_Diagrams.*;
import mockit.Expectations;
import mockit.Injectable;

import mockit.Tested;
import mockit.Verifications;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.Verifier;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CandidateBuilderTests {
    @Injectable
    private String mockName;
    @Injectable
    private String mockSurname;
    @Injectable
    private Candidate mockCandidate;
    @Tested
    private CandidateBuilder candidateBuilder;

    @BeforeEach
    void setUp() {
        candidateBuilder = UserFactory.instance().beginCandidate();
    }

    @Test
    void testAddNameSurname() {
        new Expectations() {{
            mockName = anyString;
            mockSurname = anyString;
        }};

        mockCandidate = candidateBuilder.addNameSurname(mockName, mockSurname).build();

        assertEquals(mockName, mockCandidate.getName());
        assertEquals(mockSurname, mockCandidate.getSurname());
    }

    @Test
    void testGenerateToken() {
        Expectations expectations = new Expectations() {{
            mockCandidate = UserFactory.instance().beginCandidate().build();
        }};

        Candidate candidate = UserFactory.instance().beginCandidate().build();

        String firstToken = candidate.getToken();
        String secondToken = mockCandidate.getToken();

        assertNotEquals(firstToken, secondToken);
    }

    @Test
    void testBuild() {
        new Expectations() {{
           mockName = anyString;
           mockSurname = anyString;
        }};

        mockCandidate = candidateBuilder.addNameSurname(mockName, mockSurname).build();
        Candidate candidate1 = candidateBuilder.build();
        Candidate candidate2 = candidateBuilder.build();

        assertEquals(candidate1.getName(), candidate2.getName());
        assertEquals(candidate1.getSurname(), candidate2.getSurname());
        assertNotEquals(candidate1.getToken(), candidate2.getToken());
    }
}
