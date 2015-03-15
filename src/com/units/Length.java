package com.units;

import java.lang.String;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by saylik on 3/13/2015.
 */
public class Length {
    double value;
    String unit;

    private static Map<String ,Double> inchConversionFactors = new HashMap<String, Double>();

    static {
        inchConversionFactors.put("feet",12.0);
        inchConversionFactors.put("centimeters",0.393701);
    }

    private static final double PRECISION = 0.001;

    public Length(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equals(Length l2) {
        Length l1 = this;
        if(l1.unit != "inches"){
            l1 = l1.convertToInch();
        }
        if(l2.unit != "inches"){
            l2 = l2.convertToInch();
        }
        return Math.abs(l1.value - l2.value) < PRECISION && l1.unit == l2.unit;
    }

    public Length convertToInch() {
        double factor = inchConversionFactors.get(unit);
        return new Length(value*factor,"inches");
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
