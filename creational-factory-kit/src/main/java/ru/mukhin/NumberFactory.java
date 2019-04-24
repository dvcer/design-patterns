package ru.mukhin;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface NumberFactory {

    public abstract MyNumber create(NumberType type);

    public static NumberFactory createFactory(Consumer<Builder> consumer) {
        HashMap<NumberType, Supplier<MyNumber>> map = new HashMap<>();
        consumer.accept(map::put);
        return type -> map.get(type).get();
    }
}
