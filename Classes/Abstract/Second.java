class Second {
  public static void main(String[] args) {
    Student myObj = new Student();

    System.out.println("My Name: "+ myObj.fname);
    System.out.println("My Age: "+ myObj.age);
    System.out.println("Graduation Year: "+ myObj.graduationYear);
    myObj.study();
  }
}