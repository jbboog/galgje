import java.util.Scanner;
// Nog te doen: beurten maken (nieuw class en object)
// clean-up!
public class Galgje {

  public static void main(String[] args) {
    Galgje gg = new Galgje();
    gg.spel();

  }

  public String kies_woord() {
    System.out.println("kies een woord");
    Scanner input = new Scanner(System.in);
    String gekozen_woord = input.nextLine();
    //input.close();

    return gekozen_woord;
  }

  public char raad_letter() {
    System.out.println("raad een letter");
    Scanner letter_input = new Scanner(System.in);
    String geraden_letter = letter_input.nextLine(); //waarom doe je dit eigenlijk
    //letter_input.close();

    return geraden_letter.charAt(0);
  }
  public String raad_woord() {
    Scanner woord_input = new Scanner(System.in);
    String geraden_woord = woord_input.nextLine();
    //woord_input.close();

    return geraden_woord;
  }

  public char char_indices(String w, int ind) {
    return w.charAt(ind);
  }

public StringBuilder sb(String woordkeuze) {
  StringBuilder s = new StringBuilder();
  s.setLength(woordkeuze.length());
  return s;
}

  public void spel() {
    String woord = kies_woord();
    int index = woord.length() - 1;
    char gok = raad_letter();
    StringBuilder goed = sb(woord);




    while(index >= 0) {
      if( char_indices(woord, index) == gok) {
        goed.setCharAt(index, gok);

      }
      else {
        char streep = '-';
        goed.setCharAt(index, streep);
      }
      index --;
    }

    System.out.println(goed);


}
}
