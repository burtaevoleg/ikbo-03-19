package Lesson_9.Prac.ex2;

public class LabClass {
    private final LabClassUI labClassUi;

    public LabClass() {
        this.labClassUi = new LabClassDriver();
    }

    public LabClassUI getLabClassUi() {
        return labClassUi;
    }
}
