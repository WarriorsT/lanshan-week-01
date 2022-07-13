package steph.test;

import org.testng.annotations.Test;
import steph.pojo.CardLost;
import steph.pojo.Lost;

public class lostTest {
    CardLost object = new CardLost();
    @Test
    public void lostTimeTest(){
        Lost lost1 = new Lost("Tom", "2022/06/06");
        Lost lost2 = new Lost("Mary", "2022/05/20");
        Lost lost3 = new Lost("Rose", "2022/08/08");
        Lost[] lostArray = new Lost[]{lost1, lost2, lost3};
        Lost.sortByTime(lostArray);
        for(int i = 0; i < 3; i++){
            System.out.println(lostArray[i]);
        }
    }

    @Test
    public void selectByKeyword(){
        Lost lost1 = new Lost("Tom", "2022/06/06");
        Lost lost2 = new Lost("Mary", "2022/05/20");
        Lost lost3 = new Lost("Rose", "2022/08/08");
        Lost[] lostArray = new Lost[]{lost1, lost2, lost3};

        Lost[] newLost = object.selectByWord(lostArray, "o");
        for(int i = 0; i < newLost.length; i++){
            if(newLost[i] == null){
                if(i == 0) System.out.println("您要查找的数据不存在!");
                break;
            }
            System.out.println(newLost[i]);
        }
    }
}
