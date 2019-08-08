/*
	@author Mohammadreza Shahbazi Jalali

	Class name: Comp 585
	Purpose : This class will get the text and will pass it to the proper method.
 */
public class GetString {
    //Getting the text and parse it to find what key or keyString  has been selected
    // Method is self explanatory
    public String getText (String key,String keyString ){
    //it will get clear if the following happens "0" or "0.0
        if (keyString.equals("0") || keyString.equals("0.0") )
            keyString = "";
        switch (key) {
            case "1":
                keyString += key;
                break;

            case "2":
                keyString += key;
                break;

            case "3":
                keyString += key;
                break;

            case "4":
                keyString += key;
                break;

            case "5":
                keyString += key;
                break;

            case "6":
                keyString += key;
                break;

            case "7":
                keyString += key;
                break;

            case "8":
                keyString += key;
                break;

            case "9":
                keyString += key;
                break;

            case "0":
                keyString += key;
                break;

        // For div sign used u00f7
            case "/":
                keyString += "\u00f7";
                break;

            case "\u00f7":
                keyString += "\u00f7";
                break;
         // instead of mod we used \ sing in keyboard
            case "\\":
                keyString += key;
                break;

            case "-":
        // for negative sign used u208B
                keyString += "\u208B";
                break;
        // for subtraction used _ sgin
            case "_":
                keyString += "-";
                break;

            case "mod":
                keyString += "\\";
                break;

            case "%":
                keyString += key;
                break;

            case ".":
                keyString += key;
                break;

            case "+":
                keyString += key;
                break;


            case "*":
                keyString += key;
                break;

            case "(":
                keyString += key;
                break;

            case ")":
                keyString += key;
                break;

            case "C":
                keyString = "0.0";
                break;
    // for negative sign used the actual negative on key board
            case "+/-":
                keyString += "-";
                break;
           // For back space shape on GUI u23B has been used.
            case "\u232B":
                keyString = keyString.substring(0, keyString.length() - 1);
                break;
          // Unicode char  for back space
            case "\b":
                keyString = keyString.substring(0, keyString.length() - 1);
                break;
        }
        return keyString;
    }
}
