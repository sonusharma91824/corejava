package array;

public class PrintAlternates {
    public static void main(String[] args) {
        String s[] ={"sonu","nonu","monu","sanu","ranu","mahi","panu"};
        int count=0;

        for(String st : s){
            count++;
            if(count%2!=0)
            {
                System.out.println(st);
            }
        }
    }
}
