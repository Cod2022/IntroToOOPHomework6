package MyCalc.models;

import java.util.List;

public interface Model {
   
   RationalCalc splitString(String input);

   List<Integer> getNums();

   List<String> getActs();

   String calcRational(RationalCalc rationalCalc);
}
