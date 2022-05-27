public class Embolden
{
    public static void main(String[] args) {
        String s="abcdefg";
        String[] Lst={"bcd","ef"};
        String Output="";
        String BTOpen="<b>";
        String BTClosed="</b>";

                int j=0;
                int to=0;
                for(int i=0;i<Lst.length;i++)
                {

                    int temp=s.indexOf(Lst[i]);
                    int size=Lst[i].length();
                    to=temp+size;
                    Output+=s.substring(j,temp)+BTOpen+Lst[i]+BTClosed;
                    j=j+to;
                }
                Output+=s.substring(to);



        System.out.println(Output);

    }

}
