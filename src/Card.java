


import javafx.scene.image.Image;


public class Card {
    private String name,suit;
    private int value;
    private String cardImage;
    javafx.scene.image.ImageView imageview;
 

    public Card(String name, String suit, int value, String cardImage) {
        this.name = name;
        this.suit = suit;
        this.value = value;
        this.cardImage = cardImage;
        Image image1 = new Image(cardImage);
        this.imageview = new javafx.scene.image.ImageView(image1);
        imageview.setFitWidth(100);
        imageview.setFitHeight(150);
    }


    

    @Override
    public String toString() {
        return "Card [cardImage=" + cardImage + ", name=" + name + ", suit=" + suit + ", value=" + value + "]";
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getSuit() {
        return suit;
    }



    public void setSuit(String suit) {
        this.suit = suit;
    }



    public int getValue() {
        return value;
    }



    public void setValue(int value) {
        this.value = value;
    }



    public String getCardImage() {
        return cardImage;
    }



    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }




    public javafx.scene.image.ImageView getImageview() {
        return imageview;
    }

    
    
    
}
