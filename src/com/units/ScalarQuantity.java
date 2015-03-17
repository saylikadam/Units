package com.units;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dollyg on 3/16/2015.
 */

public class ScalarQuantity<U> {
    private double value;
    private U unit;
    protected final Map<U,Double> conversionFactors = new HashMap<U,Double>();
//    private final Map<Class,U> basicConversionUnits = new HashMap<Class, U>();
    private static final double PRECISION = 0.02;
    protected U baseUnit;

    static{
    }
    public ScalarQuantity(double value, U unit) {
        this.value = value;
        this.unit = unit;
//        try {
//            basicConversionUnits.put(Class.forName("com.units.Length"),U.MILLIMETER);
////            basicConversionUnits.put(Class.forName("com.units.Volume"),U.MILLILITER);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

    }

    public boolean equals(ScalarQuantity sq2){
        ScalarQuantity sq1 = convertToBaseUnit();
        sq2 = sq2.convertToBaseUnit();
        return Math.abs(sq1.value - sq2.value) < PRECISION && sq1.unit == sq2.unit;
    }

    protected ScalarQuantity convertToBaseUnit() {
        return new ScalarQuantity(value*conversionFactors.get(unit),baseUnit);
    }

    @Override

    public String toString() {
        return "ScalarQuantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    public ScalarQuantity add(ScalarQuantity sq2) {
//        new value + sq2.value
        return null;
    }

    // public ScalarQuantity add(ScalarQuantity sq2) {
//        return new ScalarQuantity(sq2.value + value);
    //}
}
