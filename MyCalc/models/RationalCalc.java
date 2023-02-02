package MyCalc.models;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RationalCalc extends CalcModel{

    public RationalCalc() {
        
    }
    
    public RationalCalc(List<String> acts, List<Integer> nums) {
        this.acts = acts;
        this.nums = nums;
    }

    @Override
    public RationalCalc splitString(String input) {
        this.pNum = Pattern.compile("\\d+");
        this.pAct = Pattern.compile("[+\\-*:]");
        this.nums = new ArrayList<>();
        this.acts = new ArrayList<>();
        this.mNum = pNum.matcher(input);
        this.mAct = pAct.matcher(input);

        while (mNum.find()) {
            nums.add(Integer.parseInt(mNum.group()));
        }

        while (mAct.find()) {
            acts.add(mAct.group());
        }

        return new RationalCalc(acts, nums);
    }

    @Override
    public List<Integer> getNums() {
        return this.nums;
    }

    @Override
    public List<String> getActs() {
        return this.acts;
    }


    @Override
    public String toString() {
        return String.format("acts: nums:", this.acts, this.nums);
    }

    @Override
    public String calcRational(RationalCalc rationalCalc) {
        StringBuilder resString = new StringBuilder();
        double sumNum = 0;
        double sumDenom = 0;
        for (String item : rationalCalc.getActs()) {
            if (item.equals("+")) {
                for (int i = 0; i < rationalCalc.getNums().size(); i+=2) {
                    sumNum = sumNum + rationalCalc.getNums().get(i);
                }
                resString.append(sumNum);
                for (int i = 1; i < rationalCalc.getNums().size(); i+=2) {
                    sumDenom = sumDenom + rationalCalc.getNums().get(i);
                }
                resString.append("/");
                resString.append(sumDenom);
            }
            if (item.equals("-")) {
                double sumNumMin = rationalCalc.getNums().get(0);
                for (int i = 2; i < rationalCalc.getNums().size(); i+=2) {
                    sumNumMin = sumNumMin - rationalCalc.getNums().get(i); 
                }
                resString.append(sumNumMin);
                double sumDenomMin = rationalCalc.getNums().get(1);
                for (int i = 3; i < rationalCalc.getNums().size(); i+=2) {
                    sumDenomMin = sumDenomMin - rationalCalc.getNums().get(i);
                }
                resString.append("/");
                resString.append(sumDenomMin);
            }

        }

        return resString.toString();
    }
    
}

