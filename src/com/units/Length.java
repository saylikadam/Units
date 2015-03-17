package com.units;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by saylik on 3/13/2015.
 */
public class Length extends ScalarQuantity<LengthUnit>{

    public Length(double value, LengthUnit unit) {
        super(value, unit);
        baseUnit = LengthUnit.MM;

        conversionFactors.put(LengthUnit.MM, 1.0);
        conversionFactors.put(LengthUnit.FT, 304.8);
        conversionFactors.put(LengthUnit.CM,10.0);
        conversionFactors.put(LengthUnit.IN,25.4);
    }
}
