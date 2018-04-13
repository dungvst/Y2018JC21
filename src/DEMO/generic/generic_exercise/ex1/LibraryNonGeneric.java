package DEMO.generic.generic_exercise.ex1;

import java.util.ArrayList;
import java.util.List;

public class LibraryNonGeneric {
    private List resource = new ArrayList<Media>();

    public void addMedia(Media media){
        resource.add(media);
    }

    public Media getLastResource(){
        if(resource.size() > 0){
            return (Media) resource.get(resource.size() - 1);
        }else{
            return null;
        }

    }
}
