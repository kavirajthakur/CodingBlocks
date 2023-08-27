package OOPS;

public class class_and_objects_creation {
    public static void main(String[] args) {
        Pen p1 = new Pen(); ///object created
        p1.setColor("Blue");
        System.out.println(p1.color);

        Student s1 = new Student();
        s1.setName("Kaviraj");
        System.out.println(s1.name);
        s1.setrollno(25);
        System.out.println(s1.rollno);

    
    }

        
    }
    class Pen{
        String color;
        int tip;
        void setColor(String newColor){
            color = newColor;
        }
        void setTip(int newTip){
            tip = newTip;
        }
    }
    class Student{
        String name;
        int rollno;
        void setName(String newName){
            name = newName;
        }
        void setrollno(int newrollno){
            rollno = newrollno;
        }
    }
    
    

