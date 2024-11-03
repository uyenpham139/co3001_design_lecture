public class StudentController{
    private final Student model;
    private final StudentView view;

	public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        this.model.setName(name);
    }

    public void setRollNo(String rollNo) {
        this.model.setRollNo(rollNo);
    }

    public String getStudentName() {
        return this.model.getName();
    }

    public String getRollNo() {
        return this.model.getRollNo();
    }
    
    public void updateView() {
        this.view.printStudentDetails(this.model.getName(), this.model.getRollNo());
    }

}