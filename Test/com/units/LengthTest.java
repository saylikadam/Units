package com.units;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void equalsReturnsTrueIfLengthsOfSameUnitsAreEqual(){
        Length l1 = new Length(1,Unit.FEET);
        Length l2 = new Length(1,Unit.FEET);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfSameUnitsAreNotEqual(){
        Length l1 = new Length(1,Unit.FEET);
        Length l2 = new Length(2,Unit.FEET);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfFeetAndInchesAreEqual(){
        Length l1 = new Length(1,Unit.FEET);
        Length l2 = new Length(12,Unit.INCH);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfInchesAndFeetAreEqual(){
        Length l1 = new Length(1,Unit.FEET);
        Length l2 = new Length(12,Unit.INCH);
        assertTrue(l2.equals(l1));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfInchesAndFeetAreNotEqual(){
        Length l1 = new Length(1,Unit.FEET);
        Length l2 = new Length(13,Unit.INCH);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfFeetAndInchesAreNotEqual(){
        Length l1 = new Length(2,Unit.FEET);
        Length l2 = new Length(12,Unit.INCH);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfFeetAndInchesAreEqual(){
        Length l1 = new Length(24,Unit.INCH);
        Length l2 = new Length(2,Unit.FEET);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfInchesAndCentimetersAreEqual(){
        Length l1 = new Length(1,Unit.INCH);
        Length l2 = new Length(2.54,Unit.CENTIMETERS);
        assertTrue(l1.equals(l2));
    }
}
