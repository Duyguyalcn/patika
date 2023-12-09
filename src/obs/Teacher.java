package obs;

public class Teacher {

    //Nitelik/değişken tanımla

    String name;
String mpno;
String branch;


//constructor sınıfı oluştur.constructorlar void,static vs almaz
    Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;


    }
//metot/davranış tanımlarız.
void print(){
    System.out.println("Adı:" + this.name);
    System.out.println("Telefonu:" + this.mpno);
    System.out.println("Bölümü:" + this.branch);




}

















}
