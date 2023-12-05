package org.example;

import org.example.system.SystemController;
import org.example.wiseSaying.WiseSaying;

public class App {

    public static void run() {
        System.out.println("== 명령 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = Container.getSc().nextLine();
            if (command.equals("종료")) {
                SystemController.shutDown();
                break;
            } else if(command.equals("등록")){
                System.out.print("명언 : ");
                String wiseSaying = Container.getSc().nextLine();
                System.out.print("작가 : ");
                String author = Container.getSc().nextLine();

                WiseSaying ws = new WiseSaying(wiseSaying,author);
            }
        }


    }
}
