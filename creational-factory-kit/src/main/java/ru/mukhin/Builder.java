package ru.mukhin;

import java.util.function.Supplier;

public interface Builder {
    void add(NumberType type, Supplier<MyNumber> supplier);
}
