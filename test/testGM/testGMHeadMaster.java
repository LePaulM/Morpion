package test.testGM;

import gm.*;

import java.util.ArrayList;

import org.junit.*;

public class testGMHeadMaster {

    public ArrayList<GMCase> GMCaseFactory() {
        ArrayList<GMCase> gmCaseArray = new ArrayList<GMCase>();
        for (int i=0; i< 10; i++) {
            GMCase gmCase = new GMCase((int) Math.random()*i,(int) Math.random()*i);
            gmCaseArray.add(gmCase);
        }
        return gmCaseArray;      
    }

    public GMHeadmaster GMHeadmasterFactory() {
        GMHeadmaster gmheadmaster = new GMHeadmaster();
        ArrayList<GMCase> gmCases = GMCaseFactory();

        for (GMCase cases : gmCases) {
            gmheadmaster.addCase(cases);
        }
        
        return gmheadmaster;
    }

    protected void testCheckGameBoard() {
        // Arrange
        GMHeadmaster gmheadmaster = GMHeadmasterFactory();
        int testValue;
        // Act
        
        //Assert
        
    }
}
