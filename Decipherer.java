
class Decipherer {

    public static String[] messageArray = {
        "0@sn9sirppa@#?ia'jgtvryko1",
        "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
        "aopi?sedohtém@#?sedhtmg+p9l!"
    };
    
    /**
     * @param String
     * @return String
     */
    public static String dechiffrement (String alpha) {
        
        int calcule = alpha.length()/2;

        String souschaine = alpha.substring(5, 5 + calcule);

        String changement = souschaine.replace("@#?", " ");

        StringBuilder sb = new StringBuilder(changement);
        sb.reverse();

       return sb.toString();
    }

    public static void main (String[] args) {
        System.out.println(dechiffrement(messageArray[0]));
        System.out.println(dechiffrement(messageArray[1]));
        System.out.println(dechiffrement(messageArray[2]));
    }

}