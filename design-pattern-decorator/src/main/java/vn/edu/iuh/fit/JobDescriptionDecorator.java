package vn.edu.iuh.fit;

public abstract class JobDescriptionDecorator implements JobDescription {
    protected JobDescription jobDescription;

    public JobDescriptionDecorator(JobDescription jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public void printJobDetails() {
        jobDescription.printJobDetails();
    }
}
