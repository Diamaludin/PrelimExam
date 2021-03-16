class ShowStudent
{
public static void main (String args[])
{
Student pupil = new Student();
 
pupil.setHours(Integer.parseInt(args[0]));
pupil.setIDnum();
pupil.setPointsA(Integer.parseInt(args[1]));
pupil.showIDnum();
pupil.showPointsA();
pupil.showCHours();
System.out.println("The grade point average is "
+ pupil.getGradePoint());
System.out.println(" ");
 
Student pupil2 = new Student();
pupil2.setCHours(Integer.parseInt(args[2]));
pupil2.setIDnum();
pupil2.setPointsA(Integer.parseInt(args[3]));
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
