public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return super.getSalary() * 1.2;
    }

    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }

    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
}