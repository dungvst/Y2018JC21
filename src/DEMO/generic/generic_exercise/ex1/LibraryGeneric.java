package DEMO.generic.generic_exercise.ex1;

import java.util.ArrayList;
import java.util.List;

public class LibraryGeneric<T extends Media> {
    private List<T> resource = new ArrayList<T>();
    public void addMedia(T media){
        resource.add(media);
    }

    public T getLastResource(){
        if(resource.size() > 0){
            return resource.get(resource.size() - 1);
        }else{
            return null;
        }

    }
}
