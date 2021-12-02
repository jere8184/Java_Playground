package JUNIT_KICKSTART;

public class GameMenu {
    int[] IntArr = new int[]{1,2,3,4,5};

    public void setIntArr(int index, int value) {

        int oValue = this.IntArr[index];
        int oIndex = -1;

        for(int i = 0; i < IntArr.length; i++){
            if(IntArr[i] == value){
                oIndex = i;
                break;
            }
        }

        this.IntArr[oIndex] = oValue;
        this.IntArr[index] = value;
    }

}
