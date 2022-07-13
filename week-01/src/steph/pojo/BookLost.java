package steph.pojo;

public class BookLost extends Lost{
    private String BookName;

    public BookLost(String ownerName, String lostTime, String bookName) {
        super(ownerName, lostTime);
        BookName = bookName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
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
