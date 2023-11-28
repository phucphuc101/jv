public class DemSoLanLapKiTuTrongXau{
    public static void main (String[] args) 
    {
        int []mangDem = new int [Character.MAX_VALUE];
        String str = "Khong duoc dung den toi!";
        for(int i=0;i<str.length();i++)
        {
            try 
            {
                mangDem[str.charAt(i)] ++;
            } catch(StringIndexOutOfBoundsException e) 
            {
                System.out.println("Chi so vuot qua gioi han");
            } 
            
        }
        for(int i=0;i<mangDem.length;i++)
        if(mangDem[i]!=0)
        System.out.println((char)i + ":" + mangDem[i]);
    }
}