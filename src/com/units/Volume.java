package com.units;

/**
 * Created by dollyg on 3/16/2015.
 */
public class Volume extends ScalarQuantity<VolumeUnit>{

    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
        baseUnit = VolumeUnit.ML;

        conversionFactors.put(VolumeUnit.ML, 1.0);
        conversionFactors.put(VolumeUnit.GAL, 3785.411);
        conversionFactors.put(VolumeUnit.LT, 1000.0);
    }
}
