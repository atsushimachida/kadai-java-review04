package animal;

public class Animal {

    private String name;
    private int age;

    //コンストラクタ

    public Animal(){

    }

    //引き数ありコンストラクタ

    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
        }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
        }

    public void setAge(int age) {
        this.age = age;
    }


    public void Say() {
        System.out.println(name + "です。" + age + "歳です。");
    }





}
