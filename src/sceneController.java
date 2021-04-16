
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import java.util.ArrayList;

public class sceneController {

    private ArrayList<Card> playerHand = new ArrayList<Card>();
    private ArrayList<Card> Com1Hand = new ArrayList<Card>();
    private ArrayList<Card> Com2Hand = new ArrayList<Card>();
    private ArrayList<Card> Com3Hand = new ArrayList<Card>(); 

    @FXML
    private ArrayList<Pane> paneList ;

    @FXML
    private Button buttom;

   
    @FXML
    private void setUp(ActionEvent event){
       
        RandomHand rand = new RandomHand();
        this.playerHand = rand.getPlayerHand();
        this.Com1Hand = rand.getCom1Hand();
        this.Com2Hand = rand.getCom2Hand();
        this.Com3Hand = rand.getCom3Hand();
       
        for(int loop=0;loop<13;loop++)
        {
            // paneList.get(loop).getChildren().clear();
            paneList.get(loop).getChildren().add(playerHand.get(loop).imageview);
        }
    }


}
