package obs;
//OGRENCİ BİLGİ SİSTEMİ
public class Course {
    //değişlen/nitelik tanımla
  Teacher teacher; // sınıflar arası nesneyi nitelik olarak atadık.Bu dersin(course) öğretmen atayacağımız için Teacher sınıfınden "teacher" adı verdiğimiz nesneyi atıyoruz.
    String name;
    String code;
    String prefix;
    int note;

    // constructor oluşturalım.Kullandığımız sınıfın adı olur. Cons adı.
    Course(String name,String code,String prefix){

this.name=name;
this.code=code;
this.prefix=prefix;
this.note=0;
    }
 void addTeacher(Teacher teacher) {
     if (teacher.branch.equals(this.prefix)) {
         this.teacher = teacher;
     } else {
         System.out.println("Öğretmen ve ders uyuşmuyor");
     }
 }
void printTeacher(){
     this.teacher.print();


 }
    }

