

public class quizCorrections{
  public static void main(String[] args){
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";
    String FirstInitial = firstName.substring(0,1);
    String secondInitial = middleName.substring(0,1);
    String lastInitial = lastName.substring(0,1);
    String Initials = FirstInitial + secondInitial + lastInitial;
    String Int = Initials.toLowerCase();
    System.out.println(Int);
  }
}
