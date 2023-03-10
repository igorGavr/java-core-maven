package lessons.lesson2.arraylist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @NonNull
    private int id;
    @NonNull
    private String name;
    private ArrayList<String> skills = new ArrayList<>();
}
