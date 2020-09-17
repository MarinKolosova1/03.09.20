package University;

public class Aspirant extends Student{
    String scientificPaper;
    int meritScholarship = 200;
    int basicScholarship = 180;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scientificPaper) {
        super(firstName, lastName, group, averageMark);
        this.scientificPaper = scientificPaper;

    }

    @Override
    int getScholarship(double averageMark, int meritScholarship, int basicScholarship) {
        return super.getScholarship(averageMark, meritScholarship, basicScholarship);
    }
}
