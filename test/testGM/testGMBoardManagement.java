package test.testGM;

import java.util.*;
import gm.*;

public class testGMBoardManagement {

    public ArrayList<GMCase> GMCaseFactory() {
        ArrayList<GMCase> gmCaseArray = new ArrayList<GMCase>();
        for (int i=0; i< 10; i++) {
            GMCase gmCase = new GMCase((int) Math.random()*i,(int) Math.random()*i);
            gmCaseArray.add(gmCase);
        }
        return gmCaseArray;      
    }

    protected void testGameBoard() {
        // Arrange
        ArrayList<GMCase> gmCases = GMCaseFactory();
        int testValue;
        // Act
        
        //Assert
        
    }
}
