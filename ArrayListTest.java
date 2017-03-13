import java.util.ArrayList;

class ArrayListTest
{
    public static void main (String[] args) 
    {
        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.set(0,"February");
        System.out.println(months.get(0));
        System.out.println(months.size());
    }
}