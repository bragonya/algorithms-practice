package main.generics;

import java.util.ArrayList;
import java.util.List;


public class Wildcards {



    public <T> void copy(List<? extends T> copied, List<? super T> copy){
        copy.addAll(copied);
        System.out.println(copy);
    }

    public <T> void verification(List<? extends T> from, List<T> to){
        to.addAll(from);
    }

    public void test(){
        verification(new ArrayList<String>(), new ArrayList<Object>());
    }
}
