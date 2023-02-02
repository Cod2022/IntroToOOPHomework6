/*
 * Создать калькулятор для работы с рациональными и комплексными числами, 
 * организовать меню, добавив в неё систему логирования (с использованием паттерна MVC и ООП).
 */
package MyCalc;

import MyCalc.models.RationalCalc;
import MyCalc.presenter.Presenter;
import MyCalc.view.View;

public class Main {
    public static void main(String[] args) {
        
        String input = "4/5+4/2";
        String input2 = "3x + 6g - 4c";

        Presenter p = new Presenter(new RationalCalc(), new View());
        p.startProgram(View.userInput());    
    }

}

