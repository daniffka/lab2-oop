package ru.ssau.tk.BerbentsevBalabashin.functions;

import ru.ssau.tk.BerbentsevBalabashin.CompositeFunction;

public interface MathFunction {
    double apply(double x);
    default CompositeFunction andThen(MathFunction afterFunction){
        return new CompositeFunction(this, afterFunction);
    }

}
