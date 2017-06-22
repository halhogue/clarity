package com.ean.clarity.util;

/**
 * Steve Baugus in his purest form.
 */
public class Baugus {

    private boolean matches;
    private boolean gasoline;
    // TODO: add fields for scotch and anger levels

    /**
     * Creates a new Baugus with matches and gasoline.
     */
    public Baugus() {
        matches = true;
        gasoline = true;
    }

    /**
     * Attempts to fix any problem.
     *
     * @return true if the problem was fixed, false if not
     */
    public boolean fixProblem() {
        return matches && gasoline;
    }

}
