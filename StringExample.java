public class StringExample {
    public static void main(String args[])
    {
        String s="Hello world";
        //String functions
        //String length
        System.out.println(s.length());
        //concat
        String s1="Hello";
        String s2="world";
        String s3="hello world";
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1 + " " + s2);
        //char at
        System.out.println(s1.charAt(4));
        //contains functions
        System.out.println(s.contains("world"));
        //equals and equal Ignore Case
        System.out.println(s.equals(s3));
        System.out.println(s.equalsIgnoreCase(s3));
        //replace functions
        System.out.println(s.replace('H','b'));
        System.out.println(s.replace("world","Sivaram"));
        //substring
        String sub=s.substring(6); //from starting index 6 to all 
        System.out.println(sub);
        String sub1=s.substring(6,8);//from starting index to end-1 given end index that means end index is excluded
        System.out.println(sub1);
        //case conversion
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        //trim
        String st="       hello        ";
        System.out.println(st.trim()); //trimming the space left and right side
        char[] chr=s.toCharArray();
        for(char a:chr)
        {
            System.out.println(a);
        }
    }
}
