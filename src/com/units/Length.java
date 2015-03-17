package com.units;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by saylik on 3/13/2015.
 */
public class Length extends ScalarQuantity{
    static {
        conversionFactors.put(Unit.MILLIMETER, 1.0);
        conversionFactors.put(Unit.FEET, 304.8);
        conversionFactors.put(Unit.CENTIMETERS,10.0);
        conversionFactors.put(Unit.INCH,25.4);
    }

    public Length(double value, Unit unit) {
        super(value, unit);
    }
}
