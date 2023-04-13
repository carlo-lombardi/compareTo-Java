package compareTo;

public class Circle implements Comparable<Circle>{
    String letter;
    
    public Circle(String string) {
        this.letter = string;
    }
    
    @Override
    public int compareTo(Circle other) {
        int result = this.letter.compareToIgnoreCase(other.letter);//Compare the letter ignoring case
        return result;
    }
    
}
