public class BinOps {
    public String sum(String a, String b) {
        try {
            return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String mult(String a, String b) {
        try {
            return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
            return "";
        }
    }
}
