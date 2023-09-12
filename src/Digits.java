import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;
    public Digits(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("The number passed to the constructor ("+num+") cannot be negative!");
        }
        digitList = new ArrayList<>();
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); ++i) {
            digitList.add(Integer.parseInt(Character.toString(s.charAt(i))));
        }
    }
    public ArrayList<Integer> getDigitList() {return digitList;}
    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < digitList.size(); ++i) {
            if (digitList.get(i) <= digitList.get(i-1)) return false;
        }
        return true;
    }
}
