package MyCalc.models;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CalcModel implements Model{
    String stringInput;
    Pattern pNum;
    Pattern pAct;
    Matcher mNum;
    Matcher mAct;
    List<Integer> nums;
    List<String> acts;
    
}
