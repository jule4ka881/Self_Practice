package day27_practices;

public class Person {

   public String name;
   public int age;            //instance variables, will be called through the object
   public char gender;
   public String language;


   public static String planet;
   public static boolean isHuman, hasNose, canBreath;
   public static int numberOfWings,numberOfHead;

  //static variables, will call them through the class name


   static {
      planet = "Earth";
      isHuman = true;
      hasNose = true;
      canBreath = true;   //this is static block, we use it to initialize static variables
      numberOfWings = 0;
      numberOfHead = 1;
   }

   public Person(String name, int age, char gender, String language) {
      this.name = name;
      this.age = age;               //this is Constructor, to initialize instance vars
      this.gender = gender;
        this.language = language;   //will be executed every time object is created

   }



   public void printPlanetName(){
      System.out.println(name + " from the planet " + planet);
   }
   public void eat(String food){
      System.out.println(name + " is eating "+food);
   }
   public void drink(String drink){
   System.out.println(name+" is drinking "+drink);
}

      public String toString() {
      return "Person{" +
              "name='" + name + '\'' +    //This is String Method
              ", age=" + age +
              ", gender=" + gender +
              ", language='" + language + '\'' +
              ", planet='" + planet + '\'' +
              ", isHuman=" + isHuman +
              ", hasNose=" + hasNose +
              ", numberOfWings=" + numberOfWings +
              ", numberOfHead=" + numberOfHead +
              '}';
   }
}

/*
Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */