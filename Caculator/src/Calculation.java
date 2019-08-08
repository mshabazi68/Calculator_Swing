/*
	@author Mohammadreza Shahbazi Jalali
	Class name: Comp 585
	Purpose : This class does the  Calculation of calculator .
 */

import javax.swing.JOptionPane;

public class Calculation {
    private double total;

    public Calculation() {
        //   total = 0;
    }
    //find the fist operation on the string ex : 4/2*3%2
    public int getFisrtoperator(int num1, int num2, int num3) {
        if (num1 == -1)
            num1 = 99999;
        if (num2 == -1)
            num2 = 99999;
        if (num3 == -1)
            num3 = 99999;
        if (num1 < num2 && num1 < num3)
            return num1;
        if (num2 < num1 && num2 < num3)
            return num2;

        return num3;
    }
    //This method check for the operator precedence  pmd%modas
    public String getPrecedence(String cString) {
        int index1 = -1;
        int index2 = -1;
        int index3 = -1;
        String cStringOld = cString;
        String result = "";
        boolean flag = true;
        while (flag) {
            // indexing for operation.
            cStringOld = cString;
            index1 = -1;
            index2 = -1;
            index3 = -1;
            index3 = getFisrtoperator(cString.lastIndexOf("\\"), cString.lastIndexOf("\u00F7"), cString.lastIndexOf("*"));
            if (index3 == 99999) {
                flag = false;
            } else {
                // checking for un allowed strings
                index1 = getOpratroIndex(cString, -1, index3);
                index2 = getOpratroIndex(cString, 1, index3 + 1);
                if (index2 < 0) {

                    JOptionPane.showMessageDialog(null,
                            "INVALID INPUT!",
                            "Error:", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }

                result = calculation(cString.substring(index1, index2));

                cString = cString.substring(0, index1) + result + cString.substring(index2, cString.length());
            }

        }
        if (index2 < 0)
            return cStringOld;
        else

            return calculation(cString);

    }
    // This method will find the Inedx of Operation
    // base on the index we find check with the operation  order and if its inside the Parenthesis
    public int getOpratroIndex(String cString, int dir, int startIndex) {
        int index = -1;
        if (dir == -1) {
            /// looping to get till find the operation in string  the loop is self explanatory
            for (int i = startIndex; i > 0; i--) {
                String key = cString.substring(i - 1, i);

                switch (key) {

                    case "\\":
                        index = i;
                        //keyString = "";
                        break;
                    case "\u00F7":
                        index = i;
                        //keyString = "";
                        break;
                    case "+":
                        index = i;
                        //keyString = "";
                        break;
                    case "\u208B":
                        index = i;
                        break;
                    case "*":
                        index = i;
                        break;

                }
                if (index > -1)
                    break;
            }
            if (index == -1)
                index = 0;
        } else {

            for (int i = startIndex; i < cString.length(); i++) {
                String key = cString.substring(i, i + 1);

                switch (key) {

                    case "\\":
                        index = i;
                        //keyString = "";
                        break;
                    case "\u00F7":
                        index = i;
                        //keyString = "";
                        break;
                    case "+":
                        index = i;
                        //keyString = "";
                        break;
                    case "\u208B":
                        index = i;
                        break;
                    case "*":
                        index = i;
                        break;


                }
                if (index > -1)
                    break;


            }
            if (index == -1)
                index = cString.length();
        }

        return index;
    }
    // This method is looking for the last opening ( and fist ) and match them to see what we have
    public String searchPranteste(String cString) {
        int index1 = 0;
        int index2 = 0;
        String cStringOld = cString;
        String result = "";
        // looping till we have (
        while (cString.indexOf("(") > 0) {
            // finding last opened ( in string
            index1 = cString.lastIndexOf("(");
            // find the first closed ) in String
            index2 = cString.indexOf(")", index1);
            if (index2 < 0) {
                // if input was not valid show a warning message.
                JOptionPane.showMessageDialog(null,
                        "INVALID INPUT!",
                        "Error:", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            // Searching for the last opening ( and last closed )
            //cString.in
            result = getPrecedence(cString.substring(index1 + 1, index2));
            result = calculation(result);

            //cString = cString.replaceFirst(cString.substring(cString.indexOf("(") +1 , cString.indexOf(")")),result);
            cString = cString.substring(0, index1) + result + cString.substring(index2 + 1, cString.length());
        }

        cString = getPrecedence(cString);
        if (index2 < 0)
            return cStringOld;
        else

            return calculation(cString);

    }

// Taking care of calculation of the expression using the each operation.
    public String calculation(String cString) {
        //cString = searchPranteste(cString);
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        String opreation = "";
        String opreation1 = "";
        String opreation2 = "";
        boolean opr1Flag = false;
        boolean opr2Flag = false;
        boolean num1Flag = false;
        boolean num2Flag = false;
        String keyString = "";
        for (int i = 0; i < cString.length(); i++) {
            String key = cString.substring(i, i + 1);

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
                case ".":
                    keyString += key;
                    break;
                case "-":
                    keyString += key;
                    break;


                case "\\":
                    opr1Flag = true;
                    opreation1 = "mod";
                    //keyString = "";
                    break;
                case "\u00F7":
                    opr1Flag = true;
                    opreation1 = "div";

                    //keyString = "";
                    break;
                case "+":
                    opr1Flag = true;
                    opreation1 = key;
                    //keyString = "";
                    break;
                case "\u208B":
                    opr1Flag = true;
                    opreation1 = key;
                    //keyString = "";
                    break;
//                case "\u221A":
//                    opr1Flag = true;
//                    opreation1 = key;
                case "*":
                    opr1Flag = true;
                    opreation1 = key;
                    //keyString = "";
                    break;
                case "%":
                    opr1Flag = true;
                    opreation1 = key;
                    //keyString = "";
                    break;
            }
            if (opr1Flag) {
                opr1Flag = false;
                if (!num1Flag) {
                    num1Flag = true;
                    num1 = Double.parseDouble(keyString);
                    if (opreation1.equals("\u221A")) {

                    } else {
                        opreation2 = opreation1;
                        opreation = "";
                        keyString = "";
                    }


                } else {
                    if (!keyString.equals("")) {
                        num2 = Double.parseDouble(keyString);
                        num1 = myCalculation(num1, num2, opreation2);
                    }
                    opreation2 = opreation1;
                    opreation = "";
                    keyString = "";
                    num2 = 0;
                }
            }
        }
        if (!opr1Flag && !num1Flag) {
            num1 = Double.parseDouble(keyString);
        }
        if (num1Flag) {
            if (!keyString.equals("")) {
                num2 = Double.parseDouble(keyString);
                num1 = myCalculation(num1, num2, opreation2);
            }
            opreation2 = opreation1;
            opreation = "";
            num2 = 0;
        }
        return String.valueOf(num1);
    }
    // using operation to do calculate between two number that need to be done at the moment
    private double myCalculation(double num1, double num2, String operation) {
        double result = 0;
        switch (operation) {
            case "div":
                // in case if number get divided by 0 show a warning message
                if ((num2 == 0) || (num2 == 0.0)) {
                    JOptionPane.showMessageDialog(null,
                            "INVALID INPUT! you can't divide by zero",
                            "Error:", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }

                // the rest is self explanatory
                result = (num1 / num2);
                break;
            case "mod":
                result = (num1 % num2);
                break;
            case "+":
                result = (num1 + num2);
                break;
            case "\u208B":
                result = (num1 - num2);
                break;
            case "*":
                result = (num1 * num2);
                break;
            case "%":
                result = ((num1 / 100) * num2);
                break;
        }
        return result;
    }

}
