package no_spring;

public class Hello {
    private String name;

    public Hello() {
        System.out.println("no param init");
    }

    public Hello(String name) {
        System.out.println("param init");
        this.name = name;
    }
    //不对写set方法spring配置文件中对应bean的property会报错
    public void setName(String name) {
        System.out.println("setter");
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello "+name);
    }

    public static class Main {
        public static void main(String[] args) {
            //new对象
            Hello h = new Hello();
            h.setName("no_spring");
            h.sayHello();
        }
    }
}
