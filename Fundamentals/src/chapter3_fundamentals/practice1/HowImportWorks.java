// 'Import' Issue  -> How import works

package chapter3_fundamentals.practice1;

import java.util.ArrayList;


import chapter3_fundamentals.chapter3_support.practice1.List;     // same Classname from different package can not be imported multiple time
//import java.util.List;                    // same Classname from different package can not be imported multiple time


public class HowImportWorks {
    public static void main(String[] args) {
        List list ;

        chapter3_fundamentals.chapter3_support.practice1.List  list2= new List();     // but this is allowed
        java.util.List<Object> list3 = new ArrayList<>();       // but this is allowed

    }
}
