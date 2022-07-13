package steph.pojo;

public class Lost {
    private String ownerName;
    private String lostTime;

    @Override
    public String toString() {
        return "Lost{" +
                "ownerName='" + ownerName + '\'' +
                ", lostTime='" + lostTime + '\'' +
                '}';
    }

    public Lost(){

    }
    public Lost(String ownerName, String lostTime) {
        this.ownerName = ownerName;
        this.lostTime = lostTime;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLostTime() {
        return lostTime;
    }

    public void setLostTime(String lostTime) {
        this.lostTime = lostTime;
    }

    /**
     * 按照丢失时间从早到晚的顺序查询
     * @param lostArray
     */
    public static void sortByTime(Lost[] lostArray){
        quickSort(lostArray, 0, lostArray.length - 1);
    }


    public static void quickSort(Lost[] lostArray, int l, int r){
        if(l >= r) return;
        int i = l - 1, j = r + 1;
        while(i < j){
            do{
                i++;
            }while(i < lostArray.length && lostArray[i].lostTime.compareTo(lostArray[l].lostTime) < 0);

            do{
                j--;
            }while(j >= 0 && lostArray[j].lostTime.compareTo(lostArray[l].lostTime) > 0);

            if(i < j){
                Lost temp = lostArray[i];
                lostArray[i] = lostArray[j];
                lostArray[j] = temp;
            }
        }
        quickSort(lostArray, l, j);
        quickSort(lostArray, j + 1, r);
    }

    public Lost[] selectByWord(Lost[] lostArray, String name){
        return null;
    }
}
