package test.testGM;

import gm.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;
import org.junit.*;

public class testGMCase {

    public ArrayList<GMCase> GMCaseFactory() {
        ArrayList<GMCase> gmCaseArray = new ArrayList<GMCase>();
        for (int i=0; i< 10; i++) {
            GMCase gmCase = new GMCase((int) Math.random()*i,(int) Math.random()*i);
            gmCaseArray.add(gmCase);
        }
        return gmCaseArray;      
    }
    
    @Test
    public void testGetX() {
        // Arrange
        GMCase gmCase = new GMCase();
        int testValue;
        // Act
        testValue = gmCase.GetX();
        //Assert
        assertEquals(0,testValue);
    }

    @Test
    public void testGetY() {
        //Arrange
        GMCase gmCase = new GMCase();
        int testValue;
        // Act
        testValue = gmCase.GetY();
        //Assert
        assertEquals(0,testValue);
    }

    @Test
    public void testGetCoords() {
        //Arrange
        GMCase gmCase = new GMCase();
        Pair<Integer,Integer> coords = new Pair<Integer,Integer> (0,0);
        List<Object> testValue;
        // Act
        testValue = gmCase.GetCoordinates();

        //Assert
        assertEquals(coords.toList(),testValue);
    }

    @Test
    public void testSetX() {
        // Arrange
        GMCase gmCase = new GMCase();
        int testValue;
        
        // Act
        gmCase.SetX(1);
        testValue = gmCase.GetX();

        //Assert
        assertEquals(1,testValue);
    }

    @Test
    public void testSetY() {
        //Arrange
        GMCase gmCase = new GMCase();
        int testValue;
        // Act
        gmCase.SetY(1);
        testValue = gmCase.GetY();

        //Assert
        assertEquals(1,testValue);
    }

    @Test
    public void testSetCoords() {
        //Arrange
        GMCase gmCase = new GMCase();
        Pair<Integer,Integer> coords = new Pair<Integer,Integer> (1,1);
        List<Object> testValue;
        // Act
        gmCase.SetCoordinates(1, 1);
        testValue = gmCase.GetCoordinates();

        //Assert
        assertEquals(coords.toList(),testValue);
    }

}
