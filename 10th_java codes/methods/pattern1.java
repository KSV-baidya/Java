// I
// IG
// IGM
// IGMS
// IGMSS
// IGMSSS

public class pattern1 {
    String s = "IGMSSS";
     void display(){
        char ch ;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                ch = s.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        pattern1 ob = new pattern1();
        ob.display();
    }
    
}
