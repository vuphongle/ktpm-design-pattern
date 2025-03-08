package vn.edu.iuh.fit;

public class OfficeEmployeeDecorator extends JobDescriptionDecorator {
    public OfficeEmployeeDecorator(JobDescription jobDescription) {
        super(jobDescription);
    }

    @Override
    public void printJobDetails() {
        super.printJobDetails();
        System.out.println("- Xử lý các công việc văn phòng.");
        System.out.println("- Hỗ trợ các bộ phận trong công ty.");
        System.out.println("- Chuẩn bị các tài liệu họp hành.");
    }
}
