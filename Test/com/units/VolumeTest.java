package com.units;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by dollyg on 3/16/2015.
 */
public class VolumeTest {
    @Test
    public void equalsReturnsTrueIfVolumesOfSameUnitsAreEqual(){
        Volume l1 = new Volume(1,VolumeUnit.GAL);
        Volume l2 = new Volume(1,VolumeUnit.GAL);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfVolumesOfSameUnitsAreNotEqual(){
        Volume l1 = new Volume(1,VolumeUnit.GAL);
        Volume l2 = new Volume(2,VolumeUnit.GAL);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueFor1GallonAnd3p78Liters(){
        Volume l1 = new Volume(1,VolumeUnit.GAL);
        Volume l2 = new Volume(3.7854,VolumeUnit.LT);
        assertTrue(l1.equals(l2));
    }

//    @Test
//    public void addReturnsSumOf1GallonAnd1Gallon(){
//        Volume l1 = new Volume(1,VolumeUnit.GAL);
//        Volume l2 = new Volume(1,VolumeUnit.GAL);
//        Volume expected = new Volume(2*3785.411,VolumeUnit.ML);
//        assertEquals(expected, l1.add(l2));
//    }

}
