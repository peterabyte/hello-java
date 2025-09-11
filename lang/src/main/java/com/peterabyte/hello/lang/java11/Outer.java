package com.peterabyte.hello.lang.java11;

public class Outer {
    public void outerPublicMethod() { }

    private void outerPrivateMethod() {}

    class Inner {
        public void innerPublicMethod() {
            outerPrivateMethod();
        }
    }
}
