package main;

import Config.ConfigSettings;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigSettings.class);
        VoidEntity voidEntity = context.getBean(VoidEntity.class);
        System.out.println(voidEntity.getName());

        var ent = context.getBean("alty", VoidEntity.class);
        System.out.println(ent.getName());

        var sw = context.getBean(ManSword.class);
        sw.setStatus("Jumon");
        System.out.println(sw.getStatus());


    }
}
