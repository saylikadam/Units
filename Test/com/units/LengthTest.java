package com.units;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by saylik on 3/13/2015.
 */
public class LengthTest {
    @Test
    public void equalsReturnsTrueIfLengthsOfSameUnitsAreEqual(){
        Length l1 = new Length(1,"feet");
        Length l2 = new Length(1,"feet");
        assertTrue(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfSameUnitsAreNotEqual(){
        Length l1 = new Length(1,"feet");
        Length l2 = new Length(2,"feet");
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfFeetAndInchesAreEqual(){
        Length l1 = new Length(1,"feet");
        Length l2 = new Length(12,"inches");
        assertTrue(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfInchesAndFeetAreEqual(){
        Length l1 = new Length(1,"feet");
        Length l2 = new Length(12,"inches");
        assertTrue(l2.equals(l1));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfInchesAndFeetAreNotEqual(){
        Length l1 = new Length(1,"feet");
        Length l2 = new Length(13,"inches");
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfFeetAndInchesAreNotEqual(){
        Length l1 = new Length(2,"feet");
        Length l2 = new Length(12,"inches");
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfFeetAndInchesAreEqual(){
        Length l1 = new Length(24,"inches");
        Length l2 = new Length(2,"feet");
        assertTrue(l1.equals(l2));
    }

    @Test
    public void convertToInchConvertsFeetToInch(){
        Length l1 = new Length(1,"feet");
        Length l2 = new Length(12,"inches");
        assertTrue(l2.equals(l1.convertToInch()));
    }

    @Test
    public void convertToInchConvertsFeetToCentimeters(){
        Length l1 = new Length(1,"centimeters");
        Length expected = new Length(0.39,"inches");
        assertTrue(expected.equals(l1.convertToInch()));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfInchesAndCentimetersAreEqual(){
        Length l1 = new Length(1,"inches");
        Length l2 = new Length(2.54,"centimeters");
        assertTrue(l1.equals(l2));
    }


}
