package JavaYT;

//problem 1

class Employee {
  int salary;
  String name;

  public int getSalary() {
    return salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String n) {
    name = n;
  }
}

// problem 2
class cellphone {
  public void ring() {
    System.out.println("Ringing...");
  }

  public void vibrate() {
    System.out.println("Vibrating...");
  }
}

// problem 3
class square {
  int side;

  public int area() {
    return side * side;
  }

  public int perimeter() {
    return 4 * side;
  }
}

// problem 4
class rectangle {
  int length;
  int width;

  public int area1() {
    return length * width;
  }

  public int perimeter1() {
    return 2 * length * width;
  }
}

// problem 5
class Tommy {
  public void hit() {
    System.out.println("Hit the enemy");
  }

  public void run() {
    System.out.println("Running for escape");
  }

  public void fit() {
    System.out.println("Try to fit in the car for escape");
  }
}

// problem 6
class circle {
  int radius;
  float pie;

  public float area2() {
    return pie * radius * radius;
  }

  public float perimeter3() {
    return 2 * pie * radius;
  }
}

public class praticeOops {
  public static void main(String[] args) {
    // problem 2

    cellphone rox = new cellphone();
    rox.ring();
    rox.vibrate();

    // problem 3
    square math = new square();
    math.side = 8;
    System.out.println("The area of a square is " + math.area());
    System.out.println("The perimeter of a square is " + math.perimeter());
    System.out.println();// adding space between answers
    // problem 4
    rectangle poll = new rectangle();
    poll.length = 5;
    poll.width = 4;
    System.out.println("The area of a rectangle is " + poll.area1());
    System.out.println("The perimeter of a rectangle is " + poll.perimeter1());

    System.out.println();// adding space between answers
    // problem 5
    Tommy game = new Tommy();
    game.hit();
    game.run();
    game.fit();

    System.out.println();// adding space between answers
    // problem 6
    circle pitron = new circle();
    pitron.radius = 4;
    pitron.pie = 3.14f;
    System.out.println("The area of circle is " + pitron.area2());
    System.out.println("The perimeter of circle is " + pitron.perimeter3());
  }

}
