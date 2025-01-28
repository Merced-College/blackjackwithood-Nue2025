public class Card {
    //data variables
    //heart, ace, 11, ah.gif

    //suit, rank, value, picture 
    private String suit;
    private String rank;
    private int value;
    private String picture;
    private boolean other;

    //constructor:
    public Card(){
        suit = "heart";
        rank = "ace";
        value = 11;
        picture = "ah.gif";
    }

    public Card(String suit, String rank, int value, String picName){
        this.suit = suit;
        this.rank = rank;
        this.value = value;
        this.picture = picName;
    }


    //4 setters and 4 getters
    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }

    //getter:
    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }

    public String getPicture(){
        return picture;
    }


    public String toString(){
        return "suit: " + suit + ", rank: " + rank + ", value: " + value + ", picture: " + picture;
    }


    public boolean equals(Card other){//This sets up the main program where we can compare if any of the cards match together.
        return rank.equals(other.rank) && value==other.value;
    }
}
