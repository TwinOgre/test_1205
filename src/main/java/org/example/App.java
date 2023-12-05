package org.example;

public class App {

    public static void run() {
        System.out.println("== 명령 앱 ==");
        while(true){
            System.out.print("명령) ");
            String command = Container.getSc().nextLine();
            if(command.equals("종료")){
                System.out.println("명령앱을 종료합니다.");
                break;
            }
        }


    }
}
