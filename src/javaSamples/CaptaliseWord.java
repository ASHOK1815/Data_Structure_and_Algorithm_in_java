package javaSamples;

public class CaptaliseWord {


    public static String ConvertUpperCase( StringBuilder sentence) // method to convert in upper case
    {
        boolean SpacePresentLast = true; // checking whether the last character is whitespace
        for(int i = 0; i < sentence.length(); i++)
        {
            char character = sentence.charAt(i);

            if(SpacePresentLast && character >= 'a' && character <='z')
            {
                sentence.setCharAt(i, (char)(character + ('A' - 'a') )); // logic to convert it into upper case
                SpacePresentLast = false;
            }
            else if (character != ' ')
                SpacePresentLast = false;
            else
                SpacePresentLast = true;
        }

        return sentence.toString();
    }

    public static String ChangeCase(String str)
    {
        StringBuilder sentence = new StringBuilder(str);

        return  ConvertUpperCase(sentence); // returning of the change case sentence
    }


    public static void main(String[] args) {

        System.out.println(ChangeCase("Hello world"));
        System.out.println(ChangeCase("a letter"));

    }
}
