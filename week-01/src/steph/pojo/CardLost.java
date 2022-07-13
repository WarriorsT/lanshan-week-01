package steph.pojo;

public class CardLost extends Lost{
    private String id;

    public CardLost(){

    }

    public CardLost(String name, String lostTime, String id){
        super(name, lostTime);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Lost[] selectByWord(Lost[] lostArray, String name) {
        Lost[] temp = new Lost[lostArray.length];
        int cnt = 0;
        //根据name搜索
        for(int i = 0; i < lostArray.length; i++){
            if(lostArray[i].getOwnerName().startsWith(name)){
                temp[cnt++] = lostArray[i];
            }
        }
        return temp;
    }
}
