
/**
 * Write a description of class PrintABoard2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintABoard2
{
    static void printData(int[][] intArray, int arraySize) {
               
        for (int x = 0; x < arraySize; x++) {
                for (int y = 0; y < arraySize; y++) { 
                    System.out.print(intArray[x][y]);              
                }
                System.out.println("");
        }
    }
    
    static void printX(String x) {
        for (int i = 0; i < 5; i++) {           
            for (int j = 0; j < 5; j++) {
                System.out.print(x);              
            }
            System.out.println("");
        }       
    }
    
    static int[][] updateArray(int[][] intArray, int x, int y, int dataValue){
        intArray[x][y] = dataValue;
        return intArray;
    }
    
    static int getElementValue(int[][] intArray, int x, int y){
        return intArray[x][y];
    }
    
    public static void main(String[] args){
        System.out.print("\u000C");
        
        int[][] myBoardArray = { {1,0,1,4,5},
                                 {0,2,1,4,5},
                                 {1,1,3,4,5},
                                 {2,4,3,3,1},
                                 {0,2,3,1,5},
                                };
        printData(myBoardArray, 5);
        myBoardArray = updateArray(myBoardArray,0,2,6);
        printData(myBoardArray, 5);
    }
}
