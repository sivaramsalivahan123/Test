public class StringReverse {
    public static void main(String args[])
    {
        String s="sivaram";
        //reversing method1
        int len=s.length()-1;
        String reverse="";
        for(int i=len;i>=0;i--)
        {
            reverse+=s.charAt(i);
        }
        System.out.println(reverse);

        //reversing method2
        char[] cha=s.toCharArray();
        for(int i=0,j=cha.length-1;i<cha.length/2;i++,j--)
        {
            char t=cha[i];
            cha[i]=cha[j];
            cha[j]=t;
            
        }
        for(char ch: cha)
        {
            System.out.print(ch);
        }
    }
}
