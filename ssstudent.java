class Student
{

private int IDnum;
private int Chours;
private int pointsA;
private static int lastStudentID;
 
private void setIDnum()
{
lastStudentID += 1;
IDnumber = lastStudentID;
}
 
private int getIDnum()
{
return IDnumber;
}
 
private void setHours(int number)
{
Chours = number;
}
 
private int getHours()
{
return hours;
}
 
private void setPoints(int number)
{
pointsA = number;
}
 
private int getPoints()
{
return pointsA;
}
 
private void showIDnum()
{
System.out.println("ID Number is: " + IDnum);
}
 
private void showHours()
{
System.out.println("Credit Hours: " + CHours);
}
 
private void showPoints()
{
System.out.println("Points Earned: " + pointsA);
}
 
private double getGradePoint()
{
return (double) (pointsA / Chours);
}
 
}

class ShowStudent
{
public static void main (String args[])
{
Student pupil = new Student();
 
pupil.setchours(Integer.parseInt(args[0]));
pupil.setIDnum();
pupil.setPointsA(Integer.parseInt(args[1]));
pupil.showIDnum();
pupil.showPointsA();
pupil.showHours();
System.out.println("The grade point average is "
+ pupil.getGradePoint());
System.out.println(" ");
 
Student pupil2 = new Student();
pupil2.setCHours(Integer.parseInt(args[2]));
pupil2.setIDnum();
pupil2.setPoints(Integer.parseInt(args[3]));
pupil2.showIDnum();
pupil2.showPointsA();
pupil2.showCHours();
System.out.println("The grade point average is "
+ pupil2.getGradePoint());
System.out.println(" ");
 
Student pupil3 = new Student();
pupil3.setCHours(Integer.parseInt(args[4]));
pupil3.setIDnum();
pupil3.setPointsA(Integer.parseInt(args[5]));
pupil3.showIDnum();
pupil3.showPointsA();
pupil3.showCHours();
System.out.println("The grade point average is "
+ pupil3.getGradePoint());
System.out.println(" ");
}
}
