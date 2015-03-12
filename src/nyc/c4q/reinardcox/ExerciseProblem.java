package nyc.c4q.reinardcox;

/* ***********************************
 * \n	New line                    *
 * \t	Tab                         *
 * \b	Backspace                   *
 * \r	Carriage return             *
 * \f	Formfeed                    *
 * \\	Backslash                   *
 * \'	Single quotation mark       *
 * \"	Double quotation mark       *
 * \d	Octal                       *
 * \xd	Hexadecimal                 *
 * \ ud	Unicode character           *
 *********************************** */

public class ExerciseProblem {
    public static void main(String[] args) {
        //What's the difference between a number and a string

        System.out.println(42); //real number
        System.out.println("42"); //string

        System.out.println(42.0); //double or float
        System.out.println(42.0000); //double or float
        System.out.println("42.0000"); //string
        System.out.println(41.999999999999999); //Fifteen 9's | real number
        System.out.println("41.999999999999999"); //string

        System.out.println(17 + 25); //real number
        System.out.println("17" + "25"); //combine string
        System.out.println("17" + 25); //number turned into a string
        System.out.println(17 + "25"); //number turned into a string

    }
}
