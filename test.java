public class test{
    public static void main(String[] args) {

        final String STRING1 = "SUBJECT";
        final String STRING2 = "MARKS";
        final String STRING3 = "STATUS";

        String item1 = "Apples";
        int quant1 = 5;
        float price1 = 0.99f;

        String item2 = "Oranges";
        int quant2 = 10;
        float price2 = 1.49f;

        final String DOLLER = "$";

        final String SET1 = "\033[1m";
        final String SET2 = "\033[34m";
        final String SET3 = "\033[31m";
        final String SET4 = "\033[32m";
        final String SET5 = "\033[33m";
        final String RESET = "\033[0m";        

        final String ROW = "+"+"-".repeat(12)+"+"+"-".repeat(8)+"+"+"-".repeat(6)+"+";
        final String DATA = "%9$s|%4$s%1$-12s%9$s|%4$s%3$s%2$8s%4$s%9$s|%4$s%8$s%6$s%4$s%7$s%5$-5s%4$s%9$s|%4$s\n";
        

        System.out.println(SET5+ROW+RESET);
        System.out.printf("%6$s|%2$s%1$s%3$-12s%2$s%6$s|%2$s%1$s%4$-3s%2$s%6$s|%2$s%1$s%5$6s%2$s%6$s|%2$s\n",SET1,RESET,STRING1,STRING2,STRING3,SET5);
        System.out.println(SET5+ROW+RESET);
        System.out.printf(DATA,item1,quant1,SET2,RESET,price1,DOLLER,SET3,SET4,SET5);
        //System.out.println();
        System.out.printf(DATA,item2,quant2,SET2,RESET,price2,DOLLER,SET3,SET4,SET5);
        System.out.println(SET5+ROW+RESET);
        
    }
    
}
