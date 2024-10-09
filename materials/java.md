## Class:
* Class is a collection of related code.
* Class name should match the name of file name.
```java

class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```


## Variables and Data Types:
[Java Data types](https://www.javatpoint.com/java-data-types)
- Integer `int a = 5`
- String `String a = “apple”`
- Float `float pi = 3.14`
- Double `double pi = 3.14`
- Boolean `boolean value = true`
- Char `char letter = ‘r’`

```java
// Int to double conversion
int number1 = 5;
double number2 = number1;

// double to int conversion
double number3 = 5.8;
int number4 = (int)number3;

System.out.println(number2);
System.out.println(number4);
```

### Primitive data types
primitive data types are the building blocks of data manipulation. These are the most basic data types available in Java language.
* The primitive data types include boolean, char, byte, short, int, long, float and double.
### Non-primitive data types
The non-primitive data types include Classes, Interfaces, and Arrays

### Print Statement
print statement to display variable

```java
String name = "Jamba";
String category = "Smoothie store";
System.out.println("Good day, I am a representative of " + name + " and we sell " + category + ".");

// Formatted string

String formattedOutput = String.format("Good day, I am a representative of %s and we sell %s.", name, category);
System.out.println(formattedOutput);

```
* int -> `%d`
* float -> `%f`
* char -> `%c`
* bool -> `%b`

## Arrays

```java
        int[] a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;

int[] ac = {2,5,9,1,7}; 

# Other way of declaraion
        int[] ab;
        ab = new int[]{2, 6, 4, 2};

# String declaraion with size
        String[] names = new String[3];
        names[0] = "Ayan";
        names[1] = "Baniya";
        names[2] = "Choco";

# Other way of declaration
        String[] school;
        school = new String[]{"Alpha", "Bonville", "Carrolton"};

# Martrix array declaration
        String[][] courses;
        courses = new String[][]{{"Botany", "Zoology"}, {"Molecular", "Clinical"}, {"trignometry", "algebra"}};
```

#### String methods
* `String.isempty();` --> Check if String is empty
* `String.toUpperCase()` --> convert to uppercase
* `String.toLowerCase()` --> convert to lowercase
* `String.replace("abc", "xyz")` --> Replace part of string.

#### Java take input from command line:
```java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s , how old are you? ", name);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("As you are %d, you are qualified to apply. What do you intend to apply for? ", age);
        String visaType = scanner.nextLine();

        System.out.printf("%s is eligible for your age. Please continue.", visaType);

        scanner.close();
```

## Arrays

Array is a data structure that can store fixed size of elements of same data type.

```java
public class loops {

    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5,6,7,8,9,10, 23, 32, 252,414};

        for(int a :numbers) {
            if(a % 2 == 0) {
                System.out.println(a + " is even");
            }
            else {
                System.out.println(a + " is not even");
            }
        }
    }
}

```

## Array List
Array list is a resizable array which is found in Java.util package. In ArrayList size of array is `dynamic`.
Syntax is slightly different compared to regular arrays.

```java
        ArrayList<String> andy = new ArrayList<String>();
        andy.add("Nicole");
        andy.add("is");
        andy.add("on");
        andy.add("call");
        andy.add("today");
        System.out.println(andy);
        System.out.println("ArrayList size is " + andy.size());
        System.out.println(andy.get(2));

        //check if a string is present in Array list
        System.out.println(andy.contains("call"));
```

## Convert Array to Array list

```java
List<String> namesArrayList = Arrays.asList(names);
System.out.println(namesArrayList.contains("Baniya"));

```

**String**: String is an object in Java that represents sequence of characters.

A string object can be created in two ways in Java, The first one is by using string literal and the second one is by using the new keyword. The string object created with the string literal get stored in the string constal poll in the memory.

```java
String S1 = "Andua";
String S2 = new String("Brindall");
```


## Methods
A **method** is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

*Why use methods? To reuse code: define the code once, and use it many times.*

* `myMethod()` is the name of the method
* `static` means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
* `void` means that this method does not have a return value. You will learn more about return values later in this chapter.

```java


```

## Interface
An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behavior. A Java interface contains static constants and abstract methods.

* Interface uses `implements`.

```java
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## Abstraction
Data abstraction is the process of hiding certain details and showing only essential information to the user.
* Abstraction uses `extends`

```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}



// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

### Interface vs Abstraction

## Inheritance
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

**subclass** (child) - the class that inherits from another class

**superclass** (parent) - the class being inherited from
To inherit from a class, use the `extends` keyword.



## Method/Function Overloading
With method overloading, multiple methods can have the same name with different parameters.

```java
public class methodOverloading {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        int result = sum(9, 10, 3);
        int result2 = sum(4, 6);

        System.out.println(result);
        System.out.println(result2);
    }

}
```

## method overriding
In Java, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, the same parameters or signature, and the same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.

## Date Class
The class Date represents a specific instant in time, with millisecond precision. The Date class of java.util package implements Serializable, Cloneable and Comparable interface. It provides constructors and methods to deal with date and time with java.

**Simple date format** [link](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html)

## Calendar object
Calendar class in Java is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc. It inherits Object class and implements the Comparable, Serializable, Cloneable interfaces.

As it is an Abstract class, so we cannot use a constructor to create an instance. Instead, we will have to use the static method Calendar.getInstance() to instantiate and implement a sub-class.

`Calendar.getInstance()`: return a Calendar instance based on the current time in the default time zone with the default locale.
`Calendar.getInstance(TimeZone zone)`
`Calendar.getInstance(Locale aLocale)`
`Calendar.getInstance(TimeZone zone, Locale aLocale)`

```java
package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub
//current date..current time./
Date d= new Date();

SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
System.out.println(sdf.format(d));
System.out.println(sd.format(d));
System.out.println(d.toString());




}

}
```

## Constructor
A constructor is a special method that is used to initialize an object.Every class has a constructor,if we don't explicitly declare a constructor for any java class the compiler builds a default constructor for that class. A constructor does not have any return type.

A constructor has same name as the class in which it resides. Constructor in Java can not be abstract, static, final or synchronized. These modifiers are not allowed for constructor.
```java
class Car
{
 String name ;
 String model;
 Car( )    //Constructor 
 {
  name ="";
  model="";
 }
}
```

## Super keyword:

## This keyword:

### Instance varaibles

### Local variables

### Class Variables

### Static keyword

### Static method & Static variables

### Static blocks

## Packages

## Access Modifiers
http://javabeginnerstutorial.com/core-java-tutorial/access-modifier-in-java/

## Exceptions

## Collections

### List
A list is a ordered collection(sometimes called a sequence). List may contain duplicate elements.

#### ArrayList
#### LinkedList
#### Vector

### Set
* `Set` doesn't allow duplicate values.
* Elements are not stored in *Sequential* order.


#### Hash Set

#### Tree Set

#### Linked Hash Set

### Hash map:
* Stored in keyValue pairs `key;value`

### Hash map vs Hash Table
* Hashmap allows null values whereas Hashtable doesn't.



#### iterator









