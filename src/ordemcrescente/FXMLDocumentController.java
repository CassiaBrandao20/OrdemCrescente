package ordemcrescente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
        Integer num1, num2, num3;
        String ordem;
        

    @FXML
    private Button button;

    @FXML
    private Label label21;

    @FXML
    private Label label;

    @FXML
    private TextField cxnum3;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private TextField cxnum1;

    @FXML
    private TextField cxnum2;

    @FXML
    private TextArea cxresult;

    @FXML
    void ordenar(ActionEvent event) {

        num1=Integer.valueOf(cxnum1.getText());
        num2=Integer.valueOf(cxnum2.getText());
        num3=Integer.valueOf(cxnum3.getText());
        cxresult.setText(verificaNumeros(num1, num2, num3));
    }

    private String verificaNumeros(Integer a, Integer b, Integer c) {
        if(a > b){          
            if(a > c){             
              if(b > c){                
                  ordem = String.valueOf("Ordenado: "+c +", "+ b + ", " + a+"\n Digitado: " + a +", "+ b + ", " + c +"\n");
              }
              else{
                  ordem = String.valueOf("Ordenado: "+b +", "+ c + ", " + a +"\n Digitado: " + a +", "+ b + ", " + c +"\n"); 
              }
            }
            else{                
                ordem = String.valueOf("Ordenado: "+b +", "+ a + ", " + c +"\n Digitado: " + a +", "+ b + ", " + c +"\n");        
            }
        }
        else if(a > c){                       
            ordem = String.valueOf("Ordenado: "+c +", "+ a + ", " + b +"\n Digitado: " + a +", "+ b + ", " + c +"\n");          
        }
        else{
            if(b > c){
                ordem = String.valueOf("Ordenado: "+a +", "+ c + ", " + b +"\n Digitado: " + a +", "+ b + ", " + c +"\n");                        
            }
            else{
                ordem = String.valueOf("Ordenado: "+a +", "+ b + ", " + c +"\n Digitado: " + a +", "+ b + ", " + c +"\n");                        
            }
             
        }
        return ordem;  
    }        

}
