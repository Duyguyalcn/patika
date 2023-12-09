package obs;

public class Main {
    public static void main(String[]args) {

      Teacher t1= new Teacher("Mahmut hoca","555","TRH");
      Teacher t2= new Teacher("Graham bell","00000","FZK");
Teacher t3=new Teacher("külyurmaz","1111","BIO");


Course tarih=new Course("Tarih","101","TRH");
tarih.addTeacher(t2);

Course fizik=new Course("fizik","102","FZK");
fizik.addTeacher(t2);
Course biyo=new Course("biyoloji","101","BIO");
biyo.addTeacher(t3);


Student s1=new Student("İnek Şaban","123","4",tarih,fizik,biyo);
s1.addBulkExamNote(100,78,50);
s1.isPass();


Student s2= new Student("güdük necmi","222","4",tarih,fizik,biyo);
s2.addBulkExamNote(30,20,70);
s2.isPass();














    }

}
