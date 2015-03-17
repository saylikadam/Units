package com.units;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void equalsReturnsTrueIfLengthsOfSameUnitsAreEqual(){
        Length l1 = new Length(1,LengthUnit.FT);
        Length l2 = new Length(1,LengthUnit.FT);
        assertTrue(l1.equals(l2));
    }
//
    @Test
    public void equalsReturnsFalseIfLengthsOfSameUnitsAreNotEqual(){
        Length l1 = new Length(1,LengthUnit.FT);
        Length l2 = new Length(2,LengthUnit.FT);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfFeetAndInchesAreEqual(){
        Length l1 = new Length(1,LengthUnit.FT);
        Length l2 = new Length(12,LengthUnit.IN);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfInchesAndFeetAreEqual(){
        Length l1 = new Length(1,LengthUnit.FT);
        Length l2 = new Length(12,LengthUnit.IN);
        assertTrue(l2.equals(l1));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfInchesAndFeetAreNotEqual(){
        Length l1 = new Length(1,LengthUnit.FT);
        Length l2 = new Length(13,LengthUnit.IN);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfFeetAndInchesAreNotEqual(){
        Length l1 = new Length(2,LengthUnit.FT);
        Length l2 = new Length(12,LengthUnit.IN);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void equalsReturnsFalseIfLengthsOfFeetAndInchesAreEqual(){
        Length l1 = new Length(24,LengthUnit.IN);
        Length l2 = new Length(2,LengthUnit.FT);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void equalsReturnsTrueIfLengthsOfInchesAndCentimetersAreEqual(){
        Length l1 = new Length(1,LengthUnit.IN);
        Length l2 = new Length(2.54,LengthUnit.CM);
        assertTrue(l1.equals(l2));
    }
}
