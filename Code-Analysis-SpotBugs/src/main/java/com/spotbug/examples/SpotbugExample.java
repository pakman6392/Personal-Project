package main.java.com.spotbug.examples;

public class SpotbugExample {
    
    //Unused field
    private int unused;

    // Do not hard code the IP address
    private String address = "127.0.0.1";

    public void test() {

        String[] field = {"a", "b", "c", "s", "e"};

        //concatenates strings using + in a loop
        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(address);

    }
}
