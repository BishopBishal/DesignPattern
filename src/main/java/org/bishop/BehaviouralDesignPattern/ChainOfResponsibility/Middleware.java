package org.bishop.BehaviouralDesignPattern.ChainOfResponsibility;

/**
 * Base middleware class.
 */
public abstract class Middleware {
    private Middleware next;

    /**
     * Builds chains of middleware objects.
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first; //head holds the value of first middleware object
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;//first middleware object has next field where next field contains the value of next middleware object and head again points to next middleware
            head = nextInChain;
        }
        //so here every middleware variable next hold the object of next middleware until the end of the chain
        return first;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     */
    public abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}