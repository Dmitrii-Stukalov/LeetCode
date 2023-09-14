package test;

import code.Solution332;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution332Test {
    Solution332 solution = new Solution332();

    @Test
    void firstTest() {
        List<List<String>> tickets = List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"),
                List.of("SFO", "SJC"), List.of("LHR", "SFO"));
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), solution.findItinerary(tickets));
    }

    @Test
    void secondTest() {
        List<List<String>> tickets = List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"),
                List.of("SFO", "ATL"), List.of("ATL", "JFK"), List.of("ATL", "SFO"));
        assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"), solution.findItinerary(tickets));
    }

}