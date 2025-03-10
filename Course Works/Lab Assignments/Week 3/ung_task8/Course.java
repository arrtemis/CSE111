public class Course {
  public String title, code;
  public String[] syllabus = new String[4];
  public int index = 0;

  public void updateDetails(String courseTitle, String courseCode) {
    title = courseTitle;
    code = courseCode;
  }

  public void printDetails() {
    System.out.println("Course Details: ");
    System.out.println("Course Name: " + title);
    System.out.println("Course Code: " + code);
    System.out.println("Course Syllabus: ");
    if (index != 0) {
      for (int i = 0; i < index; i++) {
        if(i != index -1){
          System.out.print(syllabus[i] + ", ");
        } else {
          System.out.println(syllabus[i]);
        }
      }
    } else {
      System.out.println("No content yet.");
    }
  }

  public void addContent(String content) {
    if(index < syllabus.length) {
      syllabus[index] = content;
      index++;
      System.out.println(content + " was added.");
    } else {
      System.out.println("Cannot add more content.");
    }
  }

  public void addContent(String content1, String content2) {
    addContent(content1);
    addContent(content2);
  }

}
