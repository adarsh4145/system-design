package io.github.adarsh4145.designpatterns.behavioural_I.iterator.solution.sol2;

public interface Iterator {
    boolean hasNext();
    String current();
    void next();
}
//could have used Iterator <T> for generics