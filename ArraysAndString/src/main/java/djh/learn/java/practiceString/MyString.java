package djh.learn.java.practiceString;

public class MyString {
    public static void main(String[] args) {

        String str = "ILoveYou";
        String str2 = "ILOVEYOU";
        /*char[] array = str.toCharArray();
        for (int i=0;i< array.length;i++){
            if(array[i]>='A' && array[i]<='Z'){
                if(i!=0){
                    System.out.println("");
                }
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]);
            }
        }*/

        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.codePointAt(4));
        System.out.println((int)'e');
        System.out.println(str.getBytes());
        StringBuffer buffer = new StringBuffer("ILoveYou");
        CharSequence charSequence = new StringBuffer("ILoveYou");
        System.out.println(str.contentEquals(buffer));
        System.out.println(str.contentEquals(charSequence));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareToIgnoreCase(str2));
        System.out.println(str.regionMatches(0,"ve",0,8));

        for (int i = 0; i < str.length(); i++) {
            String sub = str.substring(i);
            if(sub.startsWith("o") ){
                System.out.println(sub);
                if(sub.charAt(2)=='e'){
                    System.out.println("Found!");
                    break;
                }


            }
        }


        String[] r = str.split("(?=[A-Z])");
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }

    }
}
