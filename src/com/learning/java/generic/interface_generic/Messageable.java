package com.learning.java.generic.interface_generic;

/**
 * Created by Augmentis on 6/10/2017.
 */
public interface Messageable<T,U> {
    public T SimpleMessage();
    public T ParameterMessage(U str);
}
