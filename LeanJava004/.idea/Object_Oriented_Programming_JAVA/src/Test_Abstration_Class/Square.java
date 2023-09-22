package Test_Abstration_Class;
public class Square extends Geometric_Forms implements Geometric_Type{
    double perimeter, area;
    @Override
    double calc_perimeter(double side1, double side2) {
        perimeter = (side1 + side2)*2;
        return perimeter;
    }

    @Override
    double calc_area(double side1, double side2) {
        area = side1*side1;
        return area;
    }

    @Override
    public void name_of_form(String name){
        System.out.println("This is a " + name);
    }
}
