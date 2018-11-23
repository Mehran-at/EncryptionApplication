import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encyption {


    public void compareInputWithAlphabet() {
        String alphabet = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        List<String> alphabets = Arrays.asList(alphabet.split(" "));
        System.out.println(alphabets);

    }

    public String separateInputText(Input inputText, Input key) {
        List<String> inputSeparated = new ArrayList<>();
        for (int position=0; position<inputText.length(); position++) {
            inputSeparated.add(inputText(0));
        }
    }



//    public String encryptInput(Input input) {
//
//        return String ;
//    }
}
