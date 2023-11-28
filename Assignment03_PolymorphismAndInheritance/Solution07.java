/**
 * @question: Create a class EMP having instance variable name and id. Create
 *            its subclass (say Scientist) which has instance variable
 *            no_of_publication and experience. Now create its subclass, say
 *            Dscientist which has instance variable award. Put a method: public
 *            String toString () { } in every class where you describe about the
 *            class and from main create object of each class and print each
 *            object.
 * @author: Nirmalya Dhara 
 * @date: 22 Nov, 2023
 */
package assignment03Classes;

class EMP {
    String name;
    int id;

    EMP(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + this.id + ", name: " + this.name;
    }
}

class Scientist extends EMP {
    int no_of_publication;
    double experience;

    Scientist(int id, String name, int no_of_publication, double experience) {
        super(id, name);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    public String toString() {
        return super.toString() + ", total no. of publication : " + this.no_of_publication + ", experience : "
                + this.experience + " years,";
    }
}

class Dscientist extends Scientist {
    int award;

    Dscientist(int id, String name, int no_of_publication, double experience, int award) {
        super(id, name, no_of_publication, experience);
        this.award = award;
    }

    public String toString() {
        return super.toString() + " total no of awards : " + this.award;
    }
}

public class Solution07 {
    public static void main(String[] args) {
        EMP emp = new EMP(27, "Clark Kent");
        Scientist scientist = new Scientist(9, "Bruce Wayne", 7, 5);
        Dscientist dscientist = new Dscientist(18, "Victor Stone", 3, 1, 5);
        System.out.println(emp);
        System.out.println(scientist);
        System.out.println(dscientist);
    }
}
