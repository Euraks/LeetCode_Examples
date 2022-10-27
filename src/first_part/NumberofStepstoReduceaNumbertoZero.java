/**
 * @author @Euraks 27.10.2022
 */
package first_part;

public class NumberofStepstoReduceaNumbertoZero {


    public static void main(String[] args) {

        System.out.println(numberOfSteps(8));

    }
    public static int numberOfSteps(int num) {
        int count=0;
        while (num>0){
            if ((num%2)!=0){
                count++;
                num = num-1;
            } else {
                count++;
                num = num/2;
            }
        }
        return count;
    }
}
