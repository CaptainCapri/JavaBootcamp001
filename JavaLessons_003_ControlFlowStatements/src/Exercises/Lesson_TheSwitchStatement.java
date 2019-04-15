package Exercises;

public class Lesson_TheSwitchStatement {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }


        //WICHTIG Immer an break; denken, sonst wird alles darunter bis zum nächsten Break oder dem Ende ausgeführt.
        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was: " + switchValue);
                break;
            default :
                System.out.println("Value was not 1 to 5");
                break;
        }

        // More Code here
    }



}
