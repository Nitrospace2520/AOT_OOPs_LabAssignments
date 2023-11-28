/**
 * @question: Write a Java Program to create a base class Animal having properties: consume food, capable of motion. Two subclasses Mammal and Reptile having features: covered with hairs and feed breast milk to its infants, can crawl, have scales and cold blooded respectively. Show the properties of Human and cow for Mammal category, snake and crocodile for reptile category adding one new feature for each of the classes.
 * @author: Nirmalya Dhara
 * @date: 23 Nov, 2023
 */
package assignment04Classes;

class Animal {
    boolean canConsumeFood;
    boolean isCapableOfMotion;

    Animal(boolean canConsumeFood, boolean isCapableOfMotion) {
        this.canConsumeFood = canConsumeFood;
        this.isCapableOfMotion = isCapableOfMotion;
    }

    public String toString() {
        return (this.canConsumeFood ? " can comsume food," : "")
                + (this.isCapableOfMotion ? " capable of motion," : "");
    }
}

class Mammal extends Animal {
    boolean isCoveredWithHairs;
    boolean canFeedBreastMilk;

    Mammal(boolean canConsumeFood, boolean isCapableOfMotion, boolean isCoveredWithHairs, boolean canFeedBreastMilk) {
        super(canConsumeFood, isCapableOfMotion);
        this.isCoveredWithHairs = isCoveredWithHairs;
        this.canFeedBreastMilk = canFeedBreastMilk;
    }

    public String toString() {
        return (super.toString() + (this.isCoveredWithHairs ? " covered with hairs," : "")
                + (this.canFeedBreastMilk ? " capable of feeding breast milk to infants," : ""));
    }
}

class Reptile extends Animal {
    boolean canCrawl;
    boolean haveScales;
    boolean isColdBlooded;

    Reptile(boolean canConsumeFood, boolean isCapableOfMotion, boolean canCrawl, boolean haveScales,
            boolean isColdBlooded) {
        super(canConsumeFood, isCapableOfMotion);
        this.canCrawl = canCrawl;
        this.haveScales = haveScales;
        this.isColdBlooded = isColdBlooded;
    }

    public String toString() {
        return (super.toString() + (this.canCrawl ? " can crawl," : "")
                + (this.haveScales ? " has scales," : "")
                + (this.isColdBlooded ? " is cool blooded," : ""));
    }
}

public class Solution05 {
    public static void main(String[] args) {
        Mammal human = new Mammal(true, true, false, true);
        Mammal cow = new Mammal(true, true, true, true);
        Reptile snake = new Reptile(true, true, true, true, true);
        Reptile crocodile = new Reptile(true, true, false, true, false);

        System.out.println("Human" + human);
        System.out.println("Cow" + cow);
        System.out.println("Snake" + snake);
        System.out.println("Crocodile" + crocodile);
    }
}
